package eu.kanade.tachiyomi.multisrc.kemono

import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.double
import java.text.SimpleDateFormat
import java.util.Locale

@Serializable
class KemonoCreatorDto(
    private val id: String,
    val name: String,
    private val service: String,
    private val updated: JsonPrimitive,
) {
    val updatedDate get() = when {
        updated.isString -> dateFormat.parse(updated.content)?.time ?: 0
        else -> (updated.double * 1000).toLong()
    }

    fun toSManga(baseUrl: String) = SManga.create().apply {
        url = "/$service/user/$id" // should be /server/ for Discord but will be filtered anyway
        title = name
        author = service.serviceName()
        thumbnail_url = "$baseUrl/icons/$service/$id"
        description = Kemono.PROMPT
        initialized = true
    }

    companion object {
        private val dateFormat by lazy { getApiDateFormat() }

        fun String.serviceName() = when (this) {
            "fanbox" -> "Pixiv Fanbox"
            "subscribestar" -> "SubscribeStar"
            "dlsite" -> "DLsite"
            "onlyfans" -> "OnlyFans"
            else -> replaceFirstChar { it.uppercase() }
        }
    }
}

@Serializable
class KemonoPostDto(
    private val id: String,
    private val service: String,
    private val user: String,
    private val title: String,
    private val added: String,
    private val published: String?,
    private val edited: String?,
    private val file: KemonoFileDto,
    private val attachments: List<KemonoAttachmentDto>,
) {
    val images: List<String>
        get() = buildList(attachments.size + 1) {
            file.path?.let { add(it) }
            attachments.mapTo(this) { it.path }
        }.filter {
            when (it.substringAfterLast('.').lowercase()) {
                "png", "jpg", "gif", "jpeg", "webp" -> true
                else -> false
            }
        }.distinct()

    fun toSChapter() = SChapter.create().apply {
        url = "/$service/user/$user/post/$id"
        name = title
        date_upload = dateFormat.parse(edited ?: published ?: added)?.time ?: 0
        chapter_number = -2f
    }

    companion object {
        val dateFormat by lazy { getApiDateFormat() }
    }
}

@Serializable
class KemonoFileDto(val path: String? = null)

@Serializable
class KemonoAttachmentDto(val path: String)

private fun getApiDateFormat() =
    SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.ENGLISH)

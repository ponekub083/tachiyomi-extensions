package eu.kanade.tachiyomi.extension.th.niceoppai

import eu.kanade.tachiyomi.multisrc.madara.Madara
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.network.GET
import org.jsoup.nodes.Element
import okhttp3.Request

class Niceoppai : Madara("Niceoppai", "https://www.niceoppai.net", "th") {
    override val popularMangaUrlSelector = "div.mng_lts_chp div.nde"
    private fun parseMangaFromElement(element: Element): SManga {
        val manga = SManga.create()

        with(element) {
            select(popularMangaUrlSelector +" div.det a").first()?.let {

                manga.setUrlWithoutDomain(it.attr("abs:href"))
                manga.title = it.ownText()

            }

            select(popularMangaUrlSelector +" div.cur img").first()?.let {
                manga.thumbnail_url = imageFromElement(it)
            }

        }

        return manga
    }

    override fun popularMangaFromElement(element: Element) = parseMangaFromElement(element)

    override fun searchMangaFromElement(element: Element) =  parseMangaFromElement(element)
}

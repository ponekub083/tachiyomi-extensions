package eu.kanade.tachiyomi.extension.th.niceoppai

import eu.kanade.tachiyomi.multisrc.madara.Madara
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.network.GET
import org.jsoup.nodes.Element
import okhttp3.Request

class Niceoppai : Madara("Niceoppai", "https://www.niceoppai.net", "th") {
    // private fun pagePath(page: Int) = if (page > 1) "$page/" else ""
    // override fun popularMangaRequest(page: Int): Request = GET("$baseUrl/manga_list/all/any/most-popular/${pagePath(page)}", headers)
    // override fun latestUpdatesRequest(page: Int): Request = GET("$baseUrl/manga_list/all/any/last-updated/${pagePath(page)}", headers)

    override val popularMangaUrlSelector = "div.mng_lts_chp div.nde"
    private fun parseMangaFromElement(element: Element): SManga {
        val manga = SManga.create()

        with(element) {
            select(popularMangaUrlSelector +" div.det a").first()?.let {

                manga.setUrlWithoutDomain(it.attr("abs:href"))
                manga.title = it.ownText()
                // manga.url = manga.url.removePrefix("/manga")

            }

            select(popularMangaUrlSelector +" div.cur img").first()?.let {
                manga.thumbnail_url = imageFromElement(it)
            }

        }

        return manga
    }

    override fun popularMangaFromElement(element: Element) = parseMangaFromElement(element)

    override fun searchMangaFromElement(element: Element) =  parseMangaFromElement(element)



    // override val orderByFilterOptions: Array<String> = arrayOf(
    //     "Name (A-Z)", "Name (Z-A)" , "Last Updated","Oldest Updated", "Most Popular", "Most Popular (Weekly)", "Most Popular (Monthly)","Least Popular","Last Added" "Early Added","Top Rating", "Lowest Rating"
    // )
    

    // override val orderByFilterOptionsValues: Array<String> = arrayOf(
    //     "name-az", "name-za" , "last-updated","oldest-updated", "most-popular","most-popular-weekly","most-popular-monthly","least-popular","last-added","early-added", "top-rating", "lowest-rating"
    // )

    


}

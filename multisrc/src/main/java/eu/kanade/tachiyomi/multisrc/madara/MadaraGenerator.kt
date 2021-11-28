package eu.kanade.tachiyomi.multisrc.madara

import generator.ThemeSourceData.MultiLang
import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

class MadaraGenerator : ThemeSourceGenerator {

    override val themePkg = "madara"

    override val themeClass = "Madara"

    override val baseVersionCode: Int = 12

    override val sources = listOf(
        MultiLang("Leviatan Scans", "https://leviatanscans.com", listOf("en", "es"), className = "LeviatanScansFactory", overrideVersionCode = 9),
        MultiLang("MangaForFree.net", "https://mangaforfree.net", listOf("en", "ko", "all"), isNsfw = true, className = "MangaForFreeFactory", pkgName = "mangaforfree", overrideVersionCode = 1),
        MultiLang("Manhwa18.cc", "https://manhwa18.cc", listOf("en", "ko", "all"), isNsfw = true, className = "Manhwa18CcFactory", pkgName = "manhwa18cc", overrideVersionCode = 1),
        MultiLang("Reaper Scans", "https://reaperscans.com", listOf("en", "pt-BR"), className = "ReaperScansFactory", pkgName = "reaperscans", overrideVersionCode = 3),
        SingleLang("1st Kiss Manga.love", "https://1stkissmanga.love", "en", className = "FirstKissMangaLove"),
        SingleLang("1st Kiss", "https://1stkissmanga.io", "en", className = "FirstKissManga", pkgName = "firstkissmanga", overrideVersionCode = 6),
        SingleLang("1st Kiss Manhua", "https://1stkissmanhua.com", "en", className = "FirstKissManhua", overrideVersionCode = 2),
        SingleLang("1stKissManga.Club", "https://1stkissmanga.club", "en", className = "FirstKissMangaClub"),
        SingleLang("247Manga", "https://247manga.com", "en", className = "Manga247"),
        SingleLang("24hManga", "https://24hmanga.com", "en", isNsfw = true, className = "TwentyFourhManga"),
        SingleLang("24hRomance", "https://24hromance.com", "en", className = "Romance24h"),
        SingleLang("365Manga", "https://365manga.com", "en", className = "ThreeSixtyFiveManga", overrideVersionCode = 1),
        SingleLang("AYATOON", "https://ayatoon.com", "tr", overrideVersionCode = 1),
        SingleLang("Adonis Fansub", "https://manga.adonisfansub.com", "tr", overrideVersionCode = 1),
        SingleLang("Agent of Change Translations", "https://aoc.moe", "en", overrideVersionCode = 1),
        SingleLang("AkuManga", "https://akumanga.com", "ar", overrideVersionCode = 1),
        SingleLang("AllPornComic", "https://allporncomic.com", "en", isNsfw = true),
        SingleLang("Anime Center Scan", "https://animecenterscan.com", "pt-BR", isNsfw = true),
        SingleLang("Aqua Manga", "https://aquamanga.com", "en"),
        SingleLang("Anisa Manga", "https://anisamanga.com", "tr"),
        SingleLang("ApollComics", "https://apollcomics.xyz", "es", overrideVersionCode = 1),
        SingleLang("ArazNovel", "https://www.araznovel.com", "tr", overrideVersionCode = 2),
        SingleLang("Arthur Scan", "https://arthurscan.xyz", "pt-BR", overrideVersionCode = 4),
        SingleLang("Astral Library", "https://www.astrallibrary.net", "en", overrideVersionCode = 2),
        SingleLang("Asura Raw", "https://asuraraw.com", "en", overrideVersionCode = 1),
        SingleLang("Atikrost", "https://atikrost.com", "tr", overrideVersionCode = 1),
        SingleLang("AZManhwa", "https://azmanhwa.net", "en"),
        SingleLang("Azora", "https://azoraworld.com", "ar", overrideVersionCode = 3),
        SingleLang("BL Manhwa Club", "https://blmanhwa.club", "pt-BR", isNsfw = true, className = "BlManhwaClub", overrideVersionCode = 2),
        SingleLang("Block Manga", "https://blockmanga.com", "en"),
        SingleLang("Bakaman", "https://bakaman.net", "th", overrideVersionCode = 1),
        SingleLang("Banana Crítica", "https://cillylovers.com", "pt-BR", isNsfw = true, pkgName = "bananamecanica", className = "BananaCritica", overrideVersionCode = 3),
        SingleLang("BestManga", "https://bestmanga.club", "ru", overrideVersionCode = 1),
        SingleLang("BestManhua", "https://bestmanhua.com", "en", overrideVersionCode = 2),
        SingleLang("BlogManga", "https://blogmanga.net", "en"),
        SingleLang("Boruto Explorer", "https://leitor.borutoexplorer.com.br", "pt-BR"),
        SingleLang("BoysLove", "https://boyslove.me", "en", overrideVersionCode = 2),
        SingleLang("CAT-translator", "https://cat-translator.com", "th", className = "CatTranslator", overrideVersionCode = 1),
        SingleLang("Café com Yaoi", "http://cafecomyaoi.com.br", "pt-BR", pkgName = "cafecomyaoi", className = "CafeComYaoi", isNsfw = true, overrideVersionCode = 1),
        SingleLang("CatOnHeadTranslations", "https://catonhead.com", "en", overrideVersionCode = 1),
        SingleLang("Cerise Scans", "https://cerisescans.com", "pt-BR", overrideVersionCode = 2),
        SingleLang("Cervo Scanlator", "https://cervoscan.xyz", "pt-BR", overrideVersionCode = 4),
        SingleLang("Chibi Manga", "https://www.cmreader.info", "en", overrideVersionCode = 1),
        SingleLang("Clover Manga", "https://clover-manga.com", "tr", overrideVersionCode = 2),
        SingleLang("Colored Manga", "https://coloredmanga.com", "en"),
        SingleLang("ComicKiba", "https://comickiba.com", "en", overrideVersionCode = 1),
        SingleLang("Comicdom", "https://comicdom.org", "en", overrideVersionCode = 1),
        SingleLang("Comichub", "https://comichub.net", "en"),
        SingleLang("Comics Valley", "https://comicsvalley.com", "hi", isNsfw = true, overrideVersionCode = 1),
        SingleLang("ComicsWorld", "https://comicsworld.in", "hi"),
        SingleLang("CopyPasteScan", "https://copypastescan.xyz", "es", overrideVersionCode = 1),
        SingleLang("Cronos Scan", "https://cronosscan.net", "pt-BR"),
        SingleLang("DarkYue Realm", "https://darkyuerealm.site/web", "pt-BR", pkgName = "darkyurealm", overrideVersionCode = 4),
        SingleLang("Decadence Scans", "https://reader.decadencescans.com", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("DiamondFansub", "https://diamondfansub.com", "tr", overrideVersionCode = 1),
        SingleLang("Disaster Scans", "https://disasterscans.com", "en", overrideVersionCode = 2),
        SingleLang("Diskus Scan", "https://diskusscan.com", "pt-BR", overrideVersionCode = 1),
        SingleLang("DoujinHentai", "https://doujinhentai.net", "es", isNsfw = true, overrideVersionCode = 1),
        SingleLang("DragonTea", "https://dragontea.ink", "en", overrideVersionCode = 3),
        SingleLang("DragonTranslation", "https://dragontranslation.com", "es", isNsfw = true, overrideVersionCode = 3),
        SingleLang("Dream Manga", "https://en.ruyamanga.com", "en", overrideVersionCode = 2),
        SingleLang("Drope Scan", "https://dropescan.com", "pt-BR", overrideVersionCode = 4),
        SingleLang("Dream Union Scan", "https://www.dreamunionscan.com", "pt-BR", overrideVersionCode = 1),
        SingleLang("EGY Manga", "https://egymanga.net", "ar"),
        SingleLang("Esomanga", "http://esomanga.com", "tr"),
        SingleLang("Eternal Scans", "https://eternalscans.com", "en"),
        SingleLang("FastManhwa", "https://fastmanhwa.net", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("FDM Scan", "https://fdmscan.com", "pt-BR", overrideVersionCode = 3),
        SingleLang("Final Scans", "https://finalscans.com", "pt-BR", isNsfw = true),
        SingleLang("Fiz Manga", "https://fizmanga.com", "en"),
        SingleLang("Fleur Blanche", "https://fleurscan.com", "pt-BR", isNsfw = true),
        SingleLang("Free Manga", "https://freemanga.me", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("FreeWebtoonCoins", "https://freewebtooncoins.com", "en", overrideVersionCode = 1),
        SingleLang("Fudido Scanlator", "https://fudidoscan.com", "pt-BR", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Fug Manga", "https://fugmanga.net", "ar"),
        SingleLang("Fukushuu no Yuusha", "https://fny-scantrad.com", "fr", overrideVersionCode = 2),
        SingleLang("Furio Scans", "https://furioscans.com", "pt-BR", overrideVersionCode = 4),
        SingleLang("GalaxyDegenScans", "https://gdscan.xyz", "en", overrideVersionCode = 2),
        SingleLang("Gatemanga", "https://gatemanga.com", "ar"),
        SingleLang("Gemanga", "https://gemanga.com", "ar"),
        SingleLang("Glory Scans", "https://gloryscan.com", "pt-BR", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Gogoscans", "https://www.gogoscans.com", "en"),
        SingleLang("GuncelManga", "https://guncelmanga.com", "tr", overrideVersionCode = 1),
        SingleLang("Hades no Fansub", "https://mangareaderpro.com/es", "es"),
        SingleLang("Hades no Fansub Hentai", "https://h.mangareaderpro.com", "es", isNsfw = true),
        SingleLang("Hayalistic", "https://hayalistic.com", "tr"),
        SingleLang("Harimanga", "https://harimanga.com", "en"),
        SingleLang("Hentai20", "https://hentai20.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Hentaidexy", "https://hentaidexy.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Hentai Manga", "https://hentaimanga.me", "en", isNsfw = true),
        SingleLang("HentaiRead", "https://hentairead.com", "en", isNsfw = true, className = "Hentairead", overrideVersionCode = 1),
        SingleLang("HentaiXComic", "https://hentaixcomic.com", "en", isNsfw = true),
        SingleLang("HentaiXYuri", "https://hentaixyuri.com", "en", isNsfw = true),
        SingleLang("HentaiWebtoon", "https://hentaiwebtoon.com", "en", isNsfw = true),
        SingleLang("Heroz Scanlation", "https://herozscans.com", "en", overrideVersionCode = 1),
        SingleLang("Hiperdex", "https://hiperdex.com", "en", isNsfw = true, overrideVersionCode = 5),
        SingleLang("Hizomanga", "https://hizomanga.com", "ar"),
        SingleLang("hManhwa", "https://hmanhwa.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("HM2D", "https://mangadistrict.com/hdoujin", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Hscans", "https://hscans.com", "en", overrideVersionCode = 1),
        SingleLang("Hunter Fansub", "https://hunterfansub.com", "es", overrideVersionCode = 1),
        SingleLang("Ichirin No Hana Yuri", "https://ichirinnohanayuri.com.br", "pt-BR", overrideVersionCode = 3),
        SingleLang("Ikifeng", "https://ikifeng.com", "es", isNsfw = true),
        SingleLang("Immortal Updates", "https://immortalupdates.com", "en", overrideVersionCode = 2),
        SingleLang("Imperfect Comics", "https://imperfectcomic.com", "en", overrideVersionCode = 2),
        SingleLang("Império Scans", "https://imperioscans.com.br", "pt-BR", className = "ImperioScans"),
        SingleLang("InfraFandub", "https://infrafandub.xyz", "es"),
        SingleLang("Inmortal Scan", "https://manga.mundodrama.site", "es"),
        SingleLang("InstaManhwa", "https://www.instamanhwa.com", "en", isNsfw = true),
        SingleLang("IsekaiScan.com", "https://isekaiscan.com", "en", className = "IsekaiScanCom", overrideVersionCode = 4),
        SingleLang("IsekaiScanManga (unoriginal)", "https://isekaiscanmanga.com", "en", className = "IsekaiScanManga", overrideVersionCode = 1),
        SingleLang("Its Your Right Manhua", "https://itsyourightmanhua.com", "en", className = "ItsYourRightManhua", overrideVersionCode = 2),
        SingleLang("JaiminisBox.net", "https://jaiminisbox.net", "en", className = "Jaiminisboxnet"),
        SingleLang("Jiro Comics", "https://jirocomics.com", "en", isNsfw = true),
        SingleLang("Kami Sama Explorer", "https://kamisama.com.br", "pt-BR"),
        SingleLang("KawaScans", "https://kawascans.com", "en"),
        SingleLang("KisekiManga", "https://kisekimanga.com", "en", overrideVersionCode = 1),
        SingleLang("Kissmanga.in", "https://kissmanga.in", "en", className = "KissmangaIn", overrideVersionCode = 2),
        SingleLang("KlikManga", "https://klikmanga.id", "id", overrideVersionCode = 2),
        SingleLang("Kokomanga", "https://kokomanga.com", "en"),
        SingleLang("Kun Manga", "https://kunmanga.com", "en", overrideVersionCode = 1),
        SingleLang("Lara Manga", "https://laramanga.com", "en"),
        SingleLang("Latest Manga", "https://latestmanga.net", "en"),
        SingleLang("Levelerscans", "https://levelerscans.xyz", "en", overrideVersionCode = 1),
        SingleLang("Leviatan Scans X", "https://xxx.leviatanscans.com", "en", isNsfw = true),
        SingleLang("LHTranslation", "https://lhtranslation.net", "en"),
        SingleLang("Lily Manga", "https://lilymanga.com", "en"),
        SingleLang("Lima Scans", "http://limascans.xyz/v2", "pt-BR", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Little Monster Scan", "https://littlemonsterscan.com.br", "pt-BR", overrideVersionCode = 4),
        SingleLang("Lolicon", "https://lolicon.mobi", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Lord Manga", "https://lordmanga.com", "en"),
        SingleLang("LovableSubs", "https://lovablesubs.com", "tr", overrideVersionCode = 1),
        SingleLang("Lumine Scans", "https://luminescans.xyz", "en", overrideVersionCode = 1),
        SingleLang("MadaraDex", "https://madaradx.org", "en", isNsfw = true),
        SingleLang("MG Komik", "https://mgkomik.com", "id", overrideVersionCode = 2),
        SingleLang("MMScans", "https://mm-scans.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Action", "https://mangaaction.com", "en", overrideVersionCode = 2),
        SingleLang("Manga Bin", "https://mangabin.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Chill", "https://mangachill.com", "en", overrideVersionCode = 3),
        SingleLang("Manga Crab", "https://mangacrab.com", "es"),
        SingleLang("Manga District", "https://mangadistrict.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Manga Diyari", "https://manga-diyari.com", "tr", overrideVersionCode = 2),
        SingleLang("Manga Drop Out", "https://www.mangadropout.xyz", "id", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Manga Fenix", "https://manga-fenix.com", "es", overrideVersionCode = 2),
        SingleLang("Manga Funny", "https://mangafunny.com", "en"),
        SingleLang("Manga Hentai", "https://mangahentai.me", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Manga Hero", "https://mangahero.xyz", "en", overrideVersionCode = 2),
        SingleLang("Manga Kio", "https://mangakio.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Manga Kiss", "https://mangakiss.org", "en", overrideVersionCode = 1),
        SingleLang("Manga Land Arabic", "https://mangalandarabic.com", "ar", overrideVersionCode = 2),
        SingleLang("Manga Leveling", "https://mangaleveling.com", "en"),
        SingleLang("Manga Lord", "https://mangalord.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Mitsu", "https://mangamitsu.com", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Manga Mix", "https://mangamix.me", "ar"),
        SingleLang("Manga Nine", "https://manganine.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Online Team", "https://mangaonlineteam.com", "en"),
        SingleLang("Manga Oubarab", "https://mangaoubarab.com", "ar"),
        SingleLang("Manga Queen", "https://mangaqueen.net", "en"),
        SingleLang("Manga Read", "https://mangaread.co", "en", overrideVersionCode = 1),
        SingleLang("Manga Rock Team", "https://mangarockteam.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Rocky", "https://mangarocky.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Sky", "https://mangasky.net", "en"),
        SingleLang("Manga SY", "https://www.mangasy.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Starz", "https://mangastarz.com", "ar", overrideVersionCode = 1),
        SingleLang("Manga Too", "https://mangatoo.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Weebs", "https://mangaweebs.in", "en", overrideVersionCode = 5),
        SingleLang("Manga-Online.co", "https://www.manga-online.co", "th", className = "MangaOnlineCo"),
        SingleLang("Manga-Scantrad", "https://manga-scantrad.net", "fr", className = "MangaScantrad", overrideVersionCode = 2),
        SingleLang("Manga18 Fx", "https://manga18fx.com", "en", overrideVersionCode = 1),
        SingleLang("Manga1st", "https://manga1st.com", "en", overrideVersionCode = 1),
        SingleLang("Manga1st.online", "https://manga1st.online", "en", className = "MangaFirstOnline", overrideVersionCode = 1),
        SingleLang("Manga347", "https://manga347.com", "en", overrideVersionCode = 3),
        SingleLang("Manga3S", "https://manga3s.com", "en", overrideVersionCode = 3),
        SingleLang("Manga47", "https://manga47.net", "en", overrideVersionCode = 1),
        SingleLang("Manga4All", "https://manga4all.net", "en", overrideVersionCode = 3),
        SingleLang("Manga68", "https://manga68.com", "en", overrideVersionCode = 1),
        SingleLang("Manga68.net", "https://manga68.net", "en", className = "Manga68net"),
        SingleLang("MangaBob", "https://mangabob.com", "en", overrideVersionCode = 1),
        SingleLang("MangaBoss", "https://mangaboss.org", "en"),
        SingleLang("MangaBox", "https://mangabox.org", "en"),
        SingleLang("MangaClash", "https://mangaclash.com", "en", overrideVersionCode = 3),
        SingleLang("MangaCultivator", "https://mangacultivator.com", "en", overrideVersionCode = 2),
        SingleLang("MangaCV", "https://mangacv.com", "en", isNsfw = true),
        SingleLang("MangaDrago", "https://mangadrago.com", "en"),
        SingleLang("MangaDods", "https://www.mangadods.com", "en", overrideVersionCode = 2),
        SingleLang("MangaEffect", "https://mangaeffect.com", "en", overrideVersionCode = 1),
        SingleLang("Mangaforfree.com", "https://mangaforfree.com", "en", isNsfw = true, className = "Mangaforfreecom"),
        SingleLang("Manga-fast.com", "https://manga-fast.com", "en", className = "Mangafastcom", overrideVersionCode = 3),
        SingleLang("MangaFort", "https://mangafort.com", "en", overrideVersionCode = 1),
        SingleLang("MangaFoxFull", "https://mangafoxfull.com", "en"),
        SingleLang("MangaGG", "https://mangagg.com", "en", overrideVersionCode = 2),
        SingleLang("MangaGreat", "https://mangagreat.com", "en", overrideVersionCode = 1),
        SingleLang("MangaHZ", "https://www.mangahz.com", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("MangaKitsune", "https://mangakitsune.com", "en", isNsfw = true, overrideVersionCode = 4),
        SingleLang("MangaKomi", "https://mangakomi.com", "en", overrideVersionCode = 4),
        SingleLang("MangaLime", "https://mangalime.com", "en"),
        SingleLang("MangaLionz", "https://mangalionz.com", "ar"),
        SingleLang("MangaManhua", "https://mangamanhua.online", "en", overrideVersionCode = 1),
        SingleLang("MangaMe", "https://mangame.org", "en", overrideVersionCode = 1),
        SingleLang("MangaMG", "https://mangamg.com", "en"),
        SingleLang("MangaMoli", "https://mangamoli.com", "en"),
        SingleLang("Manganato.info", "https://manganato.info", "en", className = "Manganatoinfo"),
        SingleLang("MangaPL", "https://mangapl.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("MangaRead.org", "https://www.mangaread.org", "en", className = "MangaReadOrg", overrideVersionCode = 1),
        SingleLang("MangaRex", "https://mangarex.co", "en"),
        SingleLang("Mangas18", "https://mangas18.com", "en"),
        SingleLang("MangaSco", "https://mangasco.com", "en", overrideVersionCode = 1),
        SingleLang("MangaSmile", "https://mangasmile.com", "en", overrideVersionCode = 1),
        SingleLang("MangaSpark", "https://mangaspark.com", "ar", overrideVersionCode = 1),
        SingleLang("MangaStein", "https://mangastein.com", "tr", overrideVersionCode = 1),
        SingleLang("MangaStic", "https://mangastic.com", "en"),
        SingleLang("MangaTone", "https://mangatone.com", "en"),
        SingleLang("MangaTop1", "https://mangatop1.com", "en"),
        SingleLang("MangaToRead", "https://mangatoread.com", "en"),
        SingleLang("MangaTK", "https://mangatk.com", "en"),
        SingleLang("MangaTX", "https://mangatx.com", "en", overrideVersionCode = 1),
        SingleLang("Manga-TX", "https://manga-tx.com", "en", className = "Mangatxunoriginal"),
        SingleLang("MangaTeca", "https://www.mangateca.com", "pt-BR", overrideVersionCode = 3),
        SingleLang("MangaTuli", "https://mangatuli.com", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("MangaUS", "https://mangaus.xyz", "en", overrideVersionCode = 2),
        SingleLang("MangaWise", "https://mangawise.com", "en"),
        SingleLang("MangaWT", "https://mangawt.com", "tr", overrideVersionCode = 1),
        SingleLang("MangaX1", "https://mangax1.com", "en"),
        SingleLang("MangaX18", "https://mangax18.com", "en", isNsfw = true),
        SingleLang("MangaXP", "https://mangaxp.com", "en", overrideVersionCode = 1),
        SingleLang("MangaYami", "https://www.mangayami.club", "en", overrideVersionCode = 2),
        SingleLang("Mangaka3rb", "https://mangaka3rb.com", "ar"),
        SingleLang("Mangakik", "https://mangakik.com", "en"),
        SingleLang("Mangas Origines", "https://mangas-origines.fr", "fr", true, overrideVersionCode = 2),
        SingleLang("Mangasushi", "https://mangasushi.net", "en", overrideVersionCode = 2),
        SingleLang("Mangauptocats", "https://mangauptocats.online", "th", overrideVersionCode = 2),
        SingleLang("Mangazuki.me", "https://mangazuki.me", "en", className = "MangazukiMe", overrideVersionCode = 1),
        SingleLang("Mangceh", "https://mangceh.me", "id", isNsfw = true, overrideVersionCode = 3),
        SingleLang("Manhua Dragon", "https://manhuadragon.com", "en"),
        SingleLang("Manhua ES", "https://manhuaes.com", "en", overrideVersionCode = 5),
        SingleLang("Manhua Plus", "https://manhuaplus.com", "en", overrideVersionCode = 5),
        SingleLang("Manhua SY", "https://www.manhuasy.com", "en", overrideVersionCode = 1),
        SingleLang("ManhuaBox", "https://manhuabox.net", "en", overrideVersionCode = 2),
        SingleLang("ManhuaChill", "https://manhuachill.com", "en"),
        SingleLang("ManhuaComic", "https://manhuacomic.com", "en"),
        SingleLang("MangaDeemak", "https://mangadeemak.com", "th"),
        SingleLang("ManhuaDex", "https://manhuadex.com", "en", overrideVersionCode = 1),
        SingleLang("ManhuaFast", "https://manhuafast.com", "en", overrideVersionCode = 1),
        SingleLang("ManhuaHot", "https://manhuahot.com", "en"),
        SingleLang("ManhuaPro", "https://manhuapro.com", "en", overrideVersionCode = 2),
        SingleLang("ManhuaToon", "https://manhuatoon.com", "en"),
        SingleLang("ManhuaUS", "https://manhuaus.com", "en", overrideVersionCode = 3),
        SingleLang("ManhuaZone", "https://manhuazone.com", "en"),
        SingleLang("Manhuaga", "https://manhuaga.com", "en", overrideVersionCode = 1),
        SingleLang("Manhualo", "https://manhualo.com", "en", overrideVersionCode = 1),
        SingleLang("Manhuas.net", "https://manhuas.net", "en", className = "Manhuasnet", overrideVersionCode = 2),
        SingleLang("Manhwa Raw", "https://manhwaraw.com", "ko", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Manhwaraw.net", "https://manhwaraw.net", "en", className = "Manhwarawnet"),
        SingleLang("Manhwa365", "https://manhwa365.com", "en", isNsfw = true),
        SingleLang("Manhwa18.app", "https://manhwa18.app", "en", isNsfw = true, className = "Manhwa18app"),
        SingleLang("Manhwa18.org", "https://manhwa18.org", "en", isNsfw = true, className = "Manhwa18Org", overrideVersionCode = 1),
        SingleLang("Manhwa68", "https://manhwa68.com", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Manhwa.biz", "https://manhwa.biz", "en", isNsfw = true, className = "Manhwabiz"),
        SingleLang("ManhwaBookShelf", "https://manhwabookshelf.com", "en"),
        SingleLang("Manhwafull", "https://manhwafull.com", "en"),
        SingleLang("ManhwaNelo", "https://manhwanelo.com", "en", overrideVersionCode = 2),
        SingleLang("ManhwaPool", "https://manhwapool.com", "en"),
        SingleLang("Manhwatop", "https://manhwatop.com", "en", overrideVersionCode = 1),
        SingleLang("ManhwaTime", "https://manhwatime.com", "ar"),
        SingleLang("Manhwahentai.me", "https://manhwahentai.me", "en", className = "ManhwahentaiMe", isNsfw = true, overrideVersionCode = 2),
        SingleLang("ManhwaWorld", "https://manhwaworld.com", "en"),
        SingleLang("ManhwaXZ", "https://manhwaxz.com", "en"),
        SingleLang("Manhwua.fans", "https://manhwua.fans", "en", isNsfw = true, className = "Manhwuafans"),
        SingleLang("ManyToon", "https://manytoon.com", "en", isNsfw = true, overrideVersionCode = 4),
        SingleLang("ManyToon.me", "https://manytoon.me", "en", isNsfw = true, className = "ManyToonMe", overrideVersionCode = 3),
        SingleLang("ManyToonClub", "https://manytoon.club", "ko", isNsfw = true, overrideVersionCode = 1),
        SingleLang("ManyComic", "https://manycomic.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Mark Scans", "https://markscans.online", "pt-BR", overrideVersionCode = 3),
        SingleLang("MHentais", "https://mhentais.com", "pt-BR", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Mhmanga", "https://mhmanga.com", "en"),
        SingleLang("Midnight Mess Scans", "https://midnightmess.org", "en", isNsfw = true, overrideVersionCode = 5),
        SingleLang("Milftoon", "https://milftoon.xxx", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("MiniTwo Scan", "https://minitwoscan.com", "pt-BR"),
        SingleLang("Mirad Scanlator", "https://miradscanlator.site", "pt-BR"),
        SingleLang("Mixed Manga", "https://mixedmanga.com", "en", overrideVersionCode = 1),
        SingleLang("Mode Scanlator", "https://modescanlator.com", "pt-BR", overrideVersionCode = 2),
        SingleLang("Momo no Hana Scan", "https://momonohanascan.com", "pt-BR", className = "MomoNoHanaScan"),
        SingleLang("Moon Witch In Love", "https://moonwitchinlove.com", "pt-BR", overrideVersionCode = 1),
        SingleLang("Mortals Groove", "https://mortalsgroove.com", "en"),
        SingleLang("Muctau", "https://muctau.com", "en"),
        SingleLang("Mystical Merries", "https://mysticalmerries.com", "en", overrideVersionCode = 2),
        SingleLang("MyKomiks", "https://mykomiks.fun", "en"),
        SingleLang("NeatManga", "https://neatmanga.com", "en", overrideVersionCode = 2),
        SingleLang("NekoScan", "https://nekoscan.com", "en", overrideVersionCode = 2),
        SingleLang("NekoBreaker Scan", "https://nekobreakerscan.com", "pt-BR", overrideVersionCode = 1),
        SingleLang("Neox Scanlator", "https://neoxscans.net", "pt-BR", overrideVersionCode = 8),
        SingleLang("NeoXXX Scans", "https://xxx.neoxscans.net", "pt-BR", isNsfw = true, overrideVersionCode = 3),
        SingleLang("Night Comic", "https://www.nightcomic.com", "en", overrideVersionCode = 1),
        SingleLang("Niji Translations", "https://niji-translations.com", "ar"),
        SingleLang("Ninja Scan", "https://ninjascan.xyz", "pt-BR"),
        SingleLang("Ninjavi", "https://ninjavi.com", "ar", overrideVersionCode = 1),
        SingleLang("Nitro Scans", "https://nitroscans.com", "en"),
        SingleLang("NovelMic", "https://novelmic.com", "en", overrideVersionCode = 1),
        SingleLang("Novels Town", "https://novelstown.cyou", "ar"),
        SingleLang("Oh No Manga", "https://ohnomanga.com", "en", isNsfw = true),
        SingleLang("Olho da Lua", "https://olhodalua.xyz", "pt-BR", className = "OlhoDaLua", overrideVersionCode = 1),
        SingleLang("Origami Orpheans", "https://origami-orpheans.com.br", "pt-BR", overrideVersionCode = 3),
        SingleLang("Ow Scan", "https://owscan.com", "pt-BR"),
        SingleLang("OTksScanlator", "https://otkscanlator.xyz", "pt-BR", isNsfw = true, className = "OtksScanlator"),
        SingleLang("Paean Scans", "https://paeanscans.com", "en", overrideVersionCode = 1),
        SingleLang("Painful Nightz Scan", "https://painfulnightzscan.com", "en"),
        SingleLang("Platinum Crown", "https://platinumscans.com", "en", overrideVersionCode = 1),
        SingleLang("Pojok Manga", "https://pojokmanga.com", "id", overrideVersionCode = 3),
        SingleLang("PoManga", "https://pomanga.com", "en"),
        SingleLang("PornComix", "https://www.porncomixonline.net", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Pornwha", "https://pornwha.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Prisma Scans", "https://prismascans.net", "pt-BR", overrideVersionCode = 2),
        SingleLang("Projeto Scanlator", "https://projetoscanlator.com", "pt-BR", overrideVersionCode = 3),
        SingleLang("QueensManga ملكات المانجا", "https://queensmanga.com", "ar", className = "QueensManga", overrideVersionCode = 1),
        SingleLang("Rachel Scanlator", "https://rachelscanlator.com", "pt-BR", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Random Scan", "https://randomscan.online", "pt-BR", overrideVersionCode = 4),
        SingleLang("Random Translations", "https://randomtranslations.com", "en", overrideVersionCode = 1),
        SingleLang("Raw Mangas", "https://rawmangas.net", "ja", isNsfw = true, overrideVersionCode = 1),
        SingleLang("RawDEX", "https://rawdex.net", "ko", isNsfw = true, overrideVersionCode = 1),
        SingleLang("ReadAdult", "https://readadult.net", "en", isNsfw = true),
        SingleLang("ReadManhua", "https://readmanhua.net", "en", overrideVersionCode = 2),
        SingleLang("Red Ribbon Scanlator", "https://redribbon.site", "pt-BR", overrideVersionCode = 1),
        SingleLang("Renascence Scans (Renascans)", "https://new.renascans.com", "en", className = "RenaScans", overrideVersionCode = 1),
        SingleLang("Reset Scans", "https://reset-scans.com", "en", overrideVersionCode = 5),
        SingleLang("Rh2PlusManga", "https://www.rh2plusmanga.com", "th", overrideVersionCode = 3),
        SingleLang("Rüya Manga", "https://www.ruyamanga.com", "tr", className = "RuyaManga", overrideVersionCode = 1),
        SingleLang("S2Manga", "https://s2manga.com", "en", overrideVersionCode = 1),
        SingleLang("SISI GELAP", "https://sigel.xyz", "id", overrideVersionCode = 3),
        SingleLang("SamuraiScan", "https://samuraiscan.com", "es"),
        SingleLang("Sani-Go", "https://sani-go.net", "ar", className = "SaniGo", overrideVersionCode = 1),
        SingleLang("Sawamics", "https://sawamics.com", "en"),
        SingleLang("Scanlator Hunters", "https://scanlatorhunters.xyz", "pt-BR", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Scans Raw", "https://scansraw.com", "en", overrideVersionCode = 1),
        SingleLang("Seafoam Scans", "https://seafoamscans.com", "en", overrideVersionCode = 2),
        SingleLang("Seikou Scans", "https://seikouscans.com", "pt-BR", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Sensaina Yuri", "https://sensainayuri.dropescan.com", "pt-BR", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Setsu Scans", "https://setsuscans.com", "en", overrideVersionCode = 2),
        SingleLang("Shield Manga", "https://shieldmanga.club", "en", overrideVersionCode = 2),
        SingleLang("ShinobiScans", "https://shinobiscans.com", "it"),
        SingleLang("ShoujoHearts", "https://shoujohearts.com", "en", overrideVersionCode = 2),
        SingleLang("SiXiang Scans", "http://www.sixiangscans.com", "en", overrideVersionCode = 1),
        SingleLang("Sindria Scanlator", "https://sindriascanlator.com", "pt-BR"),
        SingleLang("Sinensis", "https://sinensisscan.com", "pt-BR", overrideVersionCode = 1),
        SingleLang("Siyahmelek", "https://siyahmelek.net", "tr", isNsfw = true, overrideVersionCode = 3),
        SingleLang("Skymanga", "https://skymanga.co", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("SkyRaws", "https://skyraws.com", "en", overrideVersionCode = 1),
        SingleLang("Sleeping Knight Scans", "https://skscans.com", "en", overrideVersionCode = 2),
        SingleLang("Sleepy Translations", "https://sleepytranslations.com", "en", overrideVersionCode = 1),
        SingleLang("Smash Scan", "https://smashscan.com.br", "pt-BR"),
        SingleLang("SodaScan", "https://sodascan.xyz", "pt-BR", isNsfw = true),
        SingleLang("Solo Leveling", "https://readsololeveling.online", "en"),
        SingleLang("StageComics", "https://stagecomics.com", "pt-BR", overrideVersionCode = 3),
        SingleLang("Sugar Babies", "https://sugarbbscan.com", "en", overrideVersionCode = 2),
        SingleLang("Sunshine Butterfly Scans", "https://sunshinebutterflyscan.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Sweet Time Scan", "https://sweetscan.net", "pt-BR", overrideVersionCode = 2),
        SingleLang("TappyToon.Net", "https://tappytoon.net", "en", className = "Tappytoonnet"),
        SingleLang("Tatakae Scan", "https://tatakaescan.xyz", "pt-BR", isNsfw = true),
        SingleLang("TeenManhua", "https://teenmanhua.com", "en"),
        SingleLang("TheFluffyHangoutGroup", "https://www.fluffyhangout.club", "en", overrideVersionCode = 2),
        SingleLang("The Guild", "https://theguildscans.com", "en"),
        SingleLang("Three Queens Scanlator", "https://tqscan.com.br", "pt-BR", overrideVersionCode = 3),
        SingleLang("Time Naight", "https://timenaight.com", "tr"),
        SingleLang("Todaymic", "https://todaymic.com", "en", overrideVersionCode = 1),
        SingleLang("ToonGod", "https://www.toongod.com", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Toonily", "https://toonily.com", "en", isNsfw = true, overrideVersionCode = 5),
        SingleLang("Toonily.net", "https://toonily.net", "en", isNsfw = true, className = "Toonilynet", overrideVersionCode = 2),
        SingleLang("ToonMany", "https://toonmany.com", "en", isNsfw = true),
        SingleLang("Top Manhua", "https://topmanhua.com", "en", overrideVersionCode = 1),
        SingleLang("TreeManga", "https://treemanga.com", "en", overrideVersionCode = 1),
        SingleLang("TritiniaScans", "https://tritinia.com", "en", overrideVersionCode = 1),
        SingleLang("Tsundoku Traduções", "https://tsundokutraducoes.com.br", "pt-BR", pkgName = "tsundokutraducoes", className = "TsundokuTraducoes", overrideVersionCode = 3),
        SingleLang("TuManga.net", "https://tumanga.net", "es", className = "TuMangaNet"),
        SingleLang("Twilight Scans", "https://twilightscans.com", "en", overrideVersionCode = 1),
        SingleLang("Türkçe Manga", "https://turkcemanga.com", "tr", className = "TurkceManga", overrideVersionCode = 1),
        SingleLang("Ultralight Scans", "https://readlight.org", "en"),
        SingleLang("Unemployed Scans", "https://unemployedscans.com", "en", overrideVersionCode = 1),
        SingleLang("Uyuyan Balik", "https://uyuyanbalik.com", "tr", overrideVersionCode = 1),
        SingleLang("Vanguard Bun", "https://vanguardbun.com", "en", overrideVersionCode = 1),
        SingleLang("Visbellum", "https://visbellum.com", "pt-BR", overrideVersionCode = 2),
        SingleLang("Volkan Scans", "https://volkanscans.com", "en", overrideVersionCode = 1),
        SingleLang("Wakamics", "https://wakamics.net", "en"),
        SingleLang("Wakascan", "https://wakascan.com", "fr", overrideVersionCode = 1),
        SingleLang("War Queen Scan", "https://wqscan.com.br", "pt-BR", overrideVersionCode = 5),
        SingleLang("WD Scans (Wicked Dragon Scans)", "https://wdscans.com", "en", className = "WDScans"),
        SingleLang("WebNovel", "https://webnovel.live", "en", className = "WebNovelLive", overrideVersionCode = 3),
        SingleLang("WebToon18", "http://webtoon18.net", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("WebToon69", "https://webtoon18.com", "en", isNsfw = true),
        SingleLang("WebToonily", "https://webtoonily.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Webtoon Hatti", "https://webtoonhatti.com", "tr"),
        SingleLang("WebtoonScan", "https://webtoonscan.com", "en", isNsfw = true),
        SingleLang("WebtoonsTOP", "https://webtoons.top", "en", isNsfw = true),
        SingleLang("WebtoonUK", "https://webtoon.uk", "en", overrideVersionCode = 2),
        SingleLang("WebtoonXYZ", "https://www.webtoon.xyz", "en", isNsfw = true, overrideVersionCode = 3),
        SingleLang("Winter Scan", "https://winterscan.com.br", "pt-BR", overrideVersionCode = 3),
        SingleLang("Wonderland", "https://landwebtoons.site", "pt-BR", overrideVersionCode = 3),
        SingleLang("WoopRead", "https://woopread.com", "en", overrideVersionCode = 1),
        SingleLang("WuxiaWorld", "https://wuxiaworld.site", "en", overrideVersionCode = 1),
        SingleLang("XManga", "https://xmanga.io", "en", isNsfw = true),
        SingleLang("XuN Scans", "https://xunscans.xyz", "en", overrideVersionCode = 2),
        SingleLang("Yaoi Hentai", "https://yaoihentai.me", "en", isNsfw = true),
        SingleLang("YaoiScan", "https://yaoiscan.com", "en", isNsfw = true),
        SingleLang("YaoiToon", "https://yaoitoon.com", "en", isNsfw = true),
        SingleLang("Yaoi.mobi", "https://yaoi.mobi", "en", isNsfw = true, className = "YaoiManga", pkgName = "yaoimanga", overrideVersionCode = 4),
        SingleLang("Yaoi Toshokan", "https://yaoitoshokan.net", "pt-BR", isNsfw = true, overrideVersionCode = 3),
        SingleLang("Yuri Verso", "https://yuri.live", "pt-BR", overrideVersionCode = 3),
        SingleLang("Zinmanga", "https://zinmanga.com", "en"),
        SingleLang("Zinmanhwa", "https://zinmanhwa.com", "en"),
        SingleLang("ZuttoManga", "https://zuttomanga.com", "en"),
        SingleLang("شبكة كونان العربية", "https://manga.detectiveconanar.com", "ar", className = "DetectiveConanAr", overrideVersionCode = 2),
        SingleLang("مانجا العاشق", "https://3asq.org", "ar", className = "Manga3asq", overrideVersionCode = 2),
        SingleLang("مانجا عرب تيم Manga Arab Team", "https://mangaarbteam.com", "ar", className = "MangaArabTeam", overrideVersionCode = 1),
        SingleLang("مانجا ليك", "https://mangalek.com", "ar", className = "Mangalek", overrideVersionCode = 1),
        SingleLang("مانجا لينك", "https://mangalink.io", "ar", className = "MangaLinkio", overrideVersionCode = 2),
        SingleLang("Manga Weeaboo", "https://mangaweeaboo.com", "en", overrideVersionCode = 1),
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MadaraGenerator().createAll()
        }
    }
}

package pl.allegro.finance.tradukisto.internal.languages.azerbaijani

import pl.allegro.finance.tradukisto.internal.languages.AbstractIntegerValuesTest

import static pl.allegro.finance.tradukisto.internal.Container.azerbaijaniContainer

class AzerbaijaniIntegerValuesTest extends AbstractIntegerValuesTest {

    def setup() {
        intConverter = azerbaijaniContainer().getIntegerConverter()
    }

    @Override
    IntegerValuesTestData getTestData() {
        testData = new IntegerValuesTestData(integerTranslations)
    }

    private static integerTranslations = [
            0            : "sıfır",
            1            : "bir",
            2            : "iki",
            3            : "üç",
            4            : "dörd",
            5            : "beş",
            6            : "altı",
            7            : "yeddi",
            8            : "səkkiz",
            9            : "doqquz",
            11           : "on bir",
            12           : "on iki",
            13           : "on üç",
            14           : "on dörd",
            15           : "on beş",
            16           : "on altı",
            17           : "on yeddi",
            18           : "on səkkiz",
            19           : "on doqquz",
            10           : "on",
            20           : "iyirmi",
            30           : "otuz",
            40           : "qırx",
            50           : "əlli",
            60           : "altmış",
            70           : "yetmiş",
            80           : "səksən",
            90           : "doxsan",
            21           : "iyirmi bir",
            37           : "otuz yeddi",
            43           : "qırx üç",
            58           : "əlli səkkiz",
            69           : "altmış doqquz",
            76           : "yetmiş altı",
            82           : "səksən iki",
            95           : "doxsan beş",
            100          : "yüz",
            200          : "iki yüz",
            300          : "üç yüz",
            400          : "dörd yüz",
            500          : "beş yüz",
            600          : "altı yüz",
            700          : "yeddi yüz",
            800          : "səkkiz yüz",
            900          : "doqquz yüz",
            111          : "yüz on bir",
            272          : "iki yüz yetmiş iki",
            387          : "üç yüz səksən yeddi",
            448          : "dörd yüz qırx səkkiz",
            569          : "beş yüz altmış doqquz",
            625          : "altı yüz iyirmi beş",
            782          : "yeddi yüz səksən iki",
            895          : "səkkiz yüz doxsan beş",
            999          : "doqquz yüz doxsan doqquz",
            1_000        : "bir min",
            2_000        : "iki min",
            3_000        : "üç min",
            4_000        : "dörd min",
            5_000        : "beş min",
            7_634        : "yeddi min altı yüz otuz dörd",
            11_000       : "on bir min",
            15_000       : "on beş min",
            21_000       : "iyirmi bir min",
            24_190       : "iyirmi dörd min yüz doxsan",
            51_000       : "əlli bir min",
            481_000      : "dörd yüz səksən bir min",
            653_000      : "altı yüz əlli üç min",
            123_454      : "yüz iyirmi üç min dörd yüz əlli dörd",
            700_000      : "yeddi yüz min",
            999_999      : "doqquz yüz doxsan doqquz min doqquz yüz doxsan doqquz",
            1_000_000    : "bir milyon",
            2_000_000    : "iki milyon",
            5_000_000    : "beş milyon",
            23_437_219   : "iyirmi üç milyon dörd yüz otuz yeddi min iki yüz on doqquz",
            100_000_000  : "yüz milyon",
            121_000_000  : "yüz iyirmi bir milyon",
            123_456_789  : "yüz iyirmi üç milyon dörd yüz əlli altı min yeddi yüz səksən doqquz",
            322_089_890  : "üç yüz iyirmi iki milyon səksən doqquz min səkkiz yüz doxsan",
            1_000_000_000: "bir milyard",
            2_147_483_647: "iki milyard yüz qırx yeddi milyon dörd yüz səksən üç min altı yüz qırx yeddi"
    ]
}

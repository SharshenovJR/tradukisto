package pl.allegro.finance.tradukisto.internal.languages.azerbaijani

import pl.allegro.finance.tradukisto.internal.languages.AbstractLongValuesTest

import static pl.allegro.finance.tradukisto.internal.Container.azerbaijaniContainer

class AzerbaijaniLongIntegerValuesTest  extends AbstractLongValuesTest {

    def setup() {
        longConverter = azerbaijaniContainer().getLongConverter()
    }

    @Override
    LongValuesTestData getTestData() {
        testData = new LongValuesTestData(longTranslations)
    }

    private static longTranslations = [
            5_000_000_000            : "beş milyard",

            1_000_000_000_000        : "bir trilyon",
            2_000_000_000_000        : "iki trilyon",
            5_000_000_000_000        : "beş trilyon",

            1_000_000_000_000_000    : "bir kvadrilyon",
            2_000_000_000_000_000    : "iki kvadrilyon",
            5_000_000_000_000_000    : "beş kvadrilyon",

            1_000_000_000_000_000_000: "bir kvintilyon",
            2_000_000_000_000_000_000: "iki kvintilyon",
            (Long.MAX_VALUE)         : "doqquz kvintilyon iki yüz iyirmi üç kvadrilyon üç yüz yetmiş iki trilyon otuz altı milyard səkkiz yüz əlli dörd milyon yeddi yüz yetmiş beş min səkkiz yüz yeddi"
    ]
}

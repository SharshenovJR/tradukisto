package pl.allegro.finance.tradukisto.internal.languages.azerbaijani;

import pl.allegro.finance.tradukisto.internal.BaseValues;
import pl.allegro.finance.tradukisto.internal.languages.GenderForms;
import pl.allegro.finance.tradukisto.internal.languages.PluralForms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static pl.allegro.finance.tradukisto.internal.support.BaseNumbersBuilder.baseNumbersBuilder;

public class AzerbaijaniValues implements BaseValues {

    @Override
    public Map<Integer, GenderForms> baseNumbers() {
        return baseNumbersBuilder()
                .put(0, "sıfır")
                .put(1, "bir")
                .put(2, "iki")
                .put(3, "üç")
                .put(4, "dörd")
                .put(5, "beş")
                .put(6, "altı")
                .put(7, "yeddi")
                .put(8, "səkkiz")
                .put(9, "doqquz")
                .put(10, "on")
                .put(11, "on bir")
                .put(12, "on iki")
                .put(13, "on üç")
                .put(14, "on dörd")
                .put(15, "on beş")
                .put(16, "on altı")
                .put(17, "on yeddi")
                .put(18, "on səkkiz")
                .put(19, "on doqquz")
                .put(20, "iyirmi")
                .put(30, "otuz")
                .put(40, "qırx")
                .put(50, "əlli")
                .put(60, "altmış")
                .put(70, "yetmiş")
                .put(80, "səksən")
                .put(90, "doxsan")
                .put(100, "yüz")
                .put(200, "iki yüz")
                .put(300, "üç yüz")
                .put(400, "dörd yüz")
                .put(500, "beş yüz")
                .put(600, "altı yüz")
                .put(700, "yeddi yüz")
                .put(800, "səkkiz yüz")
                .put(900, "doqquz yüz")
                .build();
    }

    @Override
    public List<PluralForms> pluralForms() {
        return Arrays.asList(
                new AzerbaijaniPluralForms(""),
                new AzerbaijaniPluralForms("min"),
                new AzerbaijaniPluralForms("milyon"),
                new AzerbaijaniPluralForms("milyard"),
                new AzerbaijaniPluralForms("trilyon"),
                new AzerbaijaniPluralForms("kvadrilyon"),
                new AzerbaijaniPluralForms("kvintilyon")
        );
    }

    @Override
    public String currency() {
        return "AZN";
    }

    @Override
    public char twoDigitsNumberSeparator() {
        return ' ';
    }
}

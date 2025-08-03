package ru.fivan.StreamAPI_Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StremClassExsample2 {
    public static void main(String[] args) {
        List<String> email = Arrays.asList("ivanov_87@mail.ru", "petrov_sergei@yandex.ru", "svetlana_kuznetsova@gmail.com", "kostya_morozov@bk.ru", "alexey.klimenko@inbox.ru", "irina_smirnova@yahoo.com", "nikolay.vasilev@rambler.ru", "maria_gromova@list.ru", "danil_sokolov@tut.by", "oleg_borisov@outlook.com", "ivanov_87@mail.ru", "kostya_morozov@bk.ru", "alexey.klimenko@inbox.ru");
        List<String> uniq = email.stream().distinct().collect(Collectors.toList());
        System.out.println(uniq.size());
        System.out.println(uniq);
        System.out.println(email.size());

        List<String> gmails = uniq.stream().filter(x ->x.endsWith("mail.ru")).collect(Collectors.toList());
        System.out.println(gmails);

    }
}

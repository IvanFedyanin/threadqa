package ru.fivan.CollectionTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Test {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Ntcn");
        names.add("Niva");
        names.add("Tesle");
        names.add("Kia");
        names.add("Volga");
        for (String name : names) {
            if (name.equals("Kia")){
                System.out.println("Нашли Кию");
                break;
            }
        }

        List<String> nameOriginal = new ArrayList<String>(){{
            add("Niva");
            add("Kia");
            add("Haval");
            add("Tesla");
            add("Haval");
            add("Haval");
            add("Haval");
        }};
        Set<String> names2 = new HashSet<>(nameOriginal);
        System.out.println(names2);

    }
}

package ru.fivan.StreamAPI_Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamClassExsample3 {
    public static void main(String[] args) {
        Map<String,Integer> coins = new HashMap<String, Integer>(){{
            put("CAD",23);
            put("LRD",25);
            put("NZD",35);
            put("SEK",230);
        }};

        System.out.println(coins);

        Map<String,Integer> reverse = coins.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (first, second) ->first, LinkedHashMap::new));

        System.out.println(reverse);

    }


}

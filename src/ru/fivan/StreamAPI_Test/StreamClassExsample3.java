package ru.fivan.StreamAPI_Test;

import java.util.HashMap;
import java.util.Map;

public class StreamClassExsample3 {
    public static void main(String[] args) {
        Map<String,Integer> coins = new HashMap<String, Integer>(){{
            put("CAD",235);
            put("LRD",25);
            put("NZD",35);
            put("SEK",230);
        }};

        System.out.println(coins);
    }

}

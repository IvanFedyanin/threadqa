package ru.fivan.CollectionTest;

import java.util.HashMap;
import java.util.Map;

public class Map_Test {
    public static void main(String[] args) {
        Map<String,Integer> people = new HashMap<>();
        people.put("Test",19);
        people.put("Bob",23);
        people.put("Oleg", 20);
        people.put("Test2",62);
        //people.put(null,null);

        System.out.println(people.getOrDefault("d",25));
        System.out.println(people.get("Oleg"));
        System.out.println(people.replace("Bob",120));
        System.out.println(people);
        for (Map.Entry<String, Integer> stringIntegerEntry : people.entrySet()) {
            if (stringIntegerEntry.getKey().equals("Oleg")){
                System.out.println("Найден Олег");
                break;
            }

        }
    }


}

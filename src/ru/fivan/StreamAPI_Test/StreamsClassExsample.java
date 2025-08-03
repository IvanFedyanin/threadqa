package ru.fivan.StreamAPI_Test;

import ru.fivan.Cars.CarWithEnum;
import ru.fivan.Cars.TypeCars;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsClassExsample {
    public static void main(String[] args) {
        List<CarWithEnum> cars = new ArrayList<CarWithEnum>(){{
        add(new CarWithEnum("BMW x3", TypeCars.CROSSOVER,"red",4));
        add(new CarWithEnum("Lada Sedan", TypeCars.SEDAN,"blue",5));
        add(new CarWithEnum("Kia Sedan", TypeCars.SEDAN,"black",5));
        add(new CarWithEnum("Honda Civik", TypeCars.SEDAN,"red",4));
        add(new CarWithEnum("Niva Legend", TypeCars.JEEP,"red",3));
        }};
        //фильтр через стрим АПИ - просто вывели на экран
        cars.stream().filter(temp -> temp.getType().equals(TypeCars.SEDAN))
                .forEach(x-> System.out.println(x));
        //сохраниенеие в коллекцию
        List<CarWithEnum> streams = cars.stream()
                .filter(temp -> temp.getType()
                .equals(TypeCars.SEDAN)).collect(Collectors.toList());
        System.out.println(streams);


    // фильтр через цикл фор
        List<CarWithEnum> sedans = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getType().equals(TypeCars.JEEP)){
                sedans.add(cars.get(i));
            }



        }

        System.out.println(sedans);
    }

}

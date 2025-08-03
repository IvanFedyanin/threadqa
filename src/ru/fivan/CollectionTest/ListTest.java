package ru.fivan.CollectionTest;

import ru.fivan.Cars.Car;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //создали список и добавили туда в значения
        List<String> names = new ArrayList<>();
        names.add("Kusya");
        names.add("Afonya");
        names.add("Vanya");
        String firstName = names.get(2);
        System.out.println(firstName);
        //проверка содержания
        System.out.println(names.contains("Vanya"));
        System.out.println(names.contains("jh"));

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }


    //таким методом можно добавлять значения
        List<String> names2 = new ArrayList<String>(){{
           add("Jyt");
           add("mnb");
           add("kbk");
           add("kbkjb");
        }};

        System.out.println(names2);
    //Тут созадали приватный метод,и через него проучаем значения
        List<String> names3 = getCarList();
        System.out.println(names3);

    //Еще один метод фильтруем список по значению, перекладывая отфильтрованное в новый список
        List<Car> carName = getCarList2();
        List<Car> carWithFuel = new ArrayList<>();

        for (Car car : carName) {
            if (car.getFuel() > 50){
                carWithFuel.add(car);
            }
            
        }
        System.out.println(carWithFuel);


    }

private static List<String> getCarList(){
        List<String> names3 = new ArrayList<String>(){{
            add("One");
            add("OnE");
            add("one");
            add("ONE");

        }};
        return names3;
}

private static List<Car> getCarList2(){
        List<Car> carNames = new ArrayList<Car>(){{
            add(new Car("Honda",90));
            add(new Car("Tesla",0));
            add(new Car("Kia",50));
            add(new Car("Test",900));
        }};
        return carNames;

}

}

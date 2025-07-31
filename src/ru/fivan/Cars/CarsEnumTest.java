package ru.fivan.Cars;

public class CarsEnumTest {
    public static void main(String[] args) {
        CarWithEnum bmw = new CarWithEnum("BMW X5",TypeCars.CROSSOVER,"red",5);
        System.out.println(bmw.getType());
    }

}

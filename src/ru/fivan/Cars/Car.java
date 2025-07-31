package ru.fivan.Cars;

import java.util.Objects;

public class Car {
    private  String model;
    private Integer fuel;

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void goToRoad(){
        if (fuel > 40){
            System.out.println("Машина поехала на трассу");
        }else {
            System.out.println("Недостатчно бензина, машина не поедет");
        }
    }
    public void beepBeep(){
        System.out.println("Машина сигналит!");
    }

    public Car(String model, Integer fuel) {
        this.model = model;
        this.fuel = fuel;
        System.out.println("Создали машину " + model);
    }

    public Car() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(fuel, car.fuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, fuel);
    }

    @Override
    public String toString() {
        return "ru.fivan.Cars.Car{" +
                "model='" + model + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}

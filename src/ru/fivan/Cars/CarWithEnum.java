package ru.fivan.Cars;

public class CarWithEnum {
    private String carName;
    private TypeCars type;
    private String color;
    private Integer countDoor;

    public CarWithEnum(String carName, TypeCars type, String color, Integer countDoor) {
        this.carName = carName;
        this.type = type;
        this.color = color;
        this.countDoor = countDoor;
        System.out.println("Создана машина " + carName);
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public TypeCars getType() {
        return type;
    }

    public void setType(TypeCars type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCountDoor() {
        return countDoor;
    }

    public void setCountDoor(Integer countDoor) {
        this.countDoor = countDoor;
    }

    @Override
    public String toString() {
        return "CarWithEnum{" +
                "carName='" + carName + '\'' +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", countDoor=" + countDoor +
                '}';
    }
}

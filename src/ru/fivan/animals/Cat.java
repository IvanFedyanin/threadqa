package ru.fivan.animals;

public class Cat {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.say();
        lion.hunt();
        lion.fly();
        System.out.println(lion.name());
        Panter panter = new Panter();
        panter.say();
        panter.hunt();
        panter.fly();
        System.out.println(panter.name());
    }
}

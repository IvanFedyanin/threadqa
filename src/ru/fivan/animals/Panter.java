package ru.fivan.animals;

public class Panter extends CatFamily implements FlyAbbility{

    public void swinUnderWoter(){

    }
    @Override
    public void fly(){
        System.out.println("Пантера летит сама собой");

    }

    @Override
    public String name() {
        return "Может лететь на самолете";
    }

    @Override
    public void say() {
        System.out.println("Пантера мурлычит");
    }
}

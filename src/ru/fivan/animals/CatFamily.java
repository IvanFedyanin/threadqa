package ru.fivan.animals;

public abstract class  CatFamily {

    public void hunt(){
        System.out.println("Охота началась!!");
    }

    public abstract void say();


    public final void sleep(){
        System.out.println("Кошак спит");

    }


}

package ru.fivan.animals;

public class Lion extends CatFamily implements FlyAbbility {
    public void laudSay(){

    }
    public void superRun(){

    }

    public void beKing(){

    }

    @Override
    public void say() {
        System.out.println("Лев громко рычит");
    }
    @Override
    public void hunt(){
        System.out.println("Лев сам охотится");

    }

    @Override
    public void fly() {
        System.out.println("У льва появилась возможность лететь");

    }

    @Override
    public String name() {
        return "Летим на крыльях";
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Nissan");
        car.setFuel(20);
        car.goToRoad();
        System.out.println(car.getModel());

        Car car1 = new Car();
        car1.setModel("Kia");
        car1.setFuel(100);
        car1.goToRoad();
        car1.beepBeep();
        System.out.println(car1.getModel());

        Car mersedes = new Car("Gelik",100);
        System.out.println(mersedes.getModel());
        mersedes.beepBeep();
        mersedes.goToRoad();



    }
}
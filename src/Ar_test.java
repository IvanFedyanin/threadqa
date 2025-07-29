import java.util.Arrays;

public class Ar_test {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Niv";
        names[1] = "nav";
        names[2] = "Nuv";
        System.out.println(Arrays.asList(names));

        String[] names2 = new String[]{"one","two","teat"};
        System.out.println(Arrays.asList(names2));

        Car[] cars = new Car[3];
        cars[0] = new Car("Honda",100);
        cars[1] = new Car("Kia", 78);
        cars[2] = new Car("Reno",88);
        System.out.println(Arrays.asList(cars));
    }

}

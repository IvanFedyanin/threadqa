import java.util.Arrays;

public class Array_test {

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
        System.out.println(Arrays.asList(cars)); //массив как строка
        System.out.println(cars[1]);//обращение к элементу по индкусу
        //перебор в цикле
        for (int i = 0; i < cars.length; i++) {
            System.out.println("перебор значений "+cars[i]);

        }
        //взаимодействие с массиывми в цикле
        for (int i = 0; i < cars.length; i++) {
            Car tempCar = cars[i];
            tempCar.setFuel(200);
        }
        System.out.println("Взаимодействие с элементами "+Arrays.asList(cars));

        //поиск по элементам массива
        for (int i = 0; i < cars.length; i++) {
            Car tempCar = cars[i];
            if (tempCar.getModel().equals("Honda")){
                System.out.println("Поиск");
                System.out.println("Найдена нужная машимна");
                break;
            }
            System.out.println(tempCar);
        }
        //обратный цикл
        for (int i = cars.length - 1; i >= 0; i--) {
            System.out.println(Arrays.asList(cars[i]));

        }
        //взаимодействие в цикле с элемантом по условием
        for (int i = 0; i < cars.length; i++) {
            Car tempCar = cars[i];
            if (tempCar.getModel().equals("Reno")){
                tempCar.setFuel(0);
            }

            System.out.println(tempCar);
        }
    }




}

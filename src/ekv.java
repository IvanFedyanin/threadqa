public class ekv {

    public static void main(String[] args) {
        Car nissan = new Car("Nissan",40);
        Car nissan2 = new Car("Nissan",40);
        boolean isSame = nissan.equals(nissan2);
        System.out.println(isSame);
        boolean isModelSame = nissan.getModel().equals(nissan2.getModel());
        boolean isFuenSame = nissan.getModel().equals(nissan2.getModel());
        System.out.println(isModelSame);
        System.out.println(isFuenSame);
        System.out.println(nissan);
        System.out.println(nissan2);
        System.out.println(isSame);

    }
}

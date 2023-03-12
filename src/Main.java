public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double metersHeight = 1.60;
        int kgsWeight = 100;
        int index = service.calculate(metersHeight, kgsWeight);
        System.out.println(index);
    }
}
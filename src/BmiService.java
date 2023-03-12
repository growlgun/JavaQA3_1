public class BmiService {
    public int calculate(double metersHeight, int kgsWeight) {
        double index = kgsWeight / (metersHeight * metersHeight);
        return (int) index;
    }
}

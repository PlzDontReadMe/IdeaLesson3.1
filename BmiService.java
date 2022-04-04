public class BmiService {
    public double calculate(double mass,double height) {
        double bmiService = mass / (height * height);
        return bmiService;
    }
}

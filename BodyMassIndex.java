public class BodyMassIndex {
    public double calculate(double mass, double height) {

        double bodyMassIndex = mass / (height*height);

        return bodyMassIndex;
    }
}

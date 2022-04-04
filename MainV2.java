public class MainV2 {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();

        double bodyMassIndex = service.calculate(80, 1.82);

        System.out.println(bodyMassIndex);

    }
}

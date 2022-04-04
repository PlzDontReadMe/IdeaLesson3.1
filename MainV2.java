public class MainV2 {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double BmiService = service.calculate(80, 1.82);

        System.out.println(BmiService);

    }
}

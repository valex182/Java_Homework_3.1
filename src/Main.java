public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 20_000;
        int miles = service.calculate(price);
        System.out.println("Вам будет начислено " + miles + " бонусных миль");
    }
}
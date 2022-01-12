public class BonusMilesService {
    public int calculate(int cost) {
        int mileCost = 20;
        int AmountMiles = cost / mileCost;
        return AmountMiles;
    }
}
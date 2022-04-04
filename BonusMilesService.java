public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int milesPrice = 20;
        int bonusMiles = ticketPrice / milesPrice;
        return bonusMiles;
    }
}


package Task_04_BeerCounter;

/**
 * Created by ivano on 2/12/2017.
 */
public class BeerCounter {
    private static Integer beerInStock = 0;
    private static Integer beersDrankCount = 0;

    public static Integer getBeerInStock() {
        return beerInStock;
    }

    public static Integer getBeersDrankCount() {
        return beersDrankCount;
    }

    public static void buyBeer(Integer bottlesCount) {
        beerInStock += bottlesCount;
    }

    public static void drinkBeer(Integer bottlesDrunk) {
        beersDrankCount += bottlesDrunk;
        beerInStock -= bottlesDrunk;
    }
}

package Task_04_BeerCounter;

import java.util.Scanner;

/**
 * Created by ivano on 2/12/2017.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        while (!line.equals("End")) {
            String[] input = line.split("\\s+");
            BeerCounter.buyBeer(Integer.parseInt(input[0]));
            BeerCounter.drinkBeer(Integer.parseInt(input[1]));
            line = sc.nextLine();
        }


        System.out.println(BeerCounter.getBeerInStock() + " " + BeerCounter.getBeersDrankCount());
    }
}

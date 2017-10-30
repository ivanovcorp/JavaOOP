package Task_03_TemperatureConverter;

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
            Integer degrees = Integer.parseInt(input[0]);
            String unit = input[1];

            TemperatureConvertor.convertTemperature(degrees, unit);
            line = sc.nextLine();
        }
    }
}

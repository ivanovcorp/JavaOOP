package Task_07_BasicMath;

import java.util.Scanner;

/**
 * Created by ivano on 2/12/2017.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] line = input.split("\\s+");
            switch (line[0]) {
                case "Sum":
                    MathUtils.sum(Double.parseDouble(line[1]), Double.parseDouble(line[2]));
                    break;
                case "Subtract":
                    MathUtils.substract(Double.parseDouble(line[1]), Double.parseDouble(line[2]));
                    break;
                case "Multiply":
                    MathUtils.multiply(Double.parseDouble(line[1]), Double.parseDouble(line[2]));
                    break;
                case "Divide":
                    MathUtils.divide(Double.parseDouble(line[1]), Double.parseDouble(line[2]));
                    break;
                case "Percentage":
                    MathUtils.percentage(Double.parseDouble(line[1]), Double.parseDouble(line[2]));
            }
            input = sc.nextLine();
        }
    }
}

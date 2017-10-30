package Task_08_ShapesVolume;

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
                case "Cube":
                    Cube cube = new Cube(Double.parseDouble(line[1]));
                    VolumeCalculator.calculateVolume(cube);
                    break;
                case "Cylinder":
                    Cylinder cylinder = new Cylinder(Double.parseDouble(line[1]), Double.parseDouble(line[2]));
                    VolumeCalculator.calculateVolume(cylinder);
                    break;
                case "TrianglePrism":
                    TriangularPrism prism = new TriangularPrism(Double.parseDouble(line[1]), Double.parseDouble(line[2]), Double.parseDouble(line[3]));
                    VolumeCalculator.calculateVolume(prism);
                    break;
            }
            input = sc.nextLine();
        }
    }
}

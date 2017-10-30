package Task_08_ShapesVolume;

/**
 * Created by ivano on 2/12/2017.
 */
public class VolumeCalculator {
    public static void calculateVolume(TriangularPrism prism) {
        double result = prism.getBaseSide() * (0.5) * prism.getHeightFromBaseSide() * prism.getLenght();

        System.out.printf("%.2f%n",result);
    }

    public static void calculateVolume(Cube cube) {
        double result = Math.pow(cube.getSideLenght(), 3);

        System.out.printf("%.3f%n",result);
    }

    public static void calculateVolume(Cylinder cylinder) {
        double result = Math.PI * cylinder.getHeight() * Math.pow(cylinder.getRadius(), 2);

        System.out.printf("%.3f%n   ", result);
    }
}

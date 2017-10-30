package Task_03_TemperatureConverter;

/**
 * Created by ivano on 2/12/2017.
 */
public class TemperatureConvertor {

    public static void convertTemperature(Integer degrees, String unit) {
        if (unit.toLowerCase().equals("celsius")) {
            double degFarh = (degrees * 1.8) + 32;
            String currUnit = "Fahrenheit";
            System.out.printf("%.2f %s%n", degFarh, currUnit);
        } else {
            double degCel = (degrees - 32) / 1.8;
            double finalRes = Math.floor(degCel);
            String outUnit = "Celsius";
            System.out.printf("%.2f %s%n", degCel, outUnit);
        }
    }
}

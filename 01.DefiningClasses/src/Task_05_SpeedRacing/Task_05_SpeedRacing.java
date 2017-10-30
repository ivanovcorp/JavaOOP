package Task_05_SpeedRacing;

import java.util.*;

/**
 * Created by ivano on 2/9/2017.
 */
class Car {
    String model;
    double amount;
    double fuelCostForKilometer;
    double distanceTravelled;

    Car (String model, double amount, double fuelCostForKilometer) {
        this.model = model;
        this.amount = amount;
        this.fuelCostForKilometer = fuelCostForKilometer;
        this.distanceTravelled = 0;
    }

    public boolean drive(double kilometres) {
        double currFuelConsumed = kilometres * this.fuelCostForKilometer;
        if (currFuelConsumed > this.amount) {

            return false;
        }
        return true;
    }
}


public class Task_05_SpeedRacing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int commands = Integer.parseInt(sc.nextLine());
        List<Car> cars = new ArrayList<Car>();
        for (int i = 0; i < commands; i++) {
            String[] input = sc.nextLine().split("\\s+");
            cars.add(new Car(input[0], Double.parseDouble(input[1]), Double.parseDouble(input[2])));
        }

        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] currCommand = input.split("\\s+");
            for (int i = 0; i < cars.size(); i++) {
                Car currCar = cars.get(i);
                if (currCar.model.equals(currCommand[1])) {
                    if (currCar.drive(Double.parseDouble(currCommand[2]))) {
                        currCar.amount -= currCar.fuelCostForKilometer * Double.parseDouble(currCommand[2]);
                        currCar.distanceTravelled += Double.parseDouble(currCommand[2]);
                    } else {
                        System.out.println("Insufficient fuel for the drive");
                    }
                }
            }
            input = sc.nextLine();
        }

        for (int i = 0; i < cars.size(); i++) {
            Car currCar = cars.get(i);
            System.out.printf("%s %.2f %.0f%n",currCar.model, currCar.amount, currCar.distanceTravelled);
        }
    }
}

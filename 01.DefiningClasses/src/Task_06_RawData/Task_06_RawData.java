package Task_06_RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by iv.ivanov on 2/10/2017.
 */
class Engine {
    Integer engineSpeed;
    Integer enginePower;

    public Engine(Integer engineSpeed, Integer enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }
}

class Cargo {
    Integer cargoWeight;
    String cargoType;

    public Cargo(Integer cargoWeight, String cargoType) {
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }
}

class Tire {
    Double tirePressure;
    Integer tireAge;

    public Tire(Double tirePressure, Integer tireAge) {
        this.tirePressure = tirePressure;
        this.tireAge = tireAge;
    }
}

class Car {
    String model;
    Engine engine;
    Cargo cargo;
    Tire[] tires = new Tire[4];

    public Car (String model, Integer engineSpeed, Integer enginePower, Integer cargoWeight, String cargoType, Double tirePressure1,
                Integer tireAge1, Double tirePressure2, Integer tireAge2, Double tirePressure3, Integer tireAge3,
                Double tirePressure4, Integer tireAge4) {
        this.model = model;
        this.engine = new Engine(engineSpeed, enginePower);
        this.cargo = new Cargo(cargoWeight, cargoType);
        this.tires[0] = new Tire(tirePressure1, tireAge1);
        this.tires[1] = new Tire(tirePressure2, tireAge2);
        this.tires[2] = new Tire(tirePressure3, tireAge3);
        this.tires[3] = new Tire(tirePressure4, tireAge4);
    }
}

public class Task_06_RawData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = Integer.parseInt(sc.nextLine());

        List<Car> newCars = new ArrayList<Car>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            Car currCar = new Car(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), Integer.parseInt(input[3]),
                    input[4], Double.parseDouble(input[5]), Integer.parseInt(input[6]), Double.parseDouble(input[7]), Integer.parseInt(input[8]),
                    Double.parseDouble(input[9]), Integer.parseInt(input[10]), Double.parseDouble(input[11]), Integer.parseInt(input[12]));
            newCars.add(currCar);

        }

        String command = sc.nextLine();

        for (Car car : newCars) {
            if (command.equals("fragile")) {
                if ((car.tires[0].tirePressure < 1.5) && (car.tires[1].tirePressure < 1.5) && (car.tires[2].tirePressure < 1.5) && (car.tires[3].tirePressure < 1.5)) {
                    System.out.println(car.model);
                }
            } else {
                if (car.engine.enginePower > 250) {
                    System.out.println(car.model);
                }
            }
        }

    }
}
package Task_07_CarSalesman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ivano on 2/10/2017.
 */
class Car {
    String model;
    Engine engine;
    Integer weight;
    String color;

    Car (String model, Engine engine) {
        this(model, engine, 0, "n/a");
    }

    Car (String model, Engine engine, String color) {
        this(model, engine, 0, color);
    }

    Car (String model, Engine engine, Integer weight) {
        this(model, engine, weight, "n/a");
    }

    Car (String model, Engine engine, Integer weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        String toPrint = String.format("%s:%n  %s:%n    Power: %s" +
                        "%n    Displacement: %s%n    Efficiency: %s" +
                        "%n  Weight: %s%n  Color: %s", this.model, this.engine.model, Integer.toString(this.engine.power),
                this.engine.displacement != 0 ? Integer.toString(this.engine.displacement) : "n/a", this.engine.efficienty,
                this.weight != 0 ? Integer.toString(this.weight) : "n/a", this.color);
        return toPrint;
    }
}

class Engine {
    String model;
    Integer power;
    Integer displacement;
    String efficienty;

    Engine (String model, Integer power) {
        this(model, power, 0, "n/a");
    }

    Engine (String model, Integer power, Integer displacement) {
        this(model, power, displacement, "n/a");
    }

    Engine (String model, Integer power, String efficienty) {
        this(model, power, 0, efficienty);
    }

    Engine (String model, Integer power, Integer displacement, String efficienty) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficienty = efficienty;
    }
}

public class Task_07_CarSalesman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = Integer.parseInt(sc.nextLine());
        HashMap<String, Engine> lineOfEngines = new HashMap<String, Engine>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            String currKey;
            Engine currEngine;
            if (input.length == 2) {
                currKey = input[0];
                currEngine = new Engine(input[0], Integer.parseInt(input[1]));
            } else if (input.length == 4){
                currKey = input[0];
                currEngine = new Engine(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), input[3]);
            } else {
                currKey = input[0];
                try {
                    int power = Integer.parseInt(input[2]);
                    currEngine = new Engine(input[0], Integer.parseInt(input[1]), power);
                } catch (Exception e) {
                    currEngine = new Engine(input[0], Integer.parseInt(input[1]), input[2]);
                }
            }

            lineOfEngines.put(currKey, currEngine);
        }

        List<Car> allCars = new ArrayList<Car>();
        Integer m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String[] input = sc.nextLine().split("\\s+");
            String currKey = input[1];
            Engine currEngine = lineOfEngines.get(currKey);
            Car currCar;
            if (input.length == 2) {
                currCar = new Car(input[0], currEngine);
            } else if (input.length == 4) {
                currCar = new Car(input[0], currEngine, Integer.parseInt(input[2]), input[3]);
            } else {
                try {
                    int weight = Integer.parseInt(input[2]);
                    currCar = new Car(input[0], currEngine, weight);
                } catch (Exception e) {
                    currCar = new Car(input[0], currEngine, input[2]);
                }
            }
            allCars.add(currCar);
        }


        for (Car car : allCars) {
            System.out.print(car.toString());
            System.out.println();
        }
    }
}

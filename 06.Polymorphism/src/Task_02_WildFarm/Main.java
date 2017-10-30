package Task_02_WildFarm;

import Task_02_WildFarm.Animals.*;
import Task_02_WildFarm.Foods.Food;
import Task_02_WildFarm.Foods.Meat;
import Task_02_WildFarm.Foods.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivano on 2/19/2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String input = sc.readLine();
        List<Animal> animalList = new ArrayList<>();

        while (!input.equals("End")){
            String[] data = input.trim().split("\\s");
            String type = data[0];
            String name = data[1];
            Double weight = Double.parseDouble(data[2]);
            String region = data[3];

            if (data.length == 5){
                String breed = data[4];

                Animal animal = new Cat(name, type, weight, region, breed);
                animalList.add(animal);
                String[] foodInfo = sc.readLine().split("\\s+");
                Food food = null;
                if (foodInfo[0].equals("Meat")){
                    food = new Meat(Integer.parseInt(foodInfo[1]));
                } else {
                    food = new Vegetable(Integer.parseInt(foodInfo[1]));
                }
                animal.produceSound();
                animal.eatFood(food);

            } else if (data.length == 4){
                Animal animal = null;
                switch (data[0]){
                    case "Tiger":
                        animal = new Tiger(name, type, weight, region);
                        animalList.add(animal);
                        break;
                    case "Mouse":
                        animal = new Mouse(name, type, weight, region);
                        animalList.add(animal);
                        break;
                    case "Zebra":
                        animal = new Zebra(name, type, weight, region);
                        animalList.add(animal);
                        break;
                }
                String[] foodInfo = sc.readLine().split("\\s+");
                Food food = null;
                if (foodInfo[0].equals("Meat")){
                    food = new Meat(Integer.parseInt(foodInfo[1]));
                } else {
                    food = new Vegetable(Integer.parseInt(foodInfo[1]));
                }
                animal.produceSound();
                animal.eatFood(food);
            }

            input = sc.readLine();
        }

        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i).toString());
        }
    }
}

package Task_05_AnimalClinic;

import java.util.ArrayList;

/**
 * Created by ivano on 2/12/2017.
 */
public class AnimalClinic {
    private static Integer animalID = 0;
    private static Integer animalHealedCount = 0;
    private static Integer rehabillitatedAnimals = 0;
    private static ArrayList<Animal> healedAnimals = new ArrayList<>();
    private static ArrayList<Animal> rehabilitatedAnimals = new ArrayList<>();

    public static void healOrRehabilitateAnimal(Animal animal, String command) {
        if (command.equals("heal")){
            animalID++;
            animalHealedCount++;
            healedAnimals.add(animal);
            System.out.printf("Patiend %d: [%s(%s)] has been healed!%n", animalID, animal.getName(), animal.getBreed());
        } else {
            animalID++;
            rehabillitatedAnimals++;
            rehabilitatedAnimals.add(animal);
            System.out.printf("Patiend %d: [%s(%s)] has been rehabilitated!%n", animalID, animal.getName(), animal.getBreed());
        }
    }

    public static void printAll() {
        System.out.println("Total healed animals: " + animalHealedCount);
        System.out.println("Total rehabilitated animals " + rehabillitatedAnimals);
    }

    public static void printAllHealedOrRehabilitated(String command) {
        if (command.equals("heal")) {
            for (Animal animal : healedAnimals) {
                System.out.println(animal.getName() + " " + animal.getBreed());
            }
        } else {
            for (Animal animal : rehabilitatedAnimals) {
                System.out.println(animal.getName() + " " + animal.getBreed());
            }
        }
    }
}

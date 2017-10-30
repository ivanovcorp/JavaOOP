package Task_05_AnimalClinic;

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
            Animal animal = new Animal(line[0], line[1]);
            AnimalClinic.healOrRehabilitateAnimal(animal, line[2]);
            input = sc.nextLine();
        }
        AnimalClinic.printAll();
        input = sc.nextLine();
        AnimalClinic.printAllHealedOrRehabilitated(input);
    }
}

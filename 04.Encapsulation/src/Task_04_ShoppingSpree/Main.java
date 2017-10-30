package Task_04_ShoppingSpree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ivano on 2/13/2017.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] lineOfPersons = input.split(";");
        Map<String, Person> persons = new HashMap<>();
        for (String person : lineOfPersons) {
            String[] splitPersonAndMoney = person.split("=");
            try {
                Person currPerson = new Person(splitPersonAndMoney[0], Double.parseDouble(splitPersonAndMoney[1]));
                persons.put(currPerson.getName(), currPerson);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
        input = sc.nextLine();
        String[] lineOfProducts = input.split(";");
        Map<String, Product> allProducts = new HashMap<>();
        for (String product : lineOfProducts) {
            String[] splitLineOfProducts = product.split("=");
            try {
                Product currProduct = new Product(splitLineOfProducts[0], Double.parseDouble(splitLineOfProducts[1]));
                allProducts.put(currProduct.getProductName(), currProduct);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        input = sc.nextLine();
        while (!input.equals("END")) {
            String[] currLineSplit = input.split(" ");
            Person currPerson = persons.get(currLineSplit[0]);
            Product currProduct = allProducts.get(currLineSplit[1]);

            currPerson.buyProduct(currProduct);
            input = sc.nextLine();
        }

        for (Map.Entry<String, Person> entry : persons.entrySet()) {
            Person person = entry.getValue();
            if (person.getBagOfProducts().size() == 0) {
                System.out.printf("%s - Nothing bought%n", person.getName());
            } else {
                ArrayList<Product> bag = person.getBagOfProducts();
                System.out.print(person.getName() + " - ");
                for(Product product : bag) {
                    System.out.printf("%s, ", product.getProductName());
                }
                System.out.println();
            }
        }
    }
}

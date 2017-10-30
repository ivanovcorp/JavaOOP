package Task_01_Students;

import java.util.Scanner;

/**
 * Created by ivano on 2/12/2017.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        while (!input.equals("End")) {
            Student currStudent = new Student(input);
            input = sc.nextLine();
        }

        System.out.println(Student.getStudentsCount());
    }
}

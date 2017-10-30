package Task_03_OpinionPoll;

import java.util.*;

/**
 * Created by ivano on 2/9/2017.
 */
class Person {
    static final String DEFAULT_NAME = "No name";
    static final int DEFAULT_AGE = 1;

    String name;
    int age;

    Person(){
        this(DEFAULT_NAME, DEFAULT_AGE);
    }

    Person(int age) {
        this(DEFAULT_NAME, age);
    }


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task_03_OpinionPoll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Person> personsOver30Years = new ArrayList<Person>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            Person currentPerson = new Person(input[0], Integer.parseInt(input[1]));
            if (currentPerson.age > 30) {
                personsOver30Years.add(currentPerson);
            }
        }

        Collections.sort(personsOver30Years, new Comparator<Person>() {
            @Override
            public int compare(final Person object1, final Person object2) {
                return object1.name.compareTo(object2.name);
            }
        });

        for (Person person : personsOver30Years) {
            System.out.println(person.name + " - " + person.age);
        }
    }
}

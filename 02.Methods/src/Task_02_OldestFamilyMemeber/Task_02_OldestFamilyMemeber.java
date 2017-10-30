package Task_02_OldestFamilyMemeber;

import java.util.ArrayList;

/**
 * Created by ivano on 2/11/2017.
 */
class Person {
    private String name;
    private Integer age;

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Family {
    static ArrayList<Person> people;

    public Family () {
        this.people = new ArrayList<Person>();
    }

    void addMember(Person person) {
        this.people.add(person);
    }

    Person getOldestMember() {
        Person oldest = people.get(0);
        int oldesAge = Integer.MIN_VALUE;
        for (int i = 1; i < people.size(); i++) {
            Person curr = people.get(i);
            if (curr.getAge() > oldesAge) {
                oldest = curr;
            }
        }

        return oldest;
    }
}

public class Task_02_OldestFamilyMemeber {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 24);
        Person marina = new Person("Marina", 1);
        Person violeta = new Person("Violeta", 25);

        Family family = new Family();
        family.addMember(ivan);
        family.addMember(marina);
        family.addMember(violeta);

        Person oldestPerson = family.getOldestMember();
        System.out.println(oldestPerson.getName() + " " + oldestPerson.getAge());
    }
}

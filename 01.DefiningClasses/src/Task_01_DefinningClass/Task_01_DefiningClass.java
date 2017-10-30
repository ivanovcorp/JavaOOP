package Task_01_DefinningClass;

import java.lang.reflect.Field;

/**
 * Created by ivano on 2/9/2017.
 */
class Person {
    String name;
    int age;

    Person(){
        this("No name", -1);
    }

    Person(int age) {
        this("No name", age);
    }


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task_01_DefiningClass {
    public static void main(String[] args) throws Exception {
        Class person = Person.class;
        Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);
    }

}

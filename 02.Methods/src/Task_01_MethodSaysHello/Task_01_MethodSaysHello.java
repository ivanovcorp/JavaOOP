package Task_01_MethodSaysHello;

/**
 * Created by ivano on 2/11/2017.
 */
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    String sayHello() {
        return this.name + " says \"Hello\"!";
    }
}

public class Task_01_MethodSaysHello {

    public static void main(String[] args) throws ClassNotFoundException {
        /*Field[] fields = Person.class.getDeclaredFields();
        Method[] methods = Class.forName("Person").getDeclaredMethods();
        if (fields.length != 1 || methods.length != 1) {
            throw new ClassFormatError();
        }*/
        Person peter = new Person("Peter");
        System.out.println(peter.sayHello());

    }
}

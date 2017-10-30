package Task_01_Person;

/**
 * Created by ivano on 2/13/2017.
 */
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
    }

    protected void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    protected void setAge(Integer age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }

    protected String getName() {
        return this.name;
    }

    protected Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge()));

        return stringBuilder.toString();
    }
}

package Task_01_Person;

/**
 * Created by ivano on 2/13/2017.
 */
public class Child extends Person {
    public Child(String name, Integer age) {
        super(name, age);
    }

    @Override
    protected void setAge(Integer age) {
        if (age > 15) {
            throw new IllegalArgumentException("Child's age must be less than 15!");
        }
        super.setAge(age);
    }
}

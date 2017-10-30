package Task_03_ManKind;

/**
 * Created by ivano on 2/13/2017.
 */
public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    protected void setFirstName(String firstName) {
        if (!Character.isUpperCase(firstName.charAt(0))) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        } else if (firstName.length() < 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        if (!Character.isUpperCase(lastName.charAt(0))) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        } else if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return this.firstName;
    }

    protected String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("First Name: %s%nLast Name: %s%n",
                this.getFirstName(),
                this.getLastName()));

        return stringBuilder.toString();
    }
}

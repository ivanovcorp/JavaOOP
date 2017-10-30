package Task_03_ManKind;

/**
 * Created by ivano on 2/13/2017.
 */
public class Student extends Human {
    private Integer facultyNumber;

    public Student(String firstName, String lastName, Integer facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    private void setFacultyNumber(Integer facultyNumber) {
        if (facultyNumber < 5 || facultyNumber > 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    protected Integer getFacultyNumber() {
        return this.facultyNumber;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(String.format("Faculty number: %d%n",
                this.getFacultyNumber()));
        return stringBuilder.toString();
    }
}

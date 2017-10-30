package Task_01_Students;

/**
 * Created by ivano on 2/12/2017.
 */
public class Student {
    private String name;
    private static Integer studentsCount = 0;

    public Student(String name) {
        this.name = name;
        studentsCount++;
    }

    static Integer getStudentsCount() {
        return studentsCount;
    }
}

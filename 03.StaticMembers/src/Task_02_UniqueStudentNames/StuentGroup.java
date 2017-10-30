package Task_02_UniqueStudentNames;

import java.util.HashSet;

/**
 * Created by ivano on 2/12/2017.
 */
public class StuentGroup {
    private static HashSet<String> uniqueStudent = new HashSet<>();

    static void addStudent(String studentName) {
        uniqueStudent.add(studentName);
    }

    static Integer getCurrentCountOfUniqueStudents() {
        return uniqueStudent.size();
    }
}

package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static junit.framework.TestCase.assertTrue;

public class StudentServiceTest {
    @Test
    public void getStudent(){
        StudentService ss = new StudentService();
        Student s = new Student(1,"Andile Magwaza");

        List<Student> ListOfStudents = ss.getAllStudents();
        ss.addStudent(s);

        boolean actualResults = ListOfStudents.isEmpty();
        assertTrue(actualResults);
    }
}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> student = new ArrayList<Student>();

    public List<Student> getAllStudents(){
        return this.student;
    }
    public void addStudent(Student student){
        this.student.add(student);
    }
}

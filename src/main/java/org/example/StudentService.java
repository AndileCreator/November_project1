package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<Student>();

    public List<Student> getAllStudents(){
        return this.students;
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
}

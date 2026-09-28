package main.java.com.campus.services;

import java.util.ArrayList;
import java .util.List;


public class StudentService {
    private static List<String>students = new ArrayList<>();


    public StudentService() {
        students.add("101 - bill -java");
        students.add("102 - john - python");
        students.add("103 - smith - c++");
        // Initialize the student list or perform any necessary setup
    }
    public List<String> getStudents() {
        return students;
    }
    public void addStudent(String name,String course) {
        students.add(String.valueOf(students.size() + 101) + " - " + name + " - " + course);
       
    }

    
}

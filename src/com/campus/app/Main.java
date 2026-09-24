package com.campus.app;

import com.campus.model.Student;
import com.campus.service.StudentService;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the student id");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("enter the student name");
        String name = sc.nextLine();

        System.out.println("enter the student age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("enter the student department");
        String department = sc.nextLine();

        System.out.println("enter the number of subjects");
        int numSubjects = sc.nextInt();
        sc.nextLine();

        int[] marks = new int[numSubjects];
        System.out.println("enter the marks for " + numSubjects + " each subject");
        for (int i = 0; i < numSubjects; i++) {
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        Student student = new Student(id, name, age, department, marks);
        student.displayStudentInfo(true);
        Student.displayStudentCount();

        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        sc.close();
    }
}
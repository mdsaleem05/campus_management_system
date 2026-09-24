package com.campus.service;

import com.campus.model.Student;

public class StudentService {

    public int calculateTotal(Student student) {
        if (student == null || student.getMarks() == null || student.getMarks().length == 0) {
            return 0;
        }

        int total = 0;
        for (int mark : student.getMarks()) {
            total += mark;
        }
        return total;
    }

    public int calculateTotalMarks(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0;
        }

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverage(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int total = calculateTotalMarks(marks);
        return (double) total / marks.length;
    }

    public int findMax(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0;
        }

        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    public int findMin(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0;
        }

        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    public char grade(Student student) {
        if (student == null || student.getMarks() == null || student.getMarks().length == 0) {
            return 'F';
        }

        double average = calculateAverage(student.getMarks());
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public String passOrFail(Student student) {
        if (student == null || student.getMarks() == null || student.getMarks().length == 0) {
            return "Fail";
        }

        double average = calculateAverage(student.getMarks());
        if (average >= 40) {
            return "Pass";
        }
        return "Fail";
    }

    public void displayReportCard(Student student) {
        if (student == null) {
            System.out.println("Student data is not available.");
            return;
        }

        System.out.println("Report Card for Student: " + student.getStudentname());
        System.out.println("Student ID: " + student.getStudentid());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Total Marks: " + calculateTotal(student));
        System.out.println("Average Marks: " + calculateAverage(student.getMarks()));
        System.out.println("Maximum Marks: " + findMax(student.getMarks()));
        System.out.println("Minimum Marks: " + findMin(student.getMarks()));
        System.out.println("Grade: " + grade(student));
        System.out.println("Result: " + passOrFail(student));
    }
}

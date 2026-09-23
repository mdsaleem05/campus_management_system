package com.campus.model;

public class student{
    private int studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;

    static int studentCount = 0;
    public student(){
        studentCount++;

    }
    public student(int studentid, String studentname, int age, String department, int[] marks){
        this.studentid = studentid;
        this.studentname = studentname;
        this.age = age;
        this.department = department;
        this.marks = marks;
        studentCount++;
    }

    // Getters 
    public int getStudentid() {
        return studentid;   
    }
    public  String getStudentname() {
        return studentname;
    }
    public int getAge() {
        return age; 
    }
    public String getDepartment() {
        return department;
    }
    public int[] getMarks() {
        return marks;
    }
    // Setters
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    //instance methods - belongs to obect
    public void displayStudentInfo(){
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentname);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);

       
    }
    public void displayStudentInfo(boolean showMarks){
        displayStudentInfo();
        if(showMarks){
            System.out.print("Marks: " +java.util.Arrays.toString(marks));
    }

}
public static void displayStudentCount(){
        System.out.println("Total Students: " + studentCount);
    }   
}

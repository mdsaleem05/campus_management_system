package com.campus.model;

public class ScholarshipStudent extends Student {

    private double scholarshipPercentage;

    public double getScholarshipPercentage() {
        return scholarshipPercentage;
    }

    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }

    
    


    @Override
    public void studentType() {
        System.out.println("Scholarship Student");
    }  
    @Override
    public void displayStudentInfo() {
        super.displayStudentInfo();
        System.out.println("Scholarship Percentage: " + scholarshipPercentage);
    } 
    @Override
    public void displayStudentInfo(boolean showMarks) {
        super.displayStudentInfo(showMarks);
    }
    @Override 
    public void generatereport() {

        System.out.println("Scholarsip student report card");
    }
    @override
    public void eligbleForScholarship() {
        System.out.println("Eligible for scholarship");
    }
}
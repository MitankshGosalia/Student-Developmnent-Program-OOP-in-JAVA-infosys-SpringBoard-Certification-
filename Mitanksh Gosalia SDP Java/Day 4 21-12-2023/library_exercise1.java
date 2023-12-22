package com.infy.object;

import java.util.HashMap;
import java.util.Map;
public class StudentRegistration {
    private Map<String, Student> register; // Assuming admission number as the key

    public StudentRegistration() {
        this.register = new HashMap<>();
    }

    public void addStudent(Student student) {
        if (!register.containsKey(student.getAdmissionNumber())) {
            int rollNumber = generateRollNumber();
            student.setRollNumber(rollNumber);
            register.put(student.getAdmissionNumber(), student);
            System.out.println("Student added successfully. Roll number: " + rollNumber);
        } else {
            System.out.println("Error: Student already exists in the register.");
        }
    }

    private int generateRollNumber() {
        // Logic to generate roll number incrementally
        return register.size() + 1001;
    }

    public static void main(String[] args) {
        // Test your code here
        StudentRegistration registration = new StudentRegistration();

        // Test case 1
        Student student1 = new Student("John Doe", "A123");
        registration.addStudent(student1); // This should add successfully

        // Test case 2
        Student student2 = new Student("Jane Smith", "B456");
        registration.addStudent(student2); // This should add successfully

        // Test case 3 (Student with existing admission number)
        Student student3 = new Student("Alex Johnson", "A123");
        registration.addStudent(student3); // This should display an error message
    }
}
class Student {
    private String studentName;
    private String admissionNumber;
    private int rollNumber;

    public Student(String studentName, String admissionNumber) {
        this.studentName = studentName;
        this.admissionNumber = admissionNumber;
        this.rollNumber = 1001; // Initial roll number
    }

    public String getStudentName() {
        return studentName;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public int hashCode() {
        return admissionNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return admissionNumber.equals(student.admissionNumber);
    }
}



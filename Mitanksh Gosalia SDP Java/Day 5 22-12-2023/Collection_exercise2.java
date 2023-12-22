package com.infy.assignment.collection;

import java.util.*;

public class Student {
    private String name;
    private int rollNumber;
    private int totalMarks;

    public Student(String name, int rollNumber, int totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMarks = Math.min(100, totalMarks); // Ensure totalMarks doesn't exceed 100
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = Math.min(100, totalMarks); // Ensure totalMarks doesn't exceed 100
    }

    // Method to calculate grade based on total marks
    public String calculateGrade() {
        if (totalMarks >= 60) {
            return "A";
        } else if (totalMarks > 40) {
            return "B";
        } else {
            return "C";
        }
    }

    public static void main(String[] args) {
        TreeMap<Integer, String> gradeMap = new TreeMap<>();
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 101, 80));
        students.add(new Student("Bob", 102, 50));
        students.add(new Student("Charlie", 103, 35));

        // Storing roll number as key and grade as value in TreeMap
        for (Student student : students) {
            gradeMap.put(student.getRollNumber(), student.calculateGrade());
        }

        // Printing grade and roll number of each student
        System.out.println("Grade and Roll Number of Students:");
        for (Map.Entry<Integer, String> entry : gradeMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}

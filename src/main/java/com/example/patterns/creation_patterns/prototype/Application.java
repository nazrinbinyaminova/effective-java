package com.example.patterns.creation_patterns.prototype;

public class Application {
    public static void main(String[] args) {
        StudentType studentType = new StudentType();
        studentType.setType(5);

        Student student = new Student();
        student.setName("Test");
        student.setGrade(2);
        student.setStudentType(studentType);

        System.out.println(student);

        Student studentClone = student.clone();
        studentClone.setAge(1);
        studentClone.getStudentType().setType(6);

        System.out.println(studentClone);
        System.out.println(student);

    }
}

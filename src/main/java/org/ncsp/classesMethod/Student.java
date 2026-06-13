package org.ncsp.classesMethod;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String studentId;


    public Student(String name, int age, String gender, String studentId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}

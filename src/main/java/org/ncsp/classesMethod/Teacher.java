package org.ncsp.classesMethod;

public class Teacher  {
    private String name;
    private int age;
    private String gender;
    private String teacherId;
    
    
    
    public Teacher(String name, int age, String gender, String teacherId){
      this.name = name;
        this.age = age;
        this.gender = gender;
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", teacherId=" + teacherId + '}';
    }
    
}

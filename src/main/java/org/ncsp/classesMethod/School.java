package org.ncsp.classesMethod;

//get and set method

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private int totalNumberOfStudent;
    private int numberOfTeacher;
    private int numberOfClasses;
    private List<Student> studentList = new ArrayList<>();
    private List<Teacher> teacherList = new ArrayList<>();
    public School(){

    }
    public School(String name, int  totalNumberOfStudent, int numberOfTeacher, int numberOfClasses, List<Student>studentList, List<Teacher>teacherList ){
        this.name = name;
        this.totalNumberOfStudent = totalNumberOfStudent;
        this.numberOfTeacher = numberOfTeacher;
        this.numberOfClasses = numberOfClasses;
        this.studentList = studentList;
        this.teacherList = teacherList;
    }

    public void setTotalNumberOfStudent(List<Student> students){
        int numberOfStudent = students.size();
    }
     public int getTotalNumberOfStudent(){
        return studentList.size();
     }
     public void TotalNumberOfTeacher(List<Teacher> teachers){
         int numberOfTeacher = teachers.size();
     }
     public int TotalNumberOfTeacher(){
         return teacherList.size();
     }
     
     
           
       
    

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", totalNumberOfStudent=" + totalNumberOfStudent +
                ", numberOfTeacher=" + numberOfTeacher +
                ", numberOfClasses=" + numberOfClasses +
                ", studentList=" + studentList + 
                ", teacherList=" + teacherList +
                 '}';
    }
}

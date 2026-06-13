package org.ncsp;

import org.ncsp.classesMethod.SampleSchool;
import org.ncsp.classesMethod.School;
import org.ncsp.classesMethod.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {


        public static void main(String[] args) {
                Student student1  = new Student("Tolu", 28, "Female", "Student001");
                Student student2  = new Student("Tunder", 24, "Male", "Student002");
                List<Student>  students =  new ArrayList<>();
                students.add(student1);
                students.add(student2);
                School school2 = new School("Ajaka",  students.size() , 34,50, students );

                System.out.println(school2);

        }



}
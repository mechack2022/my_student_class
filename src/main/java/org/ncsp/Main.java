package org.ncsp;

import org.ncsp.classesMethod.SampleSchool;
import org.ncsp.classesMethod.School;
import org.ncsp.classesMethod.Student;
import org.ncsp.classesMethod.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {


        public static void main(String[] args) {
                Student student1  = new Student("Tolu", 28, "Female", "Student001");
                Student student2  = new Student("Tunder", 24, "Male", "Student002");
                Teacher teacher1 = new Teacher("idowu", 46, "male", "teacher001");
                Teacher teacher2 = new Teacher("ajao", 98,"male", "teacher002");
                Teacher teacher3 = new Teacher("Bukunmi", 87, "female", "teacher003");
                List<Student>  students =  new ArrayList<>();
                List<Teacher> teachers = new ArrayList<>(); 
                students.add(student1);
                students.add(student2);
                teachers.add(teacher1);
                teachers.add(teacher2);
                teachers.add(teacher3);
                School school2 = new School("Ajaka",  students.size() , teachers.size() ,50, students,teachers );

                System.out.println(school2);

        }



}
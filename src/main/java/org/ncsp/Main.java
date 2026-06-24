package org.ncsp;

import bankapp.BankAccount;
import org.ncsp.classesMethod.SampleSchool;
import org.ncsp.classesMethod.School;
import org.ncsp.classesMethod.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {


        public static void main(String[] args) {
//                Student student1  = new Student("Tolu", 28, "Female", "Student001");
//                Student student2  = new Student("Tunder", 24, "Male", "Student002");
//                List<Student>  students =  new ArrayList<>();
//                students.add(student1);
//                students.add(student2);
//                School school2 = new School("Ajaka",  students.size() , 34,50, students );
//
//                System.out.println(school2);

    
                BankAccount bank1 = new BankAccount(8198, "Tobi", 1000);
                int deposited = bank1.deposit(9000);
                System.out.println(deposited);
                int answer = bank1.withDraw(2000);
                System.out.println(answer);
                bank1.checkBalance();

        }



}
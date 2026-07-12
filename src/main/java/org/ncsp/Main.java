package org.ncsp;

import bankapp.BankAccount;
import org.ncsp.classesMethod.SampleSchool;
import org.ncsp.classesMethod.School;
import org.ncsp.classesMethod.Student;
import org.ncsp.oop.payroll_system.Employee;
import org.ncsp.oop.payroll_system.FullTimeEmployee;
import org.ncsp.oop.payroll_system.HourlyEmployee;
import org.ncsp.oop.payroll_system.Payable;
import org.ncsp.oop.ticket_booking.MovieTicket;

import java.util.ArrayList;
import java.util.List;

import javax.rmi.ssl.SslRMIServerSocketFactory;

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

    
               // BankAccount bank1 = new BankAccount(8198, "Tobi", 1000);
               // int deposited = bank1.deposit(9000);
               // System.out.println(deposited);
                //int answer = bank1.withDraw(2000);
                //System.out.println(answer);
                //bank1.checkBalance();
                
                
                
                
                
               // Book book1 = new Book("Atomic habits", "james clear", true);
               // Book book2 = new Book("a tales of two cities", "charles dickson", false);
                //Book book3 = new Book("The pragmatic programmer", "Andrew Hunt david thomas", true);
                //Book book4 = new Book("Code complete", "steve mcConnell", true); 
                //List<Book>booksList = new ArrayList<>();
              // booksList.add(book1);
               //booksList.add(book2);
               
               
               //GradeCalculator g1 = new GradeCalculator ();
               //int[] score = {85, 92, 58, 97, 40, 109, 573, 54, 30, 2};
               //int[] score2 = {85, 92, 58, 105, -5};
             // String grade = g1.getLetterGrade(78);
             //System.out.println(grade);
               
               //for(int i = 0; i < score2.length; i++){ 
               //String grade = g1.getLetterGrade(score2[i]);
               //System.out.println("Score: " + score2[i] + " -->" + " Grade: " + grade);
               
//               CoffeeOrder c1 = new CoffeeOrder();
//               String[] CoffeeType = {"Latte","Espresso", "Mocha"};
//               double sum = 0.00;
//               for(int i = 0; i < CoffeeType.length; i++){
//               //for(String CoffeeTypes : CoffeeType){
//                 //System.out.println(CoffeeTypes);
//              double price = c1.getprice(CoffeeType[i]);
//              if(price == 0.0){
//                  System.out.println("unknown coffee type: " + CoffeeType[i]);
//                  } else {
//                    sum = sum + price;
//                  }
//                       
//               }
//        
//               System.out.println("Total cost for cart: " + "$" + sum);
//       
//
//          }
//        

        //  SecurityGate s1 = new SecurityGate(); 
         
        //  String result = s1.checkAccess("JavaRocks2026");
         
        //  System.out.println(result);
        // ATMSimulator a1 = new ATMSimulator();
        // int[] attempts = {1111, 1239, 4356, 5463 ,9426, 1234};
        // a1.atmCheckPIN2(attempts);
        // ArrayReverser r1 = new ArrayReverser();
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, "354"};

       // String[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, "354"};
        // r1.reverseArray(array);
        

        

        
        
        // ArrayList<Employee> employee = new ArrayList<>();
        // FullTimeEmployee f1 = new FullTimeEmployee("alice", 1009, 5000.0);
        // FullTimeEmployee f2 = new FullTimeEmployee("Tobi", 2000, 600.0);
        // HourlyEmployee h1 = new HourlyEmployee("propser", 3000, 20, 40);
        // HourlyEmployee h2 = new HourlyEmployee("Nadia", 2240 , 6, 15);
        // employee.add(f1);
        // employee.add(f2);
        // employee.add(h1);
        // employee.add(h2);
        // double totalPayroll = 0;
        // for( Employee e: employee){
        //         double pay = e.calculatePay();
        //         totalPayroll += pay;
        //         if(e instanceof FullTimeEmployee){
        //                 System.out.println(e.getName() + " (Full time): $" + pay);
        //         }else if (e instanceof HourlyEmployee){
        //                 System.out.println(e.getName() + " (Hourly): $" + pay);
        //         }
        // }
        // System.out.println("Total Payroll: $" + totalPayroll);
               
        // }



        ArrayList<MovieTicket> ticket = new ArrayList<>();
        MovieTicket m1 = new MovieTicket("Dune", "A1", 12.50);
        MovieTicket m2 = new MovieTicket("motana", "B2", 15.00);
        MovieTicket m3 = new MovieTicket("Harrypotter", "C1", 40.50);
        MovieTicket m4 = new MovieTicket("Badland", "D7", 60.00);
        ticket.add(m1);
        ticket.add(m2);
        ticket.add(m3);
        ticket.add(m4);
        double totalrevenue = 0;
        for(MovieTicket e : ticket){
                e.printTicket();
                totalrevenue += e.getprice();
        }
        System.out.println("Total totalrevenue: $" + totalrevenue);
}
}
        

        
         


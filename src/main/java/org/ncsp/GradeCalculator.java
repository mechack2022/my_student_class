/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ncsp;

/**
🎯 Objective
Practice using if, else if, and else statements to categorize numerical data.

💻 Requirements
Create a class GradeCalculator.
Write a method getLetterGrade(int score) that returns a String based on the score (90-100: A, 80-89: B, 70-79: C, 60-69: D, <60: F). Return "Invalid Score" for <0 or >100.
In main, loop through an array of test scores and print the results.
🧪 Test Cases & Expected Output
Input Array: {85, 92, 58, 105, -5}
Expected Output:

Score: 85 -> Grade: B
Score: 92 -> Grade: A
Score: 58 -> Grade: F
Score: 105 -> Grade: Invalid Score
Score: -5 -> Grade: Invalid Score
 */
public class GradeCalculator {
    
    
    
 public String getLetterGrade(int score){   
     
     if(score < 0 || score > 100){
         return "invalid score";
     }
     
     else if(score >= 90 && score <= 100){
         return "A";
     }
     else if(score >= 80 && score <= 89){
         return "B";
     }
     else if(score >= 70 && score <= 79){
         return "C";
     }
     else if(score >= 60 && score <= 69){ 
         return "D";
     }else {
         return "F";
     }
         
    
 }
 
 
 
}
                 
                 



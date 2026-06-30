/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ncsp;

/**
 *Create a class MultiplicationTable.
Write a method printTable(int number, int upTo) that prints the multiplication table for number from 1 up to upTo.
Example output for printTable(5, 5):
5 x 1 = 5
5 x 2 = 10 ...
In the main method, ask the user to input a number and a limit (using Scanner), or just hardcode values to test the method.
🧪 Test Cases & Expected Output
Input: printTable(4, 3)
Expected Output: 
 * @author decagon
 */
public class MultiplicationTable {
    
    public static void main(String[] args){
       MultiplicationTable m1 = new MultiplicationTable();
        m1.printTable(5,5);
    }
    
    public void printTable(int number, int upTo){
        for(int i  = 1; i <= upTo; i++){
        System.out.println(number + " x " + i + " = " + (number * i)); 
        
    
}
    }
}

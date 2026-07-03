/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ncsp;

/**

 */
public class CoffeeOrder {
    
    
 public double getprice(String coffeeType){
     
      
      switch(coffeeType){
          case "Latte": 
              return 4.00;
          case "Americano":
              return 3.00;
          case "Espresso":
              return 2.50;
          case "Cappuccino":
                return 4.50;
          default:
              return 0.00;
             
     }
 }
}



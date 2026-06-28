/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ncsp;

/**
 *### 🎯 Objective
Practice comparing Strings correctly using `.equals()` and `.equalsIgnoreCase()`.

### 💻 Requirements
1. Create `SecurityGate` with constant `CORRECT_PASSWORD = "JavaRocks2026"`.
2. Write `checkAccess(String userInput)`: exact match returns true. Case-insensitive match prints a warning and returns false. No match prints "Access Denied" and returns false.

### 🧪 Test Cases & Expected Output
**Inputs:** `"JavaRocks2026"`, `"javarocks2026"`, `"WrongPassword"`
**Expected Output:**
```text
Testing: JavaRocks2026 -> Access Granted: true
Testing: javarocks2026 -> Warning: Case mismatch! Access Granted: false
Testing: WrongPassword -> Access Denied. Access Granted: false

### 🌿 Git Workflow
1. Create a new branch from `main` named: `task/cond-3-password-gate`
2. Write your code and commit with a clear message.
3. Push the branch and open a Pull Request (PR) to `main`.
 * @author decagon
 */
public class SecurityGate {
    
   private final String  CORRECT_PASSWORD = "JavaRocks2026";
    
    
    
    
public String checkAccess(String userInput){ 
    if(CORRECT_PASSWORD.equals(userInput)){ 
        return"Testing: "+ userInput + " -> Access Granted: " + CORRECT_PASSWORD.equals(userInput) ;
      }    
     else if(CORRECT_PASSWORD.equalsIgnoreCase(userInput)){
      return "Testing: "+ userInput + " -> Access Granted: " + CORRECT_PASSWORD.equals(userInput) ;
              
     }else{    
         return "Testing: "+ userInput + " -> Access Denied. " + " Access Granted :" +  CORRECT_PASSWORD.equals(userInput);
     }
    
    //System.out.println("Testing: " + userInput1 + "-->" + " Access Granted:" + " " + CORRECT_PASSWORD.equalsIgnoreCase(userInput1));
    //System.out.println("Testing: " + userInput2 + "-->" + " Warning:" + " Case mismatch!" + " Access Granted:" + " " + CORRECT_PASSWORD.equals(userInput2));
   // System.out.println("Testing: " + userInput3 + "-->" + " Access Denied." + " Access Granted:" + " " + CORRECT_PASSWORD.equals(userInput3));
   
}
}


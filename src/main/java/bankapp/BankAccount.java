/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

public class BankAccount {
    
    
    private int accountNumber ;
    private String accountName;
    private int accountBalance;
    private int amountdeposited;
    private int totalwithdraw;
    
    public BankAccount(){
        }
    
    public BankAccount(int accountNumber, String accountName, int accountBalance){
        this.accountNumber = accountNumber;
        this.accountName =  accountName;
        this.accountBalance = accountBalance;
    }
    
    public int deposit(int anyamount){
        accountBalance = accountBalance + anyamount;
        return accountBalance;
    }
    
    public int withDraw(int amount){
       accountBalance = accountBalance - amount;  
        return accountBalance;  
    }
    
    public void checkBalance(){
        System.out.println(accountBalance);
        
     }  
    
    
}     
           

   


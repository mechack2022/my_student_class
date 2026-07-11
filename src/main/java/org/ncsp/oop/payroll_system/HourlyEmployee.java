package org.ncsp.oop.payroll_system;

public class HourlyEmployee  extends Employee{
    private int hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, int hourlyRate, int hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
     public double calculatePay(){
       return (double) hourlyRate * hoursWorked;
       // return totalhour;

     }

}

package org.ncsp.oop.employee_record;

public class Employee {

    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String setSalary(double salary) {
        if (salary >= 30000) {  
            return "Final salary: $" + salary;     
        } else if (salary < 30000){
            return "Error: Salary cannot be below minimum wage";   
    }
      return "";
     }
    public void setId(int id) {
        this.id = id;
    }
}

    
   




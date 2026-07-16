package org.ncsp.oop.employee_record;

public class EmployeeMain {
     public static void main(String[] args) {
        Employee e1 = new Employee();
       String result1 = e1.setSalary(25000);
       System.out.println(result1);
        String result2 = e1.setSalary(50000);
        System.out.println(result2);
        e1.setName("Tobi");
        e1.setId(1005);
        System.out.println("Name : " + e1.getName() + " , " + "ID " + e1.getId());


}
}

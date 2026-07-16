package org.ncsp.oop.smartphone_battery;

public class SmartphoneMain {
     public static void main(String[] args) {
        Smartphone m1 = new Smartphone("iphone ", 89);
         String charging = m1.charge(110);
         System.out.println(charging);
          String using = m1.usePhone(150);
          System.out.println(using);
        String display =  m1.displayStatus();
        System.out.println(display);
       

}
}

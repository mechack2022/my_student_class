package org.ncsp.oop.smartphone_battery;

public class Smartphone {

    private String brand;
    private int batteryLevel;



    public Smartphone(String brand, int batteryLevel) {
        this.brand = brand;
        this.batteryLevel = batteryLevel;
    }

    public void charge(int amount){
        batteryLevel += amount;
        if(batteryLevel > 100){
            batteryLevel = 100;
            System.out.println("battery capped at 100%"); 
        }
    }
        public void usePhone(int drain){
            batteryLevel -= drain;
            if(batteryLevel < 0){
                batteryLevel = 0;
                System.out.println("phone died! Battery at 0%");
            }
        }
            public void  displayStatus(){
               System.out.println("Brand " + brand);
               System.out.println("Batterylevel " + batteryLevel);
                


            }
        


        }


    






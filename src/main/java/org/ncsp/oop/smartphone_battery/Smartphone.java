package org.ncsp.oop.smartphone_battery;

public class Smartphone {

    private String brand;
    private int batteryLevel;



    public Smartphone(String brand, int batteryLevel) {
        this.brand = brand;
        this.batteryLevel = batteryLevel;
    }

    public String charge(int amount){
        batteryLevel += amount;
        if(batteryLevel > 100){
            batteryLevel = 100;
            return "battery capped at 100%"; 
        }
        return "";
    }
        public String usePhone(int drain){
            batteryLevel -= drain;
            if(batteryLevel < 0){
                batteryLevel = 0;
                return "phone died! Battery at 0%";
            }
            return "";
        }
            public String displayStatus(){
               return "Brand " + brand +  " , Batterylevel " + batteryLevel;

        }
    }
    



    






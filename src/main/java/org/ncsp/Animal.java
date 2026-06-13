package org.ncsp;


public  class Animal {

    public static void main(String[] args){
//      animalName();
//      color();
        Animal animal = new Animal();
        animal.animalName("Dog");
        animal.animalName("Goat");
        animal.animalName("Lion");
        animal.sumOf10(10);
    }

     public String animalName(String animalName){
         System.out.println(animalName);
         return animalName;
     }

     private int sumOf10(int MaxNumber){
        int sum = 0;
        int i = 0;
        while( i <= 10){
            sum += i;
            i++;
        }
         System.out.println(sum);
        return sum;
     }
   // create a variable to hold max number and initial it as  0
    //[3, 7, 2, 9, 4, 1]
    public static int findMax(int[] arr) {
       return 2;
    }


    public static int printnumbersaRRAY(int[] arr) {
      return 0;
//        System.out.println(numbers[])
    }
    public  static  void color(){
        System.out.println("blue");
    }

}

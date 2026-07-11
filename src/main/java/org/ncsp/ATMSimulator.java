package org.ncsp;

public  InnerATMSimulator {

    
}  class ATMSimulator {
    
static final int CORRECT_PIN = 1234;


//public static void main(String[] args) {
// /    int[] attempts = {9999, 1111, 1234};
// //     String result = "";
// //     for(int i = 0; i < attempts.length; i++){
// //         if(attempts[i] == CORRECT_PIN){
// //             result = "Attempts" + (i + 1) + "Access Granted";
// //             System.out.println(result);
// //             break;
// //         }else{
// //            result = "Acesss" + (i + 1) + "Incorrect PIN";
// //            System.out.println(result);

// //         }
////     }
// public String atmCheckPIN(int[] attempts){
//     String result = "";
//     for(int i = 0; i < attempts.length; i++){
//         if(attempts[i] == CORRECT_PIN){
//             result =  "Attempts " + (i + 1) + " :Access Granted";
//             if(result.contains("Access Granted")){
//                 break;
//             }
//              result = "Attempts " + (i + 1) + " :Incorrect PIN";
//         }
         
//         }
//         return result;
//     }

    public void atmCheckPIN2(int[] attempts){
    
    int start = 0;
    int end = attempts.length -1;
    while(start <= end){
       if(attempts[start] == CORRECT_PIN){
        System.out.println("Attempts " + (start + 1) + " :Access Granted");
        break;
       }
       else{
        System.out.println("Attempts " + (start + 1) + " :Incorrect PIN");
       }
       start++;
    }
    
    }
}




package org.ncsp.classesMethod;

//private, public,



public class SampleSchool {

     // properties of a school as an object
    //schoolName;
    //NumberTeacher
    //NumberStudent
    //NumberClass
    //Location

    public String schoolName = "Brillant International School";
    public int numberOfTeacher = 100;
    public int numberOfStudent = 120;
    public int numberOfClass = 10;
    public String locacation = "Ajagboto Idanre akure";


   // Function of the school
   // RegisterStudent
    //RegisterStaff
    //allocateClassToStudent
    //allocateClassToTeacher
    //report number student in school
    // report number teacher in the school
    // report number of room on the school
   // report the total number of student in a class


    public void registerStudent(){
       numberOfStudent =  numberOfStudent + 1;
        System.out.println(" 2 Total number of student in " + schoolName + " is : "  + numberOfStudent );
    }

    public int registerAnyNumberStudent(int number){
        numberOfStudent =  numberOfStudent + number;
//        System.out.println(" 2 Total number of student in " + schoolName + " is : "  + numberOfStudent );
        return numberOfStudent;
    }

    public int totalNumberOfNumber(){
        return numberOfStudent;
    }




}

package javaders.day37exceptionsennums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {
    /*
    1. try kullandigimizda her senaryo icin calismasini istedigimiz kodlari "finally block " icine koyariz.
        finally catch olmadan da calisir.ama genellikle try catch ile birlikte olur. finally sadece try ile birlikte calisir.

    2. "final", "finally", "finalize", aciklar misiniz?
     memory'e lazim olan seyleri koyariz. memoryde fazlalik kullanilmayan bise gordugunde Javada "Garbage Collector" memorty'i tarar ve silinmesi gerekenleri siler.
     silinmesi gerekenleri silmeden once bir yere toplar ve sonrasinda siler. bu isleme "finalize" denir.

     */
    public static void main(String[] args) throws IllegalGradeException {

        //EX2. soru

        try {
            printAge(-45);
        }catch(IllegalAgeException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("I always work");
        }

    // EX: ogrenci notlarini bir List'e ekleyen methodu olusturunuz.

        System.out.println(getGrades());// ilk sorunun
        }


    public static List<String> getGrades() throws IllegalGradeException {

        List<String> grades = new ArrayList<>();
        String grade = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter the grade. To stop entering press q.");
            grade = input.next();// String grade

            int intGrade = 0;

            if(!grade.equals("q")) {
                intGrade = Integer.valueOf(grade);// Strin grade' int grade oldu
            }

            if(grade.equals("q")){//60 "q" mu? degil false
                break;
            } else if(intGrade>=0 && intGrade<=100){// false olunca buraya gelecek ve tru verecek. 123 icin ise false verecek.
                grades.add(grade);// ve 60'i buraya ekleyecek. false olunca da exception verecek.
            }else{
                throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid.");
            }

        }while(!grade.equals("q"));//60 "q" olmadigi icin tru olacak ve basa donecek.

        return grades;
    }
// Custom Exception urettik. Compile time oldu, cunku exception'a uzandik.




 //Ex2: Kullanicinin yasini konsola yazdiran methodu olusturunuz.
    public static void printAge(int age){
        System.out.println(age);
        if(age<0){
            throw new IllegalAgeException("Ages cannot be negative");
        }

    System.out.println(age);
    }

}

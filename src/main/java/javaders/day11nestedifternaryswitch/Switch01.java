package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01 {

    /*
        Kullanicidan Gun isimlerini aliniz ve o gunun kacinci gun oldugunu yazdiriniz.
        1==> Pazar, 2==> Pazartesi, 3==> Sali, 4==> Carsamba, 5==> Persembe, 6==> Cuma, 7==> Cumartesi

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day name...");
        String dayName = input.next();

        //1.Way
        if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Sunday is the first day");
        }else if(dayName.equalsIgnoreCase("Monday")){
            System.out.println("Monday is the second day");
        }else if(dayName.equalsIgnoreCase("Tuesday")){
            System.out.println("Tuesday is the third day");
        }else if(dayName.equalsIgnoreCase("Wednesday")){
            System.out.println("Wednesday is the fourth day");
        }else if(dayName.equalsIgnoreCase("Thursday")){
            System.out.println("Thursday is the fifth day");
        }else if(dayName.equalsIgnoreCase("Friday")){
            System.out.println("Friday is the sixth day");
        }else if(dayName.equalsIgnoreCase("Saturday")){
            System.out.println("Saturday is the seventh day");
        }else{
            System.out.println("Invalid day name");
        }


        //2.Way
        switch (dayName.toLowerCase()){

            case "sunday":
                System.out.println("Sunday is the first day");
                break;
            case "monday":
                System.out.println("Monday is the second day");
                break;
            case "tuesday":
                System.out.println("Monday is the thirdday");
                break;
            case "wednesday":
                System.out.println("Monday is the fourth day");
                break;
            case "thursday":
                System.out.println("Monday is the fifth day");
                break;
            case "friday":
                System.out.println("Monday is the sixth day");
                break;
            case "saturday":
                System.out.println("Monday is the seventh day");
                break;
            default:
                System.out.println("Invalid day name");

        }


        char m ='A';

switch (m){
    case'A':
       System.out.println("firs");
       break;
    case 'b':
      System.out.println("sec");
      break;
    case 'c' :
      System.out.println("th");
    case 'd':
      System.out.println("fou");
    default:
        System.out.println("what");
}

    }
}

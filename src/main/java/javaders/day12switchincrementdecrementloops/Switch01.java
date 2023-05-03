package javaders.day12switchincrementdecrementloops;

public class Switch01 {
    public static void main(String[] args) {

       //EX: Ay numarasi verildiginde ay'in ismini consol'a yazdiran kodu yaziniz.

        int monthNumber = 3;        // break demek, belirledigin numaraya gelene kadar ki tum kodlari calistirir.
                                    // break gordugunde durur ve bir sonrakini calistirmaz, yazmazsak break gorene kadar tum kodlari calistirir.
        switch (monthNumber){       // tum aylari yazdirmami istiyorsa sondaki haric tum break'leri kaldirmaliyiz.

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("Aprel");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");

        }

        /*
                switch parantezi icinde "String", "int", "by", "short" ve "char" kullanilabilir.
                long: cok fazla deger olacagi icin izin vermez. float ve double ondalikli oldugu icin kullanilmaz.
                boolean da da zaten iki deger var o zaman "if" kullanirsin.
         */



        //EX: Ay numarasi verildiginde numarasi verilen ay'in ismini ve December'a kadar ki tum aylari consol'a yazdiran kodu yaziniz.

        int monthNumber1 = 23;
        switch (monthNumber1) {

            case 1:
                System.out.println("January");
                //break;
            case 2:
                System.out.println("February");
                // break;
            case 3:
                System.out.println("March");
                //break;
            case 4:
                System.out.println("Aprel");
                //break;
            case 5:
                System.out.println("May");
                //break;
            case 6:
                System.out.println("June");
                //break;
            case 7:
                System.out.println("July");
                //break;
            case 8:
                System.out.println("August");
                //break;
            case 9:
                System.out.println("September");
                // break;
            case 10:
                System.out.println("October");
                //break;
            case 11:
                System.out.println("November");
                //break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");
        }












        }
}

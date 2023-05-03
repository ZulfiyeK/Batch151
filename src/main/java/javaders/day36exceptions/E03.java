package javaders.day36exceptions;

public class E03 {

    /*
    throws ile throw arasindaki farklar nelerdir.
    1. "throws" methos signature satirinda kullanilir. "throw" ise method body icinde kullanilir.
    2. "throws" methos signature satirinda bir veya birden fazla exception ile bir kez kullanilabilir.
       "throw" ise method body icinde bir tane Exception ile tekrar tekrar kullanilir.
    3. "throws" dan sonra sadece Exception Class isimleri yazilir.
        "throw" dan sonra ise exception Class'tan sonra object olusturulur.
         throw : hata at demek
     */
    public static void main(String[] args) {
        printAge(23);
        try {
            printAge(-12);
        }catch (IllegalArgumentException e){
            System.out.println("Negative ages are not valid");
        }
    printAge(-9);
    }
 //EX1 : kullanicidan alina  yas'i console'a yazdiran method'u olusturunuz.
 public static void printAge(int age){

        if(age<0){
            throw new IllegalArgumentException("Used negative integers for ages");//printAge(-9); icin not
        }
     System.out.println(age);

 }
}

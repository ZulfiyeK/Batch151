package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alan ve dort islem yapan ve sonuclari ekrana yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double firstNumber = input.nextDouble();
        double secondNumber =  input.nextDouble();

        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);



      }
}

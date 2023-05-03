package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        /*
            Kullanicidan bir sayi aliniz o sayi pozitif ise ekrana "pozitif" yazdiriniz,
            degilse ekrana "pozitif degil" yazdirin/

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int sayi = input.nextInt();

        String result = sayi>0 ? "pozitif" : "pozitif degil";
        System.out.println(result);








    }
}

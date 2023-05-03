package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {

        /*
        Kullanicidan aldiginiz character'in sesli harf olup olmadigini kontrol ediniz.
        Sesli harfler: a-e-o-u-i

         */
        Scanner input = new Scanner(System.in);
  /*      System.out.println("Pleas enter a letter");
        char letter = input.next().charAt(0);// toUpperCase,toLovercase char icin calismaz, o yuzden buyuk harfleri de eklemek zorundayiz.
    //1.way
        switch (letter){
            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'i':
            case 'A':
            case 'B':
            case 'O':
            case 'U':
            case 'I':
                System.out.println("It is a vowel.");
                break;
            default:
                System.out.println("It is not vowel.");

        }
*/

        //2.way
        System.out.println("Pleas enter a letter.");
        String letter2 = input.next().substring(0,1).toLowerCase();//substring(0,1) ilk indeksi haric tut birinciyi al
        switch (letter2) {
            case "a":
            case "e":
            case "o":
            case "u":
            case "i":

                System.out.println( " It is a vowel.");
                break;
            default:
                System.out.println( " It is not vowel.");
        }



    // 3.way

        System.out.println("Pleas enter a letter.");
        String letter3 = input.next().substring(0,1);//substring(0,1) ilk indeksi haric tut birinciyi al
        switch (letter3) {
            case "a":
            case "e":
            case "o":
            case "u":
            case "i":
            case "A":
            case "E":
            case "O":
            case "U":
            case "I":
                System.out.println(letter3 + " is a vowel.");
                break;
            default:
                System.out.println(letter3 + "is not vowel.");

        }


        }

}

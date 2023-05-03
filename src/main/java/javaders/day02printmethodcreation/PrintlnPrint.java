package javaders.day02printmethodcreation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintlnPrint {

    public static void main(String[] args) {
/*
\n her bir karakteri bir alt satirda yazdiri.
 */
        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        // bir harf  bir alt satirda olacak sekilde yazdiriniz

        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");
        System.out.println("****** 1.YOL ***********");


        //2.YOK
        // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
        //  bir harf  bir alt satirda olacak sekilde bir sout ile yazdiriniz

        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");
        System.out.println("****** 2.YOL ***********");

          // JAVA ILE GUZEL DUNYA ifadesinin her bir kelimesini alt satira
          // yazdiran kodu tek bir sout ile yazdiriniz.
        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");


        // JAVA ILE GUZEL DUNYA ifadesinin her bir kelime arasinda 1 tab bosluk birakan
        //  kodu yaziniz
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");
        // \t de harf sayisi onemlidi yoksa esit aralik birakmaz

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz

        System.out.println("\"Techpro \" ile java cok ' kolay ' ");


        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"

        System.out.println("\" MAHARET\" hic 'DUSMEMEK' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");

        //System.out.print(); yazarsak sonraki kod imlecin kaldigi yerden yazmaya devam eder.
        //System.out.println(); yazarsak "ln" den imlec bir alt satira gecer.


        //  Print ile Println arasindaki farklar
        // ln ==> line next bir sonraki satira gec

        System.out.println("**************** 1 *****************");
        System.out.print("Ali");
        System.out.println("Can");
        //AliCan yazdirir
        System.out.println("**************** 2 *****************");
        System.out.println("Ali");
        System.out.print("Can");
        //Ali
        //Can  yazdirir

        System.out.println("**************** 3 *****************");
        System.out.print("Ali");
        System.out.println("Can");
        //Can**************** 3 *****************
        //AliCan

        // Ex)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
        /*
                  A
                 A A
                A A A
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter veriniz");

        char ch = input.next().charAt(0);//Ali HAKKI
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);







    }




}

package practices.day01;

import java.util.Scanner;

public class C04_Dikdortgen {

    public static void main(String[] args) {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen a kenari uzunlugunu giriniz");
        int a = scan.nextInt();

        System.out.println("Lutfen b kenari uzunlugunu giriniz");
        int b = scan.nextInt();

        System.out.println("Dikdortgenin Cevresi=" +(2*(a+b)));



    }

}

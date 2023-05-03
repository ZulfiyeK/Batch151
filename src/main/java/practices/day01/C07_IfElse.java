package practices.day01;

import introduction.day03scanner.Scanner01;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {


        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        int ilkSayi = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int ikinciSayi = scan.nextInt();


        if (ilkSayi>ikinciSayi){
            System.out.println("ilk sayi ikinci sayidan buyuktur");// 5,3 ilk sayi ikinci sayidan buyuktur

        }else{
            System.out.println("ilk sayi ikinci sayidan buyuk degildir");//6,9 veya 5,5 icin ilk sayi ikinci sayidan buyuk degildir

        }
















    }

}

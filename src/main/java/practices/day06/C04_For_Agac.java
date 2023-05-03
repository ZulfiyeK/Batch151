package practices.day06;

import java.util.Scanner;

public class C04_For_Agac {
    public static void main(String[] args) {

  /*
         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız

        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yaprak satir sayisini giriniz");
        int yaprakSatirSayisi = scan.nextInt();

        System.out.println("Lutfen govde satir sayisini giriniz");
        int govdeSatirSayisi = scan.nextInt();


        String yaprak = "";
        for (int i = 0; i < yaprakSatirSayisi; i++) {
            yaprak = yaprak + "^";
            System.out.println(yaprak);
        }

        for (int i = 0; i < govdeSatirSayisi; i++) {
            System.out.println("|||");// her dongude yazdirma islemi yazdirmak istemiorsak loop disinda sout yapmak gerek
        }


    }
}

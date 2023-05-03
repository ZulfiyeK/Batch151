package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class D_Loops01 {

        public static void main(String[] args) {
            System.out.println();
//EX: 21'den 180'e kadar hem 4 hem de 6 ile bolunebilen tam sayilari ekrana yazdiran kodu yazdiriniz.
            //tekrar oldugu icin loop kullanmaliyiz.
            for (int i = 21; i < 181; i++) {
                if (i % 4 == 0 && i % 6 == 0) {
                    System.out.print(i + " ");//24 36 48 60 72 84 96 108 120 132 144 156 168 180
                }
            }


            System.out.println();
//EX: Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz.


            String s1 = "trabzon";

            for (int i = 0; i < s1.length(); i++) {
                String ch = s1.substring(i, i + 1);//substringde birinciyi dahil et' ikinciyi dahil etme diyor. +1 yaparak cift ilerliyoruz.
                if (i % 2 == 0) {                                                    //ch = karakter demek icin kisaca ch yazariz.
                    System.out.print(ch.toUpperCase());//TAZN
                }

            }


            // bir Strinde lengt() hesaplanirken karakter sayisi ne kadarsa o kadar yazilir.
            //Ama indeks hesaplamasi 0 dan baslayacagi icin herzaman lengt den 1 eksik olur.
            // Bu yuzden son index == length()-1 yazilir.boylece dinamik bir yapi kazanir.
            //yazilan kodlar beli senaryolar icin calisiyor belli seneryolar icin calismiyorsa
            //bu tarz kodlara "Hard Code" denir.

            System.out.println();
            //EX: kullanicidan baslangic ve bitis degerlerini alin.
            // baslangic ve bitis degerleri dahil aralarindaki tum cift sayilari
            // while loop kullanarak ekrana yazdiriniz.

            Scanner input = new Scanner(System.in);

            System.out.println("Pleas enter a first number..");
            int bDeger = input.nextInt();
            bDeger = Math.abs(bDeger);

            System.out.println("Pleas enter a last number..");
            int bitisDeger = input.nextInt();
            bitisDeger = Math.abs(bitisDeger);

            int sum = 0;
            while (bDeger < bitisDeger) {
                if (bDeger % 2 == 0) {
                    System.out.print(bDeger + " ");
                }
                bDeger++;
            }


        }
    }


package practices.day05_looparrays;

import java.util.Scanner;

public class C01_cdenOncekia {
    public static void main(String[] args) {

  /*

      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
   'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.

   */

//********* 1. yol ******************
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 'c' ve 'a' iceren bir kelime giriniz");
        String klm = input.nextLine().toLowerCase();

        int counter = 0;//toplama ve cikarma islemlerinde default deger sifirdir.carpma ve bolmede birdir.Stringler icin hicliktir.
        for (int i = 0; i < klm.indexOf("c"); i++) {
            if (klm.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println("c'den once " + counter + "a vardir. ");// babacigim icin --c'den once 2a vardir.



//************ 2. yol ****************

        System.out.println("Lutfen 'c' ve 'a' iceren bir kelime giriniz");
        String klm1 = input.nextLine().toLowerCase();
        int counter1 = 0;
        if (klm1.contains("c") && klm1.contains("a")) {
           for (int i = 0; i < klm1.length(); i++) {
                if (klm1.charAt(i) == 'a') {
                    counter1++;
                }else if(klm1.charAt(i) == 'c'){
                    break;
                }
            }
            System.out.println("C'den onceki a sayisi " + counter1);

        } else {
            System.out.println("Lutfen c ve a harflerini iceren kelime giriniz");
        }

        }

    }


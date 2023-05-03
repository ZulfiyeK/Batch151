package practices.day03;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {



        /*
Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
Eger İlk kelimenin karakter sayısı çift ise,
 ikinci kelimeyi birinci kelimenin ortasına koyun.
İlk kelimenin karakter sayısı tek ise, konsola
"ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk kelimeyi giriniz");
        String kelime1 = input.next().toLowerCase();//anne

        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String kelime2 = input.next().toLowerCase();

        if((kelime1.length())%2==0) {
            String ilkYarisi = kelime1.substring(0, kelime1.length() / 2);
            String sonYarisi = kelime1.substring(kelime1.length() / 2);
            System.out.println(ilkYarisi + kelime2 + sonYarisi);
        }else{
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi" +
                    " koyamazsin cunku ilk kelime tek karakterli");
        }













        }
}

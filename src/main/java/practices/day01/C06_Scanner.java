package practices.day01;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {


        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Isminizi ve Soyisminizi giriniz");
        String isimSoyisim = scan.nextLine().toUpperCase();

        char isimIlkKarakter = isimSoyisim.charAt(0);
        char soyIsimIlkKarakter = isimSoyisim.charAt(isimSoyisim.indexOf(" ")+1);// Soy isminin ilk harfini bulmak icin indexOf'u kullanmamiz gerekiyor

        System.out.println("isimIlkKarakter+soyIsimIlkKarakter = " +isimIlkKarakter + soyIsimIlkKarakter); //orhan kacagan
                                                                                                            //isimIlkKarakter+soyIsimIlkKarakter = OK











    }
}

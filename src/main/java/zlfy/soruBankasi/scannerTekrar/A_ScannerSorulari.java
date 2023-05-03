package zlfy.soruBankasi.scannerTekrar;

import java.util.Scanner;

public class A_ScannerSorulari {
    public static void main(String[] args) {


//1. Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk tam sayiyi giriniz");
        int ilkSayi= input.nextInt();//10

        System.out.println("Lutfen ikinci tam sayiyi giriniz");
        int ikinciSayi= input.nextInt();//5

        System.out.println("ilkSayi+ikinciSayi: "+ (ilkSayi+ikinciSayi));//ilkSayi+ikinciSayi: 15
        System.out.println("ilkSayi-ikinciSayi: "+ (ilkSayi-ikinciSayi));//ilkSayi-ikinciSayi: 5
        System.out.println("ilkSayi*ikinciSayi: "+ (ilkSayi*ikinciSayi));//ilkSayi*ikinciSayi: 50


//2.Kullanicidan karenin uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin.

        System.out.println("Lutfen bir kenar uzunlugu giriniz");
        int kenar= input.nextInt();

        System.out.println("karenin cevresi:" +kenar*4);//karenin cevresi:32
        System.out.println("karenin alani:" +kenar*kenar);//karenin alani:64

//3.Kullanicidan yari cap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

       // alan= pi*r*r      cevre =2pi*r
        System.out.println("Lutfen yari cap giriniz");
        double yariCap= input.nextDouble();

        System.out.println("Cemberin Alan: " + (3.14*yariCap*yariCap ));//Cemberin Alan: 50.24
        System.out.println("Cemberin Cevresi: " + (2*3.14*yariCap ));//Cemberin Cevresi: 25.12

//4.Kullanicidan dikdortgenler prizmasinin uzun,kisa kenarlarini ve yuksekligini isteyip prizmanin hacmini hesaplayip yazdiriniz.


        System.out.println("Lutfen prizmanin uzun kenarini giriniz");
        int uzunK = input.nextInt();

        System.out.println("Lutfen prizmanin kisa kenarini giriniz");
        int kisaK = input.nextInt();

        System.out.println("Lutfen prizmanin yuksekligini kenarini giriniz");
        int yukseklik = input.nextInt();

        System.out.println("hacim = " + (kisaK*uzunK*yukseklik));//hacim = 90

/*
5.Kullanicidan ismini ve soy ismini alip asagidaki gibi yazdiriniz.
    Isminiz : Mehmet
    Soyisminiz : Bulut
    Kursumuza katiliminiz alinmistir, tesekkur ederiz.
 */

        System.out.println("Lutfen isminizi giriniz");
        String isim = input.next();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = input.next();

        System.out.println("Isminiz:" + isim+"\nSoyisminiz:" + soyIsim+"\nKursumuza katiliminiz alinmistir, tesekkur ederiz");




/*
 6.Kullanicidan ismini ve soy ismini alip aralarinda bosluk birakarak asagidaki sekilde yazdiriniz.
Isim-soyisim : Mehmet Bulutluoz
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz.");
        String isimSoyisim = scan.nextLine();
        System.out.println("Isim-soyisim : " + isimSoyisim);


//7. Kullanicidan ismini alip bas harfini yazdirin.

        System.out.println("Lutfen isminizi giriniz.");
        String name = scan.next();
        System.out.println(name.toUpperCase().charAt(0));// hem bas harfini hem de buyuk harfle yazdirdim



        System.out.println("Lutfen dakika giriniz");
        double dakika = input.nextInt();

        double saat = 24.0;
        double gun = 365;
        double dakika1= 60.0;

        double yil = (((dakika/60)/24)/365);
        System.out.println(yil);














    }
}

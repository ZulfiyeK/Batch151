package practices.day11;

public class C01_Instance {
    /*

    sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım.

*/
    int sayi;
    String isim;
    boolean ogrenciMi;


    public static void main(String[] args) {

        C01_Instance std = new C01_Instance();

        System.out.println(std.sayi);//0- default deger
        System.out.println(std.isim);//null- default deger
        System.out.println(std.ogrenciMi);//false- default deger


        C01_Instance std2 = new C01_Instance();
        std2.sayi = 5;
        std2.isim = "Ali";
        std2.ogrenciMi = true;

        System.out.println(std2.sayi);//5
        System.out.println(std2.isim);//Ali
        System.out.println(std2.ogrenciMi);//True

        //instance variable'ler objeye baglidir. hangi obje uzerinde degisiklik yapildiysa,
        // yapilan bu degisiklik sadece o objeyi baglar.

















    }
}

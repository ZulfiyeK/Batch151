package javaders.day03methodcreationscanner;

public class C03_MethodCreation {


    /*
       java'da method nasil olusturulur?

       1)main method'un disinda classin icinde olusturulur
       2)Access Modifier + Return Type + Method ismi + ()+ {}

      Olusturulan methodlar nasil kullanilir?
       1)main method'un icinden kullanilir
       2)method'un ismi + () yazin
       3)Islem yapacağınız parametreleri parantez icine koyun

      Scope == Kapsam Alani bir variable'in  bir degerin,
               hangi alanda kapsam icinde oldugunu gosterir

     */

    public static void main(String[] args) {

        // 1) Verilen iki sayiyi toplayan methodu olusturunuz
        toplamaYap(30, 87);

        // 2) Verilen 2 sayiyi carpan methodu yaziniz
        multiply(46, 12);

        //3) Verilen 3 sayidan ilk ikisini carpan ve sonucu
        // ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
        System.out.println("3 sayidan ilk ikiyi carp 3 ekle : " + firstTwoMultiplyThirdAdd(2, 3, 5) * 2);

        // 4) Verilen bir ondalikli sayinin kupunu hesaplayip kullandiran bir method olusturunuz  5.6
        double sayininKupu = getCube(5.6);
        System.out.println("sayininKupu = " + sayininKupu);

        //5) Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
        System.out.println("dairenin cevresi " + daireninCevresi(2));

    }//main

   //5.SORU
    private static int daireninCevresi(int r) {
        return 2 * 314 * r / 100;
        //Cevre= 2 * pisayisi * r  dir. r= yari cap
    }

    //4.SORU
    static double getCube(double v) {
        return v * v * v;
    }

    //3.SORU
    public static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return a * b + c;
    }

    //2.SORU
    private static void multiply(int a, int b) {
        System.out.println("carpma methodu : " + a * b);
    }

    //1.SORU
    static void toplamaYap(int a, int b) {
        // Access modifiers default oldugu icin bir sey yazilmadi
        System.out.println("toplama : " + a + b);
    }


}//class
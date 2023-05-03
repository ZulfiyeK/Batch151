package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {
    public static void main(String[] args) {

        /*

        - Java da farkli data type'lari arasinda islem yapiliyorsa sonuc buyuk olan data type'inin turunde olur.
        - Karsilastirma operatorlerinde sonuc hep boolean doner,
          (karsilastirma operatorleri: < , > , ==, <= , >= , &&, || )


         */

        System.out.println(4*(5+2)/3);//  28/3 = 9.333 bunu 9 olarak dondurur, cunku tam sayi(int) olarak alir ve virgulden sonrasini atar.

        double sonuc = (4*(2+5)/3);
        System.out.println(sonuc);

        double sonuc2 = 4.0*(2+5)/3;
        System.out.println("sonuc2 = " + sonuc2); //bunu 9.33333 olarak alir cunku double degerler vardir.

        System.out.println(4*(1+5)/3);// 8 sonuc verir cunku tamsayidir.


        int sayi1 = 5;
        int sayi2 = 2;
        double sayi3 = 2;
        System.out.println(sayi1/sayi2); //normalde 2.5 ancak tam sayi olmasi gerektigi icin tam sayi kismi alinir virgulden sonrasi atilir.

        System.out.println(sayi1/sayi3);//2.5 verir cunku int ile double isleme girmistir, double buyuk oldugu icin onun halini alir.
        System.out.println(sayi1+sayi3/sayi2);// sonuc 6.0 dir, double buyuk oldugu icin virgullu alir.
        boolean first = 2<4;
        boolean second = 2+6!=8;
        boolean third = 2+3*5<20;

        System.out.println("first = " + first);// true
        System.out.println("second = " + second); // false
        System.out.println("third = " + third);// true

        System.out.println(first&&second);//false
        System.out.println(first||second||third);// true

    }
}

package javaders.day04memorykullanimiwrapperclass;

public class C03_MantikOperatorleri {

    public static void main(String[] args) {

        /*

        Javada islem yaptiran
        == Esittir
        != Esit degildir.
        <  Kucuktur
        >  Buyuktur
        =  Atama operatoru

        1<5<6 bu ==>Sekilde uclu karsilastirma yapar ama uclu kiyas yapamaz. ikili yapabilir.
        1<5 && 5<6 ==> Java bu sekilde ikili kiyas yapip Mantik Operatorleriyle birlestirme yapar.

        && ==>  " ve hem " operatoru  mukkemmelliyetci yapidadir. True dondurmesi icin her iki sartinda saglanmasi gerekir.
        & ile && aradaki fark; her ikisinde de calisiyor, ayni degerleri veriyor sadece && daha guvenlikli,
          hata yakalama orani daha iyi.

          (3<5  && 5<4  && 8<7 ) herhangi bir hata bulursa tum satiri taramaz direk false verir.
          (3<5  & 5<4  & 8<7 ) herhangi bir hata bulsa bile tum satiri taramaya devam eder, ondan sonra False verir.
          bu sebeple & na gore && daha hizlidir.

        Cay ve Limon
        +   &&    +   ==> True;
        +   &&    -   ==> False;
        -   &&    +   ==> False;
        -   &&    -   ==> False;

        || ==> " veya " operatoru Polyannaci yapidadir. En ufak bir pozitif durumda pozitif verir, True dondurur.

        Cay veya Limon
        +   ||    +   ==> True;
        +   ||    -   ==> True;
        -   ||    +   ==> True;
        -   ||    -   ==> False;


         */
        System.out.println(5+2==8);//False
        boolean sonuc1 = 5>4 && 7<9 && 6+3== 9 && 5+2 != 8;// Trua
        System.out.println("sonuc1="+ sonuc1);
        boolean sonuc2 = 5>4 && 7>9 && 6+3== 9 && 5+2 != 7;//False
        System.out.println("sonuc2="+ sonuc2);

        int sayi1 = 15;
        System.out.println(10<sayi1||sayi1<20);//True

        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2>20); //True

        short a= 1000;
        System.out.println(a<15000 || a>28000 || a<-23);//True

        System.out.println(a<=1000 && a==1000 && a <12);// False








    }



}

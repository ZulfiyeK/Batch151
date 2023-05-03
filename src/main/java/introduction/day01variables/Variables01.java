package introduction.day01variables;


public class Variables01 {

    public static void main(String[] args) {
        //java bu satiri okumaz. kendimize veya baskasina aciklamadir.
        /*
        java bu satirlari da okumaz
         */

        //Variable olusturma
        //data type + variable name + atama operatoru + data + noktali virgul
             int           age             =             13          ;

                  // java cumlesi ==> Statemen
        //Data type+ Variable Name ==> Veriable Declaration.
        // Assigment Operator(atama operatoru)+ Veriable degeri==> Assigment
        // Eger variable Declaration yapar, assigment yapmazsaniz Java kendi degerlerini (default==> varsayilan) koyar
        //Default degerler sayilar icin sifirdir.
        //Dilbilgisindeki nokta ne ise javadaki noktali virgul ayni seydir ve statementin bittigini gosterir.
        // javada esittir demek "==". Yani Matematikte "=", javada "=="

        /*
        Javada temelde iki tip data vardir.
        1) primitiv data type:
              char, boolean, byte, short, int, long, float, double

        2) non- primitive data type:
             String
         */

        //Ornek 1: ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        // String'lere verilen degerler daima cift tirnak icinde olmalidir.
        String studentName = "Ali Can" ;


        //String bir veriable olusturup ona her hangi bir atama yapmazsak java
        // o veriable a default deger olarak "null" koyar.
        //null demek 0 demek degildir, 0 da coding te bir degerdir.
        // null demek ici bos obje demektir. yani icinde veriable ya da method
        //bulunmayan default obje demektir.
        //{}==> bos kume = null{0} ==>1 elemani var

        // char data type:
        // Tek karakterler icin kullanilir. ornegin==> A, x, ?, 5
        // Ornek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        // Not: char data type'inde degerler tek tirnak icine konulmalidir.
        char isminIlkHarfi = 'A' ;

        //boolean data type:
        //boolean'lar sadece iki farkli deger alabilir; true(dogru) yada false(yanlis)
        //Ornek 3 : boolean data type'inda emekli misin icin bir variable olusturun ve false degerini atayin.
        boolean emeklimisin = false ;

        //byte data type:
        // tam sayilar icindir, hafiizada 1 byte yer kaplar
        //byte:-128 den + 127 ye kadar tamsayi degerleri icin kullanilir.
        //ornek 4 : byte data type'inda ogrenci yasi icin bir veriable olusturunuz ve deger atayiniz.
        byte studentAge = 23 ;

        //short data type:
        // tam sayilar icindir. hafizada iki byte yer kaplar
        // short: -32768 ile 32767 tam sayilar icin kullanilir.
        //Ornek5 : Site nufusu icin bir veriable olusturun ve deger atayiniz.
        short siteNufusu = 1562;

        // int data type:
        // tam sayilar icindir. hafizada 4 byte yer kaplar.
        // int -2.147.483.648 ile 2.147.483.467 arasindaki sayilar icindir.
        //Ornek 6 : ulke nufusu icin bir veriable olusturun ve deger atamasi yapiniz.
        int countryPopulation = 2025422551 ;

        //long data type:
        //tam sayilar icin kullanilir, hafizada 8 byte yer kaplar.
        // long: -9223.372.036.854.775.808 ile 9.223.372.036.854.775.807 arasindaki sayilar icindir.
        //Ornek 7 : insan vucudundaki hucre sayisi icin veriable olustuurp deger atamasi yapiniz.
        //Note: bir deger long ise sonuna "L" (tercih edilir) veya "l" konulur.
        long hucreSayisi = 11211221545655L ;

        // Eger long'a atadiginiz deger int'lerin araliginda ise sonuna l koymaya gerek yok.
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int olarak kabul eder.

        //float data type:
        //float data tipi virgullu sayilar (ondalikli sayilar/ Decimal Numbers) icin kullanilir.
        // float hafizada 4 byte yer kaplar.
        //note: java ondalikli sayilari yani"decimal Numbers" i otomatik olarak double kabul eder.
        //eger float data type' i olmasinda israr ederseniz sonuna "F" yada "f" koymalisiniz.

        // ornegin fiyatlandirmalar icin tercih edilebilir. ( 12.99)
        //Ornek 8 : Gomlek ve ayakkabi fiyatlari icin iki tane veriable olusturup toplam fiyati ekrana yazdiriniz.

        float shirtPrice = 12.99F;
        float shoesPrice = 15.99F;

        System.out.println(shirtPrice + shoesPrice );
        //System.out.println(); yazdirmanin kisa yolu ==>sout yaz ve enter'a bas.

        int a = 12;
        int b = 13;
        System.out.println(a);
        System.out.println(b);

       // System.out.println(); ekrana yazdirir ve pointer i bir sonraki satira koyar.
       // System.out.print(); ekrana yazdirir ve pointer i ayni satirsa tutar.

        // double data type:
        // double data tipi Virgullu sayilar (Ondalikli Sayilar ==> Decimal Numbers) icin kullanilir.
        // double memoryde daha fazla yer kaplar, virgulden sonraki rakam daha fazla alir.
        //Ornek 8 : Hucre agirligi ve Amipin agirligi icin iki tane veriable olusturunuz ve agirliklari farkini
        //console a yazdiriniz.

        double weightCell = 0.0000000000000112;
        double weightAmip = 0.0000000000000023;
        System.out.println(weightCell - weightAmip );




















    }
}

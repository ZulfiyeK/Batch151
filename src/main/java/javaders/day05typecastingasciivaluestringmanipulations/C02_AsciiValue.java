package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {

    public static void main(String[] args) {



        /*

        javada char data typr'ni matematiksel islemlerde kulanirsaniz Ascii table'deki sayisal degerleri alir.
        int intKarakter = z; yazmak istedigimizde hata veriri, cunku numerik data tipindedir.

        Numeric Data Type: byte. short, int, long, float, double
        char data type sadece karakter ve resim barindirir.
        boolean data type sadece true ve false

        Java da char data type'ina int deger atanabilir Sembol haf vs de atanabilir.
        Cunku java'da char data type'nin ascii 'den gelen sayisal ve resim karakteri vardir.

         */


        // 'A' karakterinin ascii degerini hesaplatan kodu yaziniz

        int asciiDegeriA = 'A';
        System.out.println("asciiDegeriA = " + asciiDegeriA);//65

        int asciia = 'a';
        System.out.println("asciia = " + asciia);// 97

        int asciiUnlem= '!';
        System.out.println("asciiUnlem = " + asciiUnlem);//33

        int asciiSpace= ' ';
        System.out.println("asciiSpace = " + asciiSpace);//32

        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol);

        String isim = "Zeki";
        char karakter = 'z';
        char Sembol = '*';
        char Space = ' ';
        char rakam = '4';
        char sayi = '5';

        int deger= 20;
        char sembol1 = '$';
        System.out.println("sembol1+deger = " + (sembol1+deger));

        int deger1= 20;
        String sembol2 = "$";
        System.out.println("deger1+sembol2 = " + (deger1+sembol2));

        System.out.println(0+'+');// (0 + '+') parantez icinde oldugu icin toplama yapti ve 43 sonucuna ulasti
        System.out.println("0 + '+' = " + 0 + '+' );// (0 + '+') parantez icinde olmadigi icin yan yana yazar ve 0+ olarak sonuc verir.

        /*
        Javada (+) sembolu iki int icin matematikteki gibi toplama islmei yapar.
        iki String data arasinda yada bir String bir int arasinda ise yanyana yazdirir.
        buna "Concatination" denir. Java matematik bilir. Islem onceligine gore calisir.
                * uslu sayilari hesaplar
                * parantez ici
                * carpma yada bolme varsa ,siralamada once hangisi ise onu yapar.
                * toplama/ cikarma

         */

        String str1="Java";
        char str2='G';
        int sayi1=5;
        System.out.println(str1+str2+sayi1);// String ile herhangi bir datayi + ile topladigimizda string sonraki datayi kendine cevirir. JavaG5 sonuc veriri.
        System.out.println(str1+(str2+sayi1));//char ve int parantez icinde oldugu icin degerleri topladi ve Strin ile yanyana yazdi ve Java76 sonuc verdi
        System.out.println(str2+sayi1+str1);//burada da char ve int yanyana ve parantez yok, yine de topladi ve Strin ile yanyana yazdi,
                                            // cunku java yukaridan asagi ve soldan saga calistigi icin int ve chari topladi Strin ile yanyana yazdi

        char rakam1= '1';
        System.out.println("rakam1 = " + rakam1);

        char rakam2= '2';
        System.out.println("rakam2 = " + rakam2);

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);

        char rakam4= '4';
        System.out.println("rakam4 = " + rakam4);
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1+rakam2+rakam3+rakam4);// parantez olmadigi icin toplama yapmadi ve yanyana yazdi, yani "concatination" yapti
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + (rakam1+rakam2+rakam3+rakam4));// sonuc olarak 202 verdi,parantez icinde oldugu icin,
                                                                                             // ascii degerlerin toplamini (1==>49, 2==>50,3==>51, 4==>52) verdi.

        ///*************************Ascii Degerlerinden faydalanilarak Neler Yapilabilir ? ***************************\\\

        byte b = 5;
        char ch2 = 'h';
        System.out.println("b>ch2 = " +(b> ch2));// false = 5<104
        
        int asciih= 'h';
        System.out.println("asciih = " + asciih);//asciih = 104
       
        int ascii5 = '5';
        System.out.println("ascii5 = " + ascii5);//ascii5 = 53

        System.out.println("(b>ch2) = " + (b > ch2)); //False

        long l = 542168784578L;
        System.out.println("ch2>l = " + (ch2>l));//false

        float f= 2.45648f;
        double d= 2.19658;
        System.out.println("(f>d) = " + (f>d));//true

        System.out.println("(b<f) = " + (b<f));//false
        // kiyaslama yaptigi icin ascii value sini aliyor ve degerlerine gore kiyaslama yapiyor.

        byte sayi3 = 5;
        byte sayi4= 6;
        System.out.println("(sayi3<sayi4) = " + (sayi3 < sayi4)); // ayni tur oldugu icin zaten kiyaslama yapar'
                                                                  // ama farkli data tiplerinde kiyaslama yapabilmesi icin ascii tablodan alir.
        int sayiInt= 100;
        long sayiLong = 100L;
        System.out.println("(sayiInt<sayiLong) = " + (sayiInt<sayiLong));//False
        System.out.println("(sayiInt==sayiLong) = " + (sayiInt==sayiLong)); //true

        int sayiInt1= 200;
        long sayiLong1 = 100L;
        System.out.println("(sayiInt1<sayiLong1) = " + (sayiInt1<sayiLong1));//False
        System.out.println("(sayiInt1==sayiLong1) = " + (sayiInt1>=sayiLong1)); //true

        int sayiInt3= 9;
        char sayiChar= '9';
        System.out.println("(sayiInt3>=sayiChar) = " + (sayiInt3 >= sayiChar));//False' cunku kiyaslama yaptiklarinin arasinda numerik degeri yoksa ve tek tirnek icine alininca  ascii tabloya gidiyor.

        String str= "9";
       // HATA// System.out.println("(sayiChar>str) = " + (sayiChar>str)); String data type ile kiyas yapmaya izin vermiyor ve hata veriyor. cunku deger yok.

        String stra="Alpay" ;
        String strb= "Mehmet";

       //HATA //System.out.println("(stra>strb) = " + (stra>strb)); String ile Stringi de kiyaslamaz cunku degere yok.
        //charin ASCII tableden kaynakli bir numerik degeri vardir.







    }


}

package javaders.day08stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

        // *************** replaceFirst() ************\\

        /*

        replaceFirst(): replace() ile ayni isi yapmakla birlikte ilk gordugu datayi degistirir.

         */

        //ex: str Stringindeki "a" harflerinin yerine "e" harfi yerlestiriniz.

        String str = "Bizimle Java Ogrenmek Cok Kolay";

        String str1 = str.replaceFirst("i","e");
        System.out.println("str1 = " + str1);//str1 = Bezimle Java Ogrenmek Cok Kolay

        String str2 = str.replace("i","e");
        System.out.println("str2 = " + str2);//str2 = Bezemle Java Ogrenmek Cok Kolay

        // ***************** trim() ********************\\


        /*
             trim(): Bir String de bastaki ve sondaki space karakterlerini siler , ortadaki space karakterlerine dokunmaz.
             String bir data dondurur.

         */

        //ex: isim Stringindeki varsa bas ve sondaki space/bosluklari siliniz.

        String isim = "  Mehmet Fatih Yildirim   ";
        String trimStr1 = isim.trim();
        System.out.println("trimStr1 = " + trimStr1);//trimStr1 = Mehmet Fatih Yildirim
        System.out.println("isim = " + isim);//isim =   Mehmet Fatih Yildirim

        //ex: asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = "599.99$"  String Laptop = "299.99$"

        String tv = "599.99$";
        String tv2 = tv.replace("$","");// $ gordugum yere hiclik koy, yani aslinda $'i kaldir.
        System.out.println("tv2 = " + tv2);//tv2 = 599.99


        String Laptop = "299.99$";
        String Laptop2 = Laptop.replace("$","");
        System.out.println("Laptop2 = " + Laptop2);//Laptop2 = 299.99, $ gitti ama hala String bir data ve toplama yapamiyorum.

        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(Laptop2);
        System.out.println("totalPrice = " + totalPrice);//totalPrice = 899.98
        System.out.println("totalPrice = " + totalPrice+ "$");//totalPrice = 899.98$, $'i sonradan ekleyebiliriz, buna concat denir.



        /*
          valueOf() methodu, String bir datayi sayisal bir dataya cevirir,
           bu sayede islem yapabilecegimiz hale gelirdi

         */


        String tamIsim = "  mehmet fatih  ";

        //ex: Verilen tam isim Stringinin icindeki ilk ismin ilk harfi ile son ismin ilk harfini buyuk harf olarak yanyana yazdiriniz.

        char first = tamIsim.trim().toUpperCase().charAt(0);
        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("first+ second = " +first+ second);//first+ second = MF







    }
}

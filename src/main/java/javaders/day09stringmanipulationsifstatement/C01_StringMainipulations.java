package javaders.day09stringmanipulationsifstatement;

public class C01_StringMainipulations {
    public static void main(String[] args) {

        // ********************* isEmpty () ********************\\

         /*
        isEmpty () bosmu dolumu diye bakar
         */

// ex: Bir Stringin hic karakter icermedigini gosteren kodu yaziniz.

        String str = "";
        boolean bosMu = str.length()==0;
        System.out.println("bosMu = " + bosMu);//bosMu = true, iki is yaptirildi length()+==0 ile karsilama opretaru kullanildi.


        boolean bosMu2 = str.isEmpty();
        System.out.println("bosMu2 = " + bosMu2);//bosMu2 = true, bir is yaptirildi isEmpty() makbul olan bu dur.

        //ex: bir Stringin bosluk haric hic bir karakter icermedigini kontrol eden kodu yazini.

        String str2 = " ";
        boolean result = str2.replace(" ","").length()==0;//result = true
    //1.yol
        System.out.println("result = " + result);//result = true 1.yol

    //2.yol
        boolean result2= str2.replace(" ","").isEmpty();//result2 = true

        System.out.println("result2 = " + result2);// result2 = true


        //ex: bir Stringin * haric hic bir karakter icermedigini kontrol eden kodu yazini.

        String str3 = "*a";
        boolean rslt = str3.replace("*","").length()==0;
        System.out.println("rslt = " + rslt);//rslt = false


        boolean rslt2= str3.replace("*","").isEmpty();
        System.out.println("rslt2 = " + rslt2);//rslt2 = false

        //********************** isBlank() ******************\\
        /*

        String bir datada space + hiclik icin true dondurur. yani hiclik ve bosluk olsa da true dondurur.
        Bos mu dolu mu kontrol eder. Boolean deger dondurur.
        isEmpty den farkli olarak variable'de sadece space varsa bos mu dolu mu diye soruldugunda;
        isBlank == bos
        isEmpty == bos degil

         */
    //3.yol

        //String str3 = " ";
        boolean rslt3 = str3.isBlank();
        System.out.println("rslt3 = " + rslt3);//rslt3 = false

        //String str2 = " ";
        boolean result3= str2.isBlank();
        System.out.println("result3 = " + result3);//result3 = true

        boolean result4 = str2.isEmpty();
        System.out.println("result4 = " + result4);//result4 = false

        //****************** indexof() ******************\\

           /*
           indexof() methodu verilen karakter veya karakterlerin ilk gorunumunun indeksini verir
           tekli karakter icin de, coklu karakter icin de kullanilabilir.
            */

        //ex: Bir String'de a,i,e karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.

        String r = "Java is easy to Learn";

        int aIdx = r.indexOf('a');
        System.out.println("aIdx = " + aIdx);//1

        int iIdx = r.indexOf('i');
        System.out.println("iIdx = " + iIdx);

        int eIdx = r.indexOf('e');
        System.out.println("eIdx = " + eIdx);

        System.out.println("aIdx+iIdx+eIdx = " +(aIdx+iIdx+eIdx));//aIdx+iIdx+eIdx = 14

        // Ex : Bir String 'de "Java " kelimesinin ilk olarak kacinci index'de
        // kullanildigini gosteren kodu yaziniz
        String u = "Ah Java vah Java sen ne guzel seysin Java";

        int idxJava= u.indexOf("Java");
        System.out.println("idxJava = " + idxJava);//idxJava = 3,  coklu datalarda ilk gordugu indeksin degerini veriri.
                                                    // buyuk kucuk harf hassasiyeti var.


        int idxPhayton= u.indexOf("Phayton");
        System.out.println("idxPhayton = " + idxPhayton);//idxPhayton = -1, olmayan bir datayi istedigimizde her zaman -1 veriri.


        //************************* lastIndexof() **********************************\\

        /*

            lastIndexof() Methodu verilen bir datada istenilen bir karakter ya da karakterlerin son gorunumunun indexlerini veriri.
            olmayan bir datanin kacinci indexte oldugunu sorgulatursak bize -1 dondurr.


         */

        String v = "Java is easy to Learn";

        int aLastIdx = v.lastIndexOf('a');
        System.out.println("aLastIdx = " + aLastIdx);//aLastIdx = 18


        int iLastIdx = v.lastIndexOf('i');
        System.out.println("iLastIdx = " + iLastIdx);//iLastIdx = 5


        int eLastIdx = v.lastIndexOf('e');
        System.out.println("eLastIdx = " + eLastIdx);//eLastIdx = 17

        System.out.println("aLastIdx+iLastIdx+eLastIdx = " +( aLastIdx+iLastIdx+eLastIdx));//aLastIdx+iLastIdx+eLastIdx = 40





    }
}

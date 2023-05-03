package javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClass {

    /*

   Java da sonucta bir urundur. OracleFirmasinin bir urunudur. Devolaperler sadece data barindiran primitive ler gibi
   method da barindirmasini istemislerdir.Bunun uzerine java primitive data type larina method ekleyerek ;
   ozel bir class olusrturmuslar. buna da Wrapper (sarmalamak, durmek) class denir.
     */

    //primitive data type: char, boolean, byte, short, int,     long, float, double
    //Wrapper Class : Character, Boolean, Byte, Short, Integer, Long, Float, Double

    // Wrapper Class'lar non-primitive'dir. Memory'de cok yer kapladiklari icin sart degilse
    //kullanmayi tercih etmeyiz. Ancak boyle bir imkanin varligindan haberdar olmaliyiz.

    public static void main(String[] args) {


        byte primitiveByte =12;
        Byte wrapperByte = 12;

        //byte data type'nin en buyuk ve en kucuk degerini ekrana yazdiriniz.

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        // int data type'nin maximum degeri ile byte data tpe nin minimum degerinin toplamini hesaplatan methodu olusturunuz.

        int intMax = Integer.MAX_VALUE;
        byte byteMin= Byte.MIN_VALUE;

        //System.out.println(intmax+bytemin);
        System.out.println("intMax+byteMin = " +(intMax+byteMin));


        //System.out.println(Integer.MAX_VALUE);        alternatifler
        // System.out.println(Byte.MIN_VALUE);
        //System.out.println(Byte.MIN_VALUE+Integer.MAX_VALUE);

        //******Primitive Data Type'lerini Wrapper Class'lara nasil ceviririz.**********

        float primitiveFloat= 12.33f;
        Float wrapperFloat = primitiveFloat; // Buna Autoboxing denir == Otomatik Kutulama,
                                             // Java bunu otomatik olarak yapar, kucuk kutuyu buyuk kutuya yerlertirir.



        //******Wrapper Class'lari Primitive Data Type'larina nasil ceviririz************

        Character wrapperChar = 'a';
        char primitiveChar = wrapperChar; // Buna Unboxing denir== Kucuk kutudan buyuk kutuyu cikarma.
                                          // Java bunu da otomatik yapar.


        //Verilen iki String data'nin toplamini veren kodu yaziniz.

        String str1 = "1517";
        String str2 = "1517";
        System.out.println("str2+str1 = " + (str1+str2)); // str2+str1 = 1517;1517 toplama yapmayip yan yana yazdiriryor.
                                                            //cunku String data'larda toplama yapmaz. Concatination denir.
                                                            // intigere cevirmem gerekiyor.

        System.out.println(Integer.valueOf(str1)+ Integer.valueOf(str2));

        /*
        Javada (+) sembolu iki int icin matematikteki gibi toplama islmei yapar.
        iki String data arasinda yada bir String bir int arasinda ise yanyana yazdirir.
        buna "Concatination" denir. Java matematik bilir. Islem onceligine gore calisir.
                * uslu sayilari hesaplar
                * parantez ici
                * carpma yada bolme varsa ,siralamada once hangisi ise onu yapar.
                * toplama/ cikarma

         */

        String harf = "A";
        int sayi = 7;
        //harf+ sayi==>A7

        /*
        8+3+"K"
        "K"+3*5/2

         */
        String d = "K";
        int a = 3,b= 5, c=2;

        System.out.println(d+a*b/c); //K7 sonucunu veririr. int tam sayi oldigi icin virgulden sonrasini almaz.

        String x = "K";
        double y = 3,z= 5, t=2;
        System.out.println(x+y*z/t);// K7.5 oldu cunku Dolube sectik






    }




}

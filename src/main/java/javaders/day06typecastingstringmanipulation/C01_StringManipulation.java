package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {

        String a= "Tek Rakibim Dunku Ben .";

        //********** toUpperCase()***********\\
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);//aUpper = TEK RAKİBİM DUNKU BEN, tum harleri buyuttu.

        //********** toLowerCase()***********\\
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);//aLower = tek rakibim dunku ben .

        //********** charAt(0)***********\\

         System.out.println("ilk karakter: " +a.charAt(0));//ilk karakter: T

        System.out.println("onuncu karakter = " + a.charAt(10));//onuncu karakter = m

        // a String'indeki bastan ikinci ve sondan ikinci ve ucuncu karakteri aliniz ve yanyana yazdiriniz.

        char firstChar = a.charAt(1);
        System.out.println("firstChar = " + firstChar);

        char lastSecondChar = a.charAt(21);
        System.out.println("lastSecondChar = " + lastSecondChar);

        char lastThirdChar = a.charAt(20);
        System.out.println("lastThirdChar = " + lastThirdChar);

        System.out.println("firstChar+lastSecondChar+lastThirdChar = " + firstChar+lastSecondChar+lastThirdChar);

        //********** lenght()***********\\

        // aStringinde bulunan karakter sayisini bulunuz.

        System.out.println(a.length());


        //********** substring()***********\\
        //a String'indeki ilk 8 datayi aliniz, String a= "Tek Rakibim Dunku Ben .";
        System.out.println("a.substring(5,10) ="+ a.substring(0,8));//a.substring(5,10) =Tek Raki ,  0 dahil, 8 haric
        System.out.println("a.substring(5,10) ="+ a.substring(5,10));//a.substring(5,10) =akibi

        // a String'indeki "Rakib " kelimesini aliniz.
        System.out.println("a.substring(5,10) ="+ a.substring(4,9));
        System.out.println("a.substring(10)= "+a.substring(10));//a.substring(10)= m Dunku Ben .


        //********** contains() ***********\\
        // a Stringinde "bim" kelimesinin olup olmadigini kontrol ediniz.

        a.contains("bim");
        boolean varMi = a.contains("bim");
        System.out.println("varMi = " + varMi);

        //**********  startsWith()  ***********\\
        // a Stringinin "T" harfi ile baslayip baslamadigina bakiniz.String a= "Tek Rakibim Dunku Ben .";

        a.startsWith("T");
        System.out.println("varMi = " + varMi);//varMi = true

        a.startsWith("Tek",3);
        System.out.println(a.startsWith("Tek",3));//a.startsWith("Tek",3)false

        // Universite numaralari yil + bolumkodu + obolume giris sirasi
        // olarak duzenlenen bir okulda ogrenci Umranin Huku Fakultesinde
        // okuyup okumadigini gosteren kodu yainiz

        /*
        sinif 22,hukuk 33,bilgisayar 44,eczacilik 55,maliye 66,kimya 77
         */

        String str = "20105501";
        str.startsWith("33",4);
        System.out.println(str.startsWith("33",4));//False' 20105501 deki 55 yerine 33 yazmis olsaydik true verecekti.
    }
}

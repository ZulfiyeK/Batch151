package zlfy.soruBankasi.stringBuilderTekrar;

public class Sb03_soruBankasiCozumu {

    public static String join(String str03) {// 8. sorunun eki
        return str03 + "Java";
    }

    public static void main(String[] args) {


//1. soru Output?

        System.out.println("1. soru ");

        StringBuilder strBld = new StringBuilder(6);// ilk olarak kendisi 6 ile baslatiyor ama verilen deger sigmadigi icin kendisi otomatik arttiriyor
        strBld.append("Learn");
        strBld.append("Java");
        System.out.println(strBld);//LearnJava---- ve sonuc ikisine de append dedigi icin ikinciyi birincinin pesine ekleyerek yazdiriyor.


//2. soru Hangileri doğrudur? Cevap A-B  ******************************************************************************

        System.out.println("2. soru ");

        StringBuilder strBld1 = new StringBuilder("LearnJava");

        //A - LearnJava
        strBld1.substring(3);
        System.out.println(strBld1);//LearnJava
        System.out.println(strBld1.substring(3));//rnJava

        //B - YouLearnJava
        strBld1.insert(0, "You");
        System.out.println(strBld1);//YouLearnJava

        //C - avaJnraeL
        strBld1.reverse();
        System.out.println(strBld1);//avaJnraeLuoY

        //D - Learn
        strBld1.delete(5, 9);
        System.out.println(strBld1);//avaJnuoY

// 3. soru Output nedir? ****************************************************************************************
        System.out.println("3. soru ");

        StringBuilder strBld2 = new StringBuilder("Jonh ");
        strBld2.append("Woo ").append("Leo").deleteCharAt(6);
        System.out.println(strBld2);//Jonh Wo Leo

// 4. soru Hangisi yanlistir? ************************************************************************************
        System.out.println("4. soru ");

        //A -  anJa
        StringBuilder str = new StringBuilder("LearnJava");
        str.deleteCharAt(3);// 3.indeksi siler LeanJava
        System.out.println(str.substring(2, 6));//anJa--- 2.indeks dahil, 6.ci indeks haric aradaki veriyi yazdirir.


        //B - LearnLava
        StringBuilder str1 = new StringBuilder("LearnJava");
        str1.setCharAt(5, 'L');// 5. indeksin yerine l yazdir
        System.out.println(str1);//LearnLava

        //C - 4,7
        StringBuilder str2 = new StringBuilder(7);
        str2.append("Java");
        System.out.println(str2.capacity() + "," + str2.length());//7,4-- kapasite 7 olarak verimis. lengti de 4

//5. soru Hangileri dogrudur?*******************************************************************************
        System.out.println("5. soru ");

        //A - 1
        StringBuilder str3 = new StringBuilder("LearnJava");
        int index = str3.indexOf("earn");
        System.out.println(index);//1--- Coklu data icin kullanildiginda ilk ngordugu data'nin ilk karakkterinin index'ini verir.

        //B - 6
        StringBuilder str4 = new StringBuilder("LearnJava");
        int index1 = str4.indexOf("a", 4);// 4. indeksten sonraki a kacinci indekste
        System.out.println(index1);//6---

        //C - Compile Time Error
        StringBuilder str5 = new StringBuilder("LearnJava");
        int index2 = str5.indexOf("e", 4);//4. indeksten sonraki e kacinci indekste
        System.out.println(index2);//-1 ---4. indeksten sonra e olmadigi icin var olan e nin indeksin -1 hali


//6. soru /Hangisinin output'u asagidaki ile aynıdır? Cevap A  *********************************************************
        System.out.println("6. soru ");

        StringBuilder str0 = new StringBuilder("LearnJava");
        str0.reverse();
        System.out.println(str0); // avaJnraeL


        //A
        String str6 = "LearnJava";
        String str7 = "";
        for (int i = str6.length() - 1; i >= 0; i--) {
            str7 = str7 + str6.charAt(i);
        }
        System.out.println(str7);//avaJnraeL-- int i = str6.length()-1 dedigi icin i =8 oluyor, 8. indeks a, i'yi bir eksiltiyori = 7, 7.indek v..boylece tersten yazmis oluyor

        //B
        String str8 = "LearnJava";
        String str9 = "";
        for (int i = 0; i <= str8.length() - 1; i++) {
            str9 = str9 + str8.charAt(i);
        }
        System.out.println(str9);//LearnJava

/*      //C
        String str10 = "LearnJava";//8 index
        String str11 = "";
        for (int i = str10.length() - 1; i >= 0; i++) { //7>0 ise i = 9
            str11 = str11 + str10.charAt(i);

        }System.out.println(str11);// i--; deseydi avaJnraeL bunu yazdiracakti. i++ dedigi icin hata veriyor.
*/


// 7. soru Output nedir? cevap A  *******************************************************************************
        System.out.println("7. soru");

//Bilgi: append(char[] ch) method'u
// char array eklemek için kullanılır

        StringBuilder stb = new StringBuilder("Learn ");
        char[] ch = new char[]{'J', 'A', 'V', 'A'};
        stb.append(ch);
        System.out.println(stb); //Learn JAVA -- stb stringbuilder'ine ch array'ini eklemis

        //A) Learn JAVA
        //B) JAVA
        //C) JAVA Learn
        //D) Learn


// 8. soru  Hangileri doğrudur?  Dogru cevap A-B ***********************************************************************
        System.out.println("8. soru");


        //A -  LearnJava
        String str01 = "Learn";
        str01 = str01 + "Java";
        System.out.println(str01);//LearnJava


        //B - LearnJava
        String str02 = "Learn";
        System.out.println(str02 + "Java");//LearnJava


        //C - LearnJava
        String str03 = "Learn";
        join("Java");
        System.out.println(str03);//Learn-- once statik olan "Java" olarak calisiyor,sonrada sout'u yazdiriyor.

    /*   public static String join(String str03) {
            return str03 + "Java";
        }
         main'in disinda olmali, class'in basinda eklendi
   */


//9. soru Output nedir? Cevap A ********************************************************************************
        System.out.println("9. soru");

        StringBuilder sb3 = new StringBuilder("Learn");
        System.out.println("Before trim: " + sb3.capacity());//Before trim: 21 - bos kapasite 16,learn 5=21

        sb3.trimToSize();
        System.out.println("After trim: " + sb3.capacity());//After trim: 5 - bos kapasite 16,learn 5=21 ama trimToSize ile length'ine esitleyecegi icin
        // tum bosluklari siler ve 5 olur.
 /*
        A) Before trim: 21
           After trim: 5

        B) Before trim: 5
           After trim: 5

        C) Before trim: 5
           After trim: 21

        D) Before trim: 16
           After trim: 5
 */


//10. soru Hangileri doğrudur? Cevap Hepsi
        System.out.println("10. soru");

        //A - 0 - 9
        StringBuilder sb = new StringBuilder(9);
        System.out.println(sb.length() + " - " + sb.capacity());//0 - 9

        //B /  0 - 16
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length() + " - " + sb1.capacity());//0 - 16

        //C - 4 - 20
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println(sb2.length() + " - " + sb2.capacity());//4 - 20

        //D - StrBuilder - 10
        StringBuilder sb4 = new StringBuilder("StringBuilder");
        System.out.println(sb4.delete(3, 6).toString() + " - " + sb4.length());//StrBuilder - 10--- 3 dahil,6 haric sil ve strin'e cevir
        // oldugu icin aynen yazar, son halinin length'ini alir.


// pdf soru 1 ? Cevap B  ***********************************************************************************************
        System.out.println("pdf soru 1");

        StringBuilder sb0 = new StringBuilder();
        sb0.append("aaa").insert(1, "bb").insert(4, "ccc");// 3 tane a ekle, 1.indekse bb ekle(son durum abbaa) , 4.indekse ccc ekle.( abbaccca)
        System.out.println(sb0); //abbaccca

// pdf soru 2 ? Cevap hata veriyor. *******************************************************************************
        System.out.println("pdf soru 2");
/*
        String s1 = "java";
        StringBuilder s2 = new StringBuilder();
        if(s1 == s2) {   // biri String digeri strinBuilder oldugu icin esit yazdirmiyor. esit olsa bile cevap 0 olmali
            System.out.println("1");
        }
        if(s1.equals(s2)){
            System.out.println("2");
        }
*/
// pdf soru 3 ? ****************** *******************************************************************************
        System.out.println("pdf soru 3");

        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3));// 12 ---1 dahil 3 haric aradakileri yazdir.
        System.out.println(numbers.substring(7, 7));//    -- 7 dahil 7 haric' hiclik yazdirdi.
        System.out.println(numbers.substring(7));// 78 ---7 dahil basla sonuna kadar


// pdf soru 4 ? **************************************************************************************
        System.out.println("pdf soru 4");

        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 7).length();// kac karakter varsa onun length'ini yazdiriyor
        System.out.println(total);


    }
}

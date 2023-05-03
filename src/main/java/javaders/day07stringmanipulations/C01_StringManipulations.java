package javaders.day07stringmanipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //********** endsWith *************\\
        /*
            metnin belirli bir data ile bitip bitmedigini verir.
            True yada false seklinde boolean bir deger dondurur.
            icerisine tek karakter ya da coklu karakter de konulabilir.
         */

        // ex: s String'inin money ile bitip bitmedigini kontrol ediniz.

        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);

        String s2 = "Learn money Java earn ";//                     ====> iceriyor mu dedigi icin true dondurur.
        boolean iceriyorMu = s2.contains("money");                        //ama bizim sorumuz money ile bitip bitmedigini soruyor.
        System.out.println("iceriyorMu = " + iceriyorMu);                  //bu yozden endsWith kullanmaliyiz. genelde maillerde kullanilir.



        /*

        contains() methodu cumlenin herhango bo yerinde istenilen datayi bulursa true dondurur.
        ancak task'in bizden istedigi "money" kelimesi ile bitip bitmedigi oldugu icin endsWith() kullanmaliyiz

         */

        //************** replace() **************\\
        //ex: s String 'indeki "money" kelimesini "dollar" kelimesi ile yer degistirelim.

        String s1 =s.replace("money","dollar");
        System.out.println("s1 = " + s1);//s1 = Learn Java earn dollar

        // ex: String'deki "earn" kelimesini "win" kelimesi ile degistiriniz.

        String s3 =s.replace("earn","win");
        System.out.println("s3 = " + s3);//s3 = Lwin Java win money, tum earn'leri degistirir.

        // ex: s String'deki "a" kelimesini "* " kelimesi ile degistiriniz.

        String s4 = s.replace('a','*');// makbul olan budur. en az yer kaplayan tercih edilir.
        String s5 = s.replace("a","*");
        //String s6 = s.replace("a",'*');// "a"yi sting '*' i char yapamayiz, ikiside ayni olmak zorundayiz
        System.out.println("s4 = " + s4); //s4 = Le*rn J*v* e*rn money

        System.out.println("s5 = " + s5);//s5 = Le*rn J*v* e*rn money


        // ex: s String'deki "L" kelimesini "***" kelimesi ile degistiriniz.

        String s6 =s.replace("L","***");
        System.out.println("s6 = " + s6);//s6 = ***earn Java earn money

        // ex: s String'deki "e" kelimesini siliniz kelimesi ile degistiriniz.

        String s7 = s.replace("e", "");
        System.out.println("s7 = " + s7);//s7 = Larn Java arn mony

        String s8 = s.replace('e', ' ');
        System.out.println("s8 = " + s8);//s8 = L arn Java  arn mon y, bosluk tusu ile silme yapilma,
        // boslukta bir karakterdir bu sebeple Taskte istenilen saglanmamis oluruz. bu sebeple char kullanamayiz, String kullanmak sorundayiz.

        // ex: s String'deki tum  "earn" kelimesini siliniz.
        String s9 =s.replace("earn","");//s9 = L Java  money
        System.out.println("s9 = " + s9);


        String t= "Dolma Kalem";
        //ex: t Stringindeki "Kalem kelimesinin yerine "Biber" yerlestiriniz.

        String t1 = t.replace("Kalem","Biber");
        System.out.println("t1 = " + t1);





    }
}

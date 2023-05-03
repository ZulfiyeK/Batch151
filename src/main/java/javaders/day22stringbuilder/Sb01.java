package javaders.day22stringbuilder;

public class Sb01 {

/* 1. StringBuilder String ureten bir Class'dir.
   2. String Class kullanarak String uretiriz, Java neden "StringBuilder" Class'i da olusturdu
   3. String Class "immutable"(degistirilemez) String uretir.
      StringBuilder Class "mutable"(degistirilebilir) String uretir.
   4. immutable olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir.
      mutable olmak demek orjinal degerin degistirilebilir olasi demektir.

   5."capacity" Java'nin size verdigi data depolama yer sayidiri.
     "length" ise size verilen data depolama yerinin kullanilan kismidir.

   6. Java baslangic olarak size capacity'i 16 olarak veriri. biz verilen kapasiteyi asarsak Java yeni capacity'i varolanin 2 kati ile carpip 2 ekleyerek arttirir.

   //Java var olan datayi degistirmez, yeni uretilen datayi baska bir konteynirin iicne koyar.
*/
    public static void main(String[] args) {

        String s = "Java";
        s=s+"!";

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        //StringBuilder nasil olusturulur.
        StringBuilder t = new StringBuilder("Python");
        System.out.println(t);//Python

        t.append("!").append("...");// bu sekilde pes pese method koyup yazmaya zincirleme denir."Method Chain"
        System.out.println(t);//Python!

        //2.yol
        StringBuilder k = new StringBuilder();
        System.out.println(k);

        k.append('c');
        System.out.println('c');

        //"Capacity" ve "Length" arasindaki fark nedir.//yapabileceginiz max is kapasite, yaptiginiz is length
        StringBuilder sb1 = new StringBuilder("Money");//money 5 karakterli, java da kendisi 16 veriyor o zaman 21 oluyor
        int capacity = sb1.capacity();
        System.out.println(capacity);//21

        int length = sb1.length();
        System.out.println(length);//5

        sb1.append("!").append("*****************");// yildizlar kapasiteyi asiyorsa 2 katini alip iki ekleyerek ekstra kapasite veriyor.

        int c = sb1.capacity();
        System.out.println(c);//21// 21*2+2 yaparak her seferinde kapasiteyi arttiriyor./

        int ln = sb1.length();
        System.out.println(ln);//11

        //default capacity'i degistirebiliriz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());//2

        sb2.append("...");
        System.out.println(sb2.capacity());//6










    }

}

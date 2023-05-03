package javaders.day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);

        sb1.reverse();// Stringi loop'lar ile de ters cevirebiliriz. bu kisa yoldur.
        System.out.println(sb1);

        sb1.deleteCharAt(6);// verilen indeksteki karakteri siler.
        System.out.println(sb1);//ysae s avaJ-- ters cevirdigimiz icin burdakinde sildi.

        sb1.delete(4,7);// 4.cu indeks dahil, 7.ci indeks haric siler
        System.out.println(sb1);//ysaeavaJ

        sb1.replace(2,5, "XXXX");// baslangic indeksi dahil, bitis indeksi haric, ikisinin arasina istedigimiz degeri koyuyoruz.
        System.out.println(sb1);//ysXXXXvaJ

        sb1.insert(3,"1986");
        System.out.println(sb1);//ysX1986XXXvaJ-- ilk 3 karakteri gec, araya verdigim datayi gir.

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");
        int r = sb2.compareTo(sb3);// iki stringBuilder'i alfabetik olarak karsilastiracak.aralarinda fark yok manasinda bize sifir verecek
        System.out.println(r);//0-- fark olmadigi icin 0 verdi


        StringBuilder sb4 = new StringBuilder("Jcva");
        StringBuilder sb5 = new StringBuilder("Java");
        int m = sb4.compareTo(sb5);
        System.out.println(m);//ascii degerlere bakarak farki hesaplar ve yazdirir.

        //StringBuilder nasil String'e cevrilir?
        String str = sb2.toString().toString(); // toString = Strinbuilder'i String'e cevirir. bazen String methodlari kullanmak gerekir, o yuzden bu islem yapilir.
        System.out.println(str);

        //String nasil StringBuilder'e cevrilir?
        StringBuilder newsb1 = new StringBuilder(sb1);// eski haline geri cevirdik.
        System.out.println(str);



















    }
}

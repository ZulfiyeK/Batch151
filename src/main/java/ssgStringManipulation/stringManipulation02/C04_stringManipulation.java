package ssgStringManipulation.stringManipulation02;

public class C04_stringManipulation {

    public static void main(String[] args) {
        /*
       soru 4)Kişi isimleri için 3 String değişken oluşturunuz.
       Boşluk karakterleri hariç 3 isimdeki
       karakter sayısının toplamını yazdırınız.
        */
        String isim1=" Ahmet Can ";
        String isim2=" Ali Can 123";
        String isim3=" Mahmut Can ";
        int c1=isim1.replace(" ","").length();
        int c2=isim2.replaceAll("\\s","").length();
        int c3=isim3.replaceAll("\\s","").length();
        System.out.println("Karakter sayilarinin toplami : "+(c1+c2+c3));
        System.out.println(isim2.replaceAll("","*"));



    }
}

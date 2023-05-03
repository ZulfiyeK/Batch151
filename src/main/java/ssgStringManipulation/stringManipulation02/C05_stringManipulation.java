package ssgStringManipulation.stringManipulation02;

public class C05_stringManipulation {

    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
         */
        String str="Ali can ";
        int boslukOlmayanIndex=str.trim().length()-1;
        System.out.println(str.charAt(boslukOlmayanIndex));
        System.out.println(str.substring(boslukOlmayanIndex,boslukOlmayanIndex+1));


   }

}

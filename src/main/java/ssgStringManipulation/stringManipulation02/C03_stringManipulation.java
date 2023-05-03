package ssgStringManipulation.stringManipulation02;

public class C03_stringManipulation {

    public static void main(String[] args) {
        /*
        Soru 3)Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
      "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
       iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
       iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu? yazdirin.
         */
        String cumle="Java Buyuk,Dunya Kucucuk";
        cumle=cumle.toLowerCase();
        if ((cumle.contains("buyuk")&&cumle.contains("kucuk"))){
            System.out.println("karar ver buyuk mu yazdirayim, kucuk mu?");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());

        }else System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");


    }



}

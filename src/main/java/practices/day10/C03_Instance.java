package practices.day10;

public class C03_Instance {
     /*

    sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'leri main icerisinde yazdıralım

*/
    int sayi; //0-- static yazmiyorsa bu variable "instance variable" dir.
    String bransIsmai = "Java";

    boolean okuldaMi; //false


    //instance variable'leri main icinde kullanabilmek icin obje olusturmak zorundayiz.
    // instance variableler objeye baglidir. hangi obje uzerinden variable'de degisiklik yapildiysa,
    // yapilan bu degisiklik sadece o objeyi baglar.

    public static void main(String[] args) {



        C03_Instance obj1 = new C03_Instance();
        System.out.println(obj1.sayi); //0 -- sayiya deger atamadigimiz icin default degeri "0" sifir'i  yazdirdi.
        System.out.println(obj1.bransIsmai);// Java-- atanan degeri verdi.
        System.out.println(obj1.okuldaMi);// False-- deger atamasi olmadigi icin boolean'da da default deger false oldugu icin false verdi.


        obj1.sayi = 10;
        System.out.println(obj1.sayi);//10

        C03_Instance obj2 = new C03_Instance();
        System.out.println(obj2.sayi);//0

        obj1.bransIsmai = "SQL";
        System.out.println(obj1.bransIsmai);// SQL
        System.out.println(obj2.bransIsmai);// Java

        obj1.okuldaMi = true;
        System.out.println(obj1.okuldaMi);//true
        System.out.println(obj2.okuldaMi);//false


        obj2.sayi = 100;
        System.out.println(obj2.sayi);//100

        obj1.bransIsmai = "API";
        System.out.println(obj2.bransIsmai);//API


























    }
}

package javaders.day34exceptions;

public class E01 {
    public static void main(String[] args) {
 /*
 1. "Exception" beklenmedik problem demektir.***
      - NullPointerException- Stringte length ile calisirken veririr.
      - ArrayIndexOutOfBoundsException -array de var olmayan bir indeks kullaninca verir.
      - ArithmeticException- matematik kural ihlalinde verir

    hata verdiginde senin ilerlemene izin vermiyor ve seni uyaruyor, bu hatayi vererek app'i kilitliyor ve senin ilerlemene izin vermiyor,
    boylece aslinda iyilik yapmis oluyor, yaptigin hayati bulup duzeltmen icin yol gosteriyor .
    Exception Class'lar application'in hatasiz olarak calismasi icindir

 2. Exceptionlari halledebilmek icin 2 temel yol vardir.
    a. Exception'a uygun cozumler uretebilirsiniz."Exception Handling" denir.
    b. Exception olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da "Throw Exception" denir.(Var olan problemi ilan etmek demek, duyurmak)

 3. " Exception'a uygun cozumler uretmede "try-catch" kullanilir.
    "try black da yapilmasi gereken islemi Java'dan yapmasi istenir.
    Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz.
    "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch block" icindeki kodlar calisir.

 4. "try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar calistirilmaz.

 */

        System.out.println(divide1(12, 3));
        System.out.println(divide1(6, 0));//6 0'a bolunmez,ArithmeticException hatasi verir.matematik kural ihlali demektir.

        System.out.println(divide2(12, 3));
        System.out.println(divide2(6, 0));
    }

//1.yol Exception'i handle etmede ilk yol.
    public static int divide1(int a, int b){// eger b 0 ise cevap 0 olsun dersem o zaman hatayi koda uygun bir sekilde duzeltmis olduk.
        if(b==0){
            return 0;
        }else {
            return a / b;
        }

    }
    //1.yol Exception'i handle etmede ilk yol.
    public static int divide2(int a, int b) {// eger b 0 ise cevap 0 olsun dersem o zaman hatayi koda uygun bir sekilde duzeltmis olduk.
        int result = 0;
        try {                       //dene!
            result = a / b;         // a'yi b'ye bolmeyi dene, 6/0== burda ArithmeticException hatasi veriyor ve catch ile java yakaliyor ve bende bu hata diyor.
            System.out.println("I am here");

        } catch (ArithmeticException e) {  // burda yakalayip souta atiyor ve ---
            System.out.println("do not divide any number by zero");// bunu yazdiriyor, sonrada sonuca gidiyor ve en sonda da

        }
        return result;                 //en sonda da yazdiriyor.
    }
}
// ArithmeticException hatasi aldiktan sonra, try'in icinde hic bir  kod calismaz.
package javaders.day18constructorsstatickeyword;

public class MethodOverloading {

    /*
    1) bir method ayni isim ve farkli parametrelerle olusturulursa buna "Method Overloading" denir.
    2) "Method Overloadin" javada "iyi organizasyon" icin onemlidir
    3) Method Overloading yapilirken parametre 3 sekilde degistirilebilir.
       i.   parametrelerin sayilari degistirilebilir.
       ii.  parametrelerin data type'larini degistirebilirsiniz
       iii. parametrelerin data type'lari farkli ise yerleri degistirilebilir.
    4) "Method Overloading" bir class'in icinde olusur bu yuzden "private" method'lar da overload edilebilir.
      "Method Overloading" butun access modifier'larda kullanilabilir.
    5)"static" methodlar overload ediledbilir

     */

    public static void main(String[] args) {

        System.out.println(add(3,5));//add methodunu cagirinca hemen bakiyor nerede var, bakar ki asagida dort tane var,
                                          // ama kendisi secim yapmaz, parametlere bakar, virgulsuz sayilar aksi soylenmedikce int'dir.
                                         // O zaman birinci uygundur ve birinciye gore islem yapar. ikinci methoda gelir ve 3 degerli oldugu icin almaz, siradakine gecer.
                                        //sirada double var ama benim degerim int, type casting yapar(kucugu buyuge koyar) autowidening ile bu da uyumlu
                                       // en sondaki de uyumlu. coklu secimlerde java secim yapmaz hata veriri ve kodu duzeltmemizi ister.
                                      // hangisinde az is varsa (autowidening ek is demek) onceligi ona verir.
        }
        public static int add(int a, int b) {
           return a+b;
        }
        public static int add(int a, int b, int c) {
             return a + b+c;
        }
        public static double add(double a, int b) {
            return a + b;
         }
        public static double add(int a, double b) {
             return a + b;

    }

    }













package javaders.day13loops;

public class D_ForLoop02 {

    public static void main(String[] args) {

        // EX: Verilen bir strin'deki ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz.
        //"I love Java"  ==> "I love J"
        String s = "I love J";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);//I love J

        }

        System.out.println();
//EX:Verilen bir Stringde son a dan sonraki tum karakterleri tersten yazdiriniz.
        String t = "Calistim";

        for (int i = t.length() - 1; i >= 0; i--) {
            char ch = t.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);//mitsil - tersten yazdir dedigi icin ters yazdi

        }


//char ile substring arasinda kalinca ayrimi soyle yapabiliriz. Substring string dondurur ve orda buyuk kucuk harf vs degisim donusum kolaydir.
// ama boyle bir seye ihtiyacimiz yoksa charAt kullanilmasi daha pratiktir.


    }
}
package javaders.day35exceptions;

public class E03 {
    /*
    1. try block'dan sonra coklu catch block kullanilabilir.
        catch blocklar arasinda parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
        parent-child iliskisi varsa child ustte olmalidir.

    2. "Exception Class" tum exception'larin parent'idir.
        Coklu "catch block" kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
        tek "chatc block"i "Exception Class" ile kullanabilirsiniz.

    3. try + 1 chatc olur. try + cok catch olur, try+ finally ile de olur.ama try tek basina kullanilamaz.
        dene dedikten sonra denemesi gereken seyi de chatc ile yazdirmak zorundayiz.


     */
    public static void main(String[] args) {

        System.out.println(converStringToIntDivideByLength("124"));// bos, hiclik veya yazi olarak kabul etmiyor, bu lardan birini girersek
        //NumberFormatException hatasi veriri ve sout ta "Non- digit character cannot be used in valueOf()"==> bunu goruruz,
        // sonraki kodlar da calismaz, result da 0 olur. hem mesaji hem de sifiri goruruz.

        //6 girersek, tek basamakli olur, length  1 olur 1-1 sifir olur, 6/0 ==>ArithmeticException hatasi veriri.
        // o zaman da e.getMessageSystem.out.println(e.getMessage()); bu yazdirir. / by zero ve resul ta 0 olur.
        // muhakkak sayi formatinda olmali 124 girince str= 3 olur




        System.out.println(converStringToIntDivideByLength2("6"));
        System.out.println(converStringToIntDivideByLength3("6"));
    }

// Bir String'i integer'a ceviren ve bu integer'i Stringin lenght'inin bir eksiginne bolen method'u olusturunuz.

    public static int converStringToIntDivideByLength(String str){

        int result = 0;
        try {


      int a = Integer.valueOf(str);//str 3 olur
      result=  a/(str.length()-1);// a/2 olur length-1 dedigi icin 124/2 olur resultta 62 goruruz.

        }catch (NumberFormatException e){
            System.out.println("Non- digit character cannot be used in valueOf()");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());//  -/ by zero
        }
     return  result;//62
    }

//ArithmeticException ve NumberFormatException hatasi verdi. bir method da iki farkli hata aldik, ikini birlikte handle etmek gerkir.


    public static int converStringToIntDivideByLength2(String str){

        int result = 0;
        try {


            int a = Integer.valueOf(str);
            result=  a/(str.length()-1);

        }catch (Exception e){////"Exception" tum exception'lari kapsayan genel bir exception turudur. 911 gibi...
            System.out.println(e.getMessage());
        }
        return  result;
    }


    public static int converStringToIntDivideByLength3(String str){

        int result = 0;
        try {

            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);

        }catch (ArithmeticException e){// Child class-- "catch block"lar arasinda parent-child iliskisi varsa child yukarida parent asagida olmalidir.
                                                        // Eger bu iliski yoksa "catch block"lar arasinda siralamanin onemi yoktur.
            System.out.println("Jump");
        }catch (Exception e){// parent exception
            System.out.println(e.getMessage());
        }
        return  result;


}}
// coklu catch block" kullanmayi ogrendik
// bir methodda birden fazla hata yakalamyi ve duzeltmeyi ogrendik
//
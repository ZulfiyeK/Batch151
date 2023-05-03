package zlfy.soruBankasi.abstraction.soru10;

public class Sub extends A{
    int x = 4;
    int getSum(){
        return x + x;
    }
    int getSum(int x, int y){
        int z = x + y;
        System.out.print(z);
        return z;
    }
    public static void main(String[] args){
       A sub = new Sub();
       sub.getSum(4,2);
    }
    /*
    Aşağıdakilerden hangileri doğrudur?- C-D
A) Compile Time Error yoktur ve output 6 olur--YANLIS

B) Compile Time Error vardır, sub class'i abstract class yaparak Compile Time Error'dan
   kurtulabiliriz.-- YANLIS

C) Compile Time Error vardır, getSum method'lardan Compile Time Error'a sebep olanini
   override ederek Compile Time Error'dan kurtulabiliriz.-DOGRU

D) Compile Time Error vardır, getSum method'lardan Compile Time Error'a sebep olanini silerek
   Compile Time Error'dan kurtulabiliriz-DOGRU
     */
}

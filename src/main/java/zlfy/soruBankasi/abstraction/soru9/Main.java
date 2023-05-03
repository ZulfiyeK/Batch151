package zlfy.soruBankasi.abstraction.soru9;

public class Main {
    public static void main(String[] args){
        C c = new C();
        c.firstMethod();// kendinde yok B'ye gider FIRST yazdirir.
        c.secondMethod();// kendinde yok A'ya gider SECOND yazdirir.
        c.thirdMethod();// kendinde var, A'dan geri donerken B'de FIRST yazdirir
                            //sonra da kendindeki THIRD'u yazdirir.
    }
}
/* A SIKKI Dogru
FIRST
SECOND
FIRST
THIRD
*/


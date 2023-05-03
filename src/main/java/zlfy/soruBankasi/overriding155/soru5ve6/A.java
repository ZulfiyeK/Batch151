package zlfy.soruBankasi.overriding155.soru5ve6;

public class A {
    /*
A SIKKI ********** private methodlar override yapilamaz.
    private void fly(){
    System.out.println("A flies");
    }


B SIKKI ******** final method'lar override edilemez.
    public final void fly(){
    System.out.println("A flies");
     }


  C SIKKI ******** static method'lar override edilemez.
    public static void fly(){
    System.out.println("A flies");
    }


D SIKKI ********** data type'leri farkli ise override yapilamaz.
    public int fly(){
    System.out.println("A flies");
    return 5;
    }


*/
/////////////// 6. Soru \\\\\\\\\\\\\\\\\\\\\\-- hic biri override yapilmamis.

 /* //***************** A ************************

    public int fly(int i){    ** override ederken sadece body degisir.
       return 2*i;
        }

*/
/* //***************** B ************************

    public int fly(int i){    ** override ederken sadece body degisir.
       return 2*i;
         }
*/

/* //***************** C ************************

     public int fly(){ // data type'leri farkli oldugu icin yapilamaz.
        return 2;
           }
*/
}



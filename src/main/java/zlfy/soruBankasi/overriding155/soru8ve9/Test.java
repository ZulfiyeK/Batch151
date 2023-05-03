package zlfy.soruBankasi.overriding155.soru8ve9;

public class Test extends Test06{
/*
// A SIKKI ********************** private override edilemez.  Hata veririr.
    @Override
    public void go() {
        System.out.println("Bad");
    }
    public static void main(String args[]) {
        Test obj = new Test();
        obj.go();
    }
 */


/*//B SIKKI ********************** override yok, hata vermez.

    public void go() {
        System.out.println("Bad");
    }
    public static void main(String args[]) {
        Test obj = new Test();
        obj.go();//Bad
    }

*/

/*// C SIKKI ********************* farkli data type'leri override edilemez.

    @Override
    public Short go() {
        return 6;
    }
    public static void main(String args[]) {
        Test obj = new Test();
        obj.go();
    }
*/

///////////////////////////// 9 .SORU  \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

/* // A SIKKI ******************** Child parent'a daraltma yapamaz.
    @Override
    protected int go() {
        return 12;
    }
    public static void main(String args[]) {
    Test obj = new Test();
     obj.go();
 */


/* // B SIKKI ******************** bos yazdirdi

    @Override
    protected int go() {
        return 12;
    }
    public static void main(String args[]) {
        Test obj = new Test();
        obj.go();
    }
*/
/* // C SIKKI ******************** data type'i farkli

    @Override
    byte go() {   data type'i farkli
     return 12;
     }
    public static void main(String args[]) {
    Test obj = new Test();
    obj.go();
    }
*/
/*// D SIKKI ******************** final'ler override edilemez.

    @Override
    final int go() {
        return 12;
    }
    public static void main(String args[]) {
        Test obj = new Test();
        obj.go();
    }
*/







}

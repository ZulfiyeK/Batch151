package zlfy.soruBankasi.Interface.soru10;
 interface B {

// A SIKKI yanlis- protected olamaz.
//   protected int x = 3;

//B SIKKI dogru
//    public static final int x = 3;

// C SIKKI yanlis- protected olamaz.
//    protected int m();

//D SIKKI- dogru

// default int m() {
//      return 1;
//    }

//E SIKKI- dogru
    private static int m() {
       return 1;
   }


}

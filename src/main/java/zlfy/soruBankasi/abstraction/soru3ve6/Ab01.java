package zlfy.soruBankasi.abstraction.soru3ve6;

public abstract class Ab01 {
/* A SIKKI
    public int a = 10;
    public abstract void set(int a);
    public int get() {
        return a;
    } //error verir, cunku normal class'larda abstract method olmaz,
    // class'inda abstract olmasi gerek.
 */

/* B SIKKI- sorun yok

    public int a = 10;
    public int get() {
        return a;
    }

 */
/*
 //C SIKKI- Compile Time Error verir
public int a = 10;
    public abstract void set(int a);// override edilmis

    public int get();// abstract olmadigi icin body olmali
   */




/*    D SIKKI - hic birisi override edilmemis.

    public int a = 10;
    public abstract void set(int a);//override edilmemis
    public int get() {//override edilmemis
        return a;
    }
    public static void main(String[] args) {
        Ab01 obj = new Ab01();
    }

  */
//////////////////////////////////////////////////////////////////////////
   //Soru 6

    int b = 12;
    abstract void getNumber(int x, int y);

}

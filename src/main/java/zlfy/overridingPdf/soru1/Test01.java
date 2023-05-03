package zlfy.overridingPdf.soru1;

public class Test01 extends Parentclass {
   protected final void getDetails(){
       System.out.print("Test class ");


   }

    public static void main(String[] args) {
        Parentclass obj = new Test01();
        obj.getDetails();
    }
}

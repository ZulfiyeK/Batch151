package zlfy.soruBankasi.abstraction.soru1;

public class Test extends Ab01 {

    public void set(int a) {
        this.a = a;
    }

    @Override
    public void get() {// override yapmamisti o yuzden CTE
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.set(20);
        System.out.println(obj.a);


    }//Gives compile time error
}
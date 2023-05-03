package zlfy.soruBankasi.abstraction.soru3ve6;

public  class Test extends  Ab01{
 /*
     //Soru 3
    public void set(int a){
        this.a = a;
    }
    public static void main(String[] args){
    }

     */

 ////////////////////////////////////////////////////////////////////////

   // Soru 6 - A SIKKI

    int b = 10;
    Test() {

        b = super.b;
    }
    void getNumber(int x, int y) {
        int i = x * y + b;// 7*3+12
        System.out.print(i);//33
    }
    public static void main(String[] args) {
        Test sub = new Test();
        sub.getNumber(7, 3);
    }


}

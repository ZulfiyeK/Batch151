package zlfy.soruBankasi.overriding155.soru1;

public class C {

    public static void main(String args[]) {
        //   B obj1 = new B();
        //   obj1.display();
        //   System.out.println(obj1.i);


        B obj4 = new A();// //parentlar child'a overriding yapamaz,child' lar
        obj4.display();
        System.out.println(obj4.i);


    }

    }
package zlfy.soruBankasi.overriding155.soru10;

public class A extends B{
    int age = 11;
    public static String sing() {
        return "fa";
    }
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        System.out.println(a.sing() + " " + b.sing()); //fa la
        System.out.println(a.age + " " + b.age);//11 12
    }
}

package zlfy.soruBankasi.abstraction.soru9;

abstract class A {
    abstract void firstMethod();
    void secondMethod(){
        System.out.println("SECOND");
        firstMethod();
    }
}

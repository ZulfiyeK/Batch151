package zlfy.soruBankasi.overloadingT.soru1;

public class Test01 {
    public static void main(String s[]) {
        go();// once bos olani yazdirir.
        go(12);// sonra int olani
        go(5 >= 5);// true oldugu icin b olur ve bunu yazdirir.
    }

    public static void go() {
        System.out.println("Bad");
    }
    public static void go(double i) {
        System.out.println("Good");
    }
    public static void go(boolean b) {
        if (b) {
            System.out.println("The best");
        } else {
            System.out.println("The worst");
        }
    }
    //cevap A
}

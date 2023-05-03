package zlfy.soruBankasi.overloadingT.soru2;

public class Test02 {
    public static void main(String s[]) {

        String str = print(8) + print();//53
        print(str);// en sondaki yeni print methodu ile yazdiriyor.
    }
    public static int print() {//bos olan "print()" 3 donduruyor
        return 3;
    }
    public static String print(int i) {//int olan "print(8)" 5 donduruyor
        return "5";
    }
    public static void print(String j) {
        System.out.println(j);//53
    }
// cevap A
}

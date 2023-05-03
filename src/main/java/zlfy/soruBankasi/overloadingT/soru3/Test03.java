package zlfy.soruBankasi.overloadingT.soru3;

public class Test03 {
    public static void main(String[] args) {
        int x = add(2, 8);
        double y = add(3, 4.5);
        double z = add(x, y, 20);
        System.out.println(z);
    }

    static int add(int i, int j){
        return i + j;//10=x
    }
    static double add(double i, double j){
        return i + j;//7.5=y
    }
    static double add(int i, double j, int k) {
        return i + j + k;//10+7.5+20=37.5=z
    }
    //cevap A
}

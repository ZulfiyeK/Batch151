package zlfy.soruBankasi.overloadingT.soru4;

public class Test04 {
    public static void main(String[] args) {


        System.out.println(avg(1.2, 4.8));//Good 3.0
        System.out.println(avg(1.2, 4.8, 6));//Bad 4.0
    }
    public static double avg(double i, double j) {
        System.out.print("Good ");
        return (i+j)/2;//3 - Good 3.0
    }
    public static double avg(double... k) {
        System.out.print("Bad ");
        double sum = 0;//1.2+4.8+6
        for(int i=0; i<k.length; i++) {
            sum = sum + k[i];//indeksleri topla

        }
        return sum/k.length;
    }           //12/3=4.0
    //cevap A (varargs day21)
}

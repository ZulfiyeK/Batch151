package javaders.day41lambda;

public class Utils {
    //ismi degisik olabilir, utils demek sik killanilanlar demek, faydali methodlarin depolandigi yer demektir.
// herseyi de buraya yazmaya gerek yok, copluge cevirmeye gerek yok. cok fazla kullanilacaklar buraya konmali
    public static int getSquare(int a){
        return a*a;
    }
    public static boolean isOdd(int a){
        return a%2!=0;
    }
    public static boolean isOddT(int a){
        return a%2==0;
    }
    public static boolean isBig(int a, int b){
        return a>b == true;
    }
    public static boolean isSmall(int c, int d){
        return c<d == true;
    }
    public static int getSumOfDigits(int a){
        int sum = 0;
        while (a>0){
            sum = sum+a%10;
            a= a/10;
        }
        return sum;
    }






}

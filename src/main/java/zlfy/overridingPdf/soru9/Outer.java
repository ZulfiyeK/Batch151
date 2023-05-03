package zlfy.overridingPdf.soru9;

public class Outer {
    public static void main(String[] args) {
        Computer mause = new Laptop();
        System.out.println(mause.getValue(100,200));//100
    }
}//Laptop'un kendi methodu oldugu icin Computer'e gitmedi ve kendi methodunu kullandi.
// b-a ==> 200-100=100 oldugu icin 100 yazdirdi

package practices.day11;

public class C02_Static {
            /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

*/
static String okulIsmi = "Yildiz Koleji";
static int okulNo;
static boolean okulAcikmi;

    public static void main(String[] args) {
    //static variable'lara class icindeki tum methodlardan direk ulasabiliriz.
    // Bu yuzden obje " C02_Static okul= new C02_Static();" olusturmaya gerek yoktur.
    // Class'a baglidir, bir kisi icin degisitirilirse herkes icin degismis olur
    //baska class'dan ulasmak icin class ismi ile cagirmak gerekir.

        System.out.println(okulIsmi);//"Yildiz Koleji"
        System.out.println(okulNo);//0
        System.out.println(okulAcikmi);//false

        okulNo= 100;
        System.out.println(okulNo);//100
        staticMethod();// kol ettik ve bize main disinda bir method olusturdu
        System.out.println(okulNo);//150

    }
    private static void staticMethod() {
        okulNo= 150;
        System.out.println(okulNo);//150

    }
}

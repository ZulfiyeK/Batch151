package zlfy.overridingPdf.soru6;

public class Test06 {
    public static void main(String[] args) {
        new C().create();//  print dedigi icin C ve D yanyana
        new D().update();// D
        new R().read();//R
        new D().delete();//D
    }
}
    /*

    CU
    R
    D

    */



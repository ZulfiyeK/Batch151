package zlfy.overridingPdf.soru10;

public class Product {
    public static void main(String[] args) {
        M m = new M();
        M n = new N();
        M o = new O();
        O oo = new O();
        m.product(3);//{3,9}~
        n.product(3);//[3,6]~
        oo.product(3);//(3,6)~ -  herkes kendi methodunu kullandi

    }
}

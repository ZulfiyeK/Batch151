package zlfy.overridingPdf.soru8;

public class Test08 {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        y.m2();// y objesi ile m2'yi cagir
        x.m1();// x objesi ile m1'i cagir
        y.m1();// y objesi ile m1'i cagir
        x=y;
        x.m1();//y objesi ile m1'i cagir

        //her biri kendi class'inda kendi class ismi ile olusturuldugu icin
        // kendi classindan getirdi.

    }
}
    /*

    m2, Y class
    m1, X class
    m1, Y class
    m1, Y class

    */
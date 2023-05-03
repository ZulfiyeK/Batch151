package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {

    public static void main(String[] args) {

     /*

        Numeric Data type'lerinin birbirine donusturulmesine type casting denir.
        Numeric Data Type'leri byt<short< int< long<float<double
        Kucuk data typ'lerinin buyuk data type'larina donusturulmesine "Auto Widenning" ( Otomatik Genisletme)
        Buyuk data ytp'lerinin kucuk data typ'lerine donusturulmesinde ise java sorumlulugu kabul etmez,
        data kaybi olma ihtimeli yuzunden bunu kodu yazanlara birakir ve buna da "Expilicit Narroving"  ( Aciktan Daraltma) denir.

    */

        byte age= 13;
        int ageInt= age; // Auto Wedining- Otomatik Genisletme

        long nufus = 125348L;
        short nufusShort = (short) nufus;// Expilisit Narroving- Aciktan Daraltma

        int boy= 170;
        float boyFloat= boy;

        // short data typr'nin byte data type'ina cevirelim
        short numberShort= 115;
        byte numberByte = (byte) numberShort;



    }

}

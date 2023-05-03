package javaders.day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {

        //**********Explicit Narrowwing****************\\
        /*
         Explicit Narrowing yaparken dikkat edilmeli . Cunku Cok Ciddi Data kaybi hatta Datanin degismesine neden olabilir.
        Eger sayimiz donusturmeye calistigimiz variable'in sinirlari
        disinda ise; Java sayiyi mod islemine alir ve kalani yazdirir.
        Kalan bolenin yarisindan fazlaysa kalan sayiyi Java kucultmek ister ve
        bolumu 1 buyuterek kalani (-)isaretli olacak sekilde yazdirir
         */


        // short data type'nde bir variable olusturup byte data type'ina ceviren kodu yaziniz.



        short num= 260;
        byte numByte = (byte) num;

        System.out.println("numByte = " + numByte);//4

        short num2= 1023;
        byte numByt2 = (byte) num2;
        System.out.println("(numByt2) = " + numByt2);//-1

        short num3 = 1000;
        byte numByte3 = (byte) num3;
        System.out.println("numByte3 = " + numByte3);//-24

        int intSayi= 8880;
        short shortsayi = (short) intSayi;// 32768 + 32768 + 0
        System.out.println("shortsayi = " + shortsayi);//8880
    }
}

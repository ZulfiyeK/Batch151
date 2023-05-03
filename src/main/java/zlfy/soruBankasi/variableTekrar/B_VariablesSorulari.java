package zlfy.soruBankasi.variableTekrar;

public class B_VariablesSorulari {
    public static void main(String[] args) {


//Soru 1: Farkli 3 data turunde variable olusturun ve bunlari yazdirin.

        int i = 10;
        char ch = 'Z';
        double cift = 11213.5;
        System.out.println(i);
        System.out.println(ch);
        System.out.println(cift);

        System.out.println("" + i + ch + cift);//10Z11213.5 basina bosluk koymazsak z'nin ascii degerini toplamaya dahil ediyor.



/*Soru 2: isim ve soy isim icin iki variable olusturun ve bunlari ;
             isminiz : Mehmet
             soyisminiz : Bulutluoz
        seklinde yazdiriniz.
*/

        String isim = "Mehmet";
        String soyIsim = "Bulutluoz";

        System.out.println("isim =" + isim);
        System.out.println("soyIsim =" + soyIsim);


//Soru 3: Iki farkli tam sayi data turunde 2 variable olusturun bunlarin toplamini yazdirin.

        int ilkSayi = 15;
        byte ikinciSayi = 35;
        System.out.println(ilkSayi + ikinciSayi);//50


// Soru 4: Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin.

        byte a = 15;
        double b = 3.5;
        System.out.println(a + b);// 18.5 double byt'tan buyuk oldugu icin byte'yi de kendine benzeyyi
        // ve sonucu double olarak verdi.


// Soru 5: char data tipinde bir variable olusturun ve yazdirin.

        char chr = 'O';
        System.out.println(chr);//O


//Soru 6: Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi = 153;
        char ch1 = 'B';// ascii degeri 66
        System.out.println(sayi + ch1);//219 toplam istedigi icin basa bosluk koymadim ve ascii deger ile topladi.



/*
 Soru interview Question
 1.Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP) bir program yaziniz
    sayi1=10 , sayi2=20
 */

        int sayi1 = 10;
        int sayi2 = 20;

        sayi1 = sayi1 * sayi2;
        sayi2 = sayi1 / sayi2;
        sayi1 = sayi1 / sayi2;

        System.out.println("sayi2 = " + sayi2);//10
        System.out.println("sayi1 = " + sayi1);//20


    }
}

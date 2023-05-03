package practices.day01;

public class C01_BasamaklaraAyirma {
    public static void main(String[] args) {

// 56234 sayısının rakamları toplamını bulunuz

       int sayi = 56234;

//Bir sayinin 10'a bolumunden kalan, o sayinin bir ler basamagini verir.

        int birler = sayi%10; // 4
        int onlar = (sayi/10)%10; // 3
        int yuzler = (sayi/100)%10; // 2
        int binler = (sayi/1000)%10; // 6
        int onBinler = (sayi/10000); // 5
        System.out.println("birler+onlar+yuzler+binler+onBinler="+(birler+onlar+yuzler+binler+onBinler)); //birler+onlar+yuzler+binler+onBinler= 20

    }
}

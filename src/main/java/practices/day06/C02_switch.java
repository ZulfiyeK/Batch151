package practices.day06;

import java.util.Scanner;

public class C02_switch {
    public static void main(String[] args) {

     /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için,
     kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 ile 4 arasinda bir numara giriniz." + "\n "+
         " Işlem 1: Bakiye Sorgulama" + "\n "+
         " Işlem 2: Para Cekme" + "\n "+
         " Işlem 3: Para Yatırma" + "\n "+
         " Işlem 4: İşlemi Sonlandırın" );

         int islemNo = scan.nextInt();
         int bakiye= 1000;

        switch (islemNo){
            case 1:// bakiye sorgulama yapacagiz.
                System.out.println("Bakiyeniz "+ bakiye+ " TL dir.");
                break;


            case 2:// para cekme islemi yapacak.
                System.out.println("Lutfen cekmek istediginiz miktari giriniz.");
                int cekilecekPara = scan.nextInt();

                if(cekilecekPara<=bakiye) {
                   bakiye = bakiye - cekilecekPara;
                   System.out.println(" Kalan bakiyeniz : "+ bakiye+ " TL dir.");
                }else{
                   System.out.println("Yetersiz Bakiye");
                  }
                break;


            case 3:// Para yatirma
                System.out.println("Lutfen yatirmak istediginiz miktari giriniz.");
                int yatirilanPara = scan.nextInt();

                if(yatirilanPara<=2000){
                    bakiye= bakiye+yatirilanPara;
                    System.out.println("Toplam bakiyeniz "+ bakiye+ " Tl dir.");
                }else{
                    System.out.println(" Gunluk yatirma limitini astiniz, gunluk limit 2000 TL dir. ");
                    }
                break;


            case 4: // islemi sonlandir.
                System.out.println("Bankamizi kullandiginiz icin tesekkur ederiz.");
                break;
                default:
                System.out.println("Lutfen gecerli bir numara giriniz.");


        }






























    }
}

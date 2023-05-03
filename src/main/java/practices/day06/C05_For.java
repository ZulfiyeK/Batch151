package practices.day06;

import java.util.Scanner;

public class C05_For {
    public static void main(String[] args) {

 /*
         Kullanıcıdan sisteme ayri ayri 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

  */

        Scanner scan = new Scanner(System.in);


        int toplam = 0;
        for(int i = 0;i<5; i++){
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scan.nextInt();

            if(sayi>=5 && sayi<=10){
                System.out.println("Sayi 5 ile 10 arasinda oldugundan isleme alinmayacaktir.");
            }else{
                toplam= toplam+sayi;
            }
            }
            System.out.println("Toplam: " +toplam);

















    }
}

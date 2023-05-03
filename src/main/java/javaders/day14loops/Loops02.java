package javaders.day14loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {

//3 den 8'e kadar tum tam sayilari konsola yadiran kodu yaziniz
//1.yol

        for (int i = 3; i < 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();  //bosluk icin
//2.yol
        int i = 3;
        while (i < 9) {
            System.out.print(i + " ");
            i++;

        }
        System.out.println();
//21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        for (int n = 21; n < 181; n++) {
            if (n % 4 == 0 && n % 6 == 0) {
                System.out.print(n + " ");
            }
        }
//2.yol
       int n = 21;
        while (n < 181){
            if (n % 4 == 0 && n % 6 == 0) {
                System.out.print(n + " ");
            }
            n++;
        }
        System.out.println();
        System.out.println();//bosluk icin
//Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
//miami ==> MiAmI
        String s = "miami";
        int m = 0;
        while (m < s.length()) {
            String ch = s.substring(m, m + 1);
            if (m % 2 == 0) {
                System.out.print(ch.toUpperCase());
            } else {
                System.out.print(ch);
            }
            m++;// while icine yazmak gerekiyor yoksa sonsuz loop yazar.Bu kismi unutmayin yoksa "infinite loop" olusur. Yani; "sonsuz loop" olusur.
            // "sonsuz loop"lar application'in donmasina sebep olur.
        }
        System.out.println();//bosluk icin
//EX: size verilen tamsayinin rakamlari toplamini console'a yazdiran kodu yazdirin.

        int t = 654;
        t = Math.abs(t);// negatif sayilari pozitif yapmak icin bu method kullanilir.
        int sum = 0;
        while (t > 0) {
            sum = sum + t % 10;
            t = t / 10;
        }
        System.out.println(sum);
// Kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz.
        // 3x1=3, 3x2=6, 3x3=9, 3x4=12......3x10=30

        Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter a number..");
        int k = input.nextInt();
        int g = 1;
        while (g < 11) {
            System.out.println(k + "x" + g + "=" + (k * g));
            g++;
        }


// kullanicidan aldiginiz Stringdeki sessiz harfleri console'a yazdiran kodu yaziniz.

        System.out.println(" Pleas enter a word");
        String y = input.next();

        int z = 0;
        while (z < y.length()) {

            char ch = y.charAt(z);
            boolean x = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'O' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
            // PARANTEZ ICINE BU KADAR UZUN KOD YAZMAK TAVSIYE EDILMEZ.
            if (!x){
            System.out.print(ch);
            }
            z++;
        }










    }
}

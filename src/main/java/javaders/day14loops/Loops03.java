package javaders.day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {

        int i = 1;
        while (i < 1) {
            System.out.println("While loop"); // while loop da loop bodysinin hic calismamasi mumkundur(Zero execution is possible)
            i++;
        }

//do -while loop
        int k = 1;
        do {
            System.out.println("do-while loop");// genellikle oyunlarda do-while kullanilir.
            k++;
        } while (k < 1);


// kullanici bir sayi girsin, sayi 100 den kucuk se kullanici "Kazandiniz" mesaji alsin' diger durumlarda "Kaybettiniz mesaji alsin."

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Pleas enter an integer..");// int i=0 degeri yazardik. onu yazmadik cunku kullanici giriyor ve arttirma ve azaltmayi da o yapiyor.
                                                            // bu yuzden i++; da yazmadik.
            int n = input.nextInt();

            if(n<100){
                System.out.println("Won!");//99 Won
            }else{
                System.out.println("Lost");//100 Lost
                break;
            }
        }while (true);// true yazarak sonsuzlugu ogrenmis olduk.


////kullanicidan alinan bir cumlenin buyuk harfle baslayip nokta ile bittigini kontrol eden kodu yaziniz

        do{
            System.out.println("Pleas enter a word");
            String s = input.next();

            if(s.endsWith(".")&&(s.charAt(0)>='A'&& s.charAt(0)<='Z')) {
                System.out.println("Your sentences is correct grammatically");//Ali  icin, Your sentences is correct grammatically

            }else {
                System.out.println("Your sentences has grammatical mistake");// oyuncak icin,Your sentences has grammatical mistake

                break;
            }
        }while(true);





//*** for ile yapilar hersey while ile yapilir, while ile yapilan hemen hemen her sey do-while ile de yapilir.









    }
}

























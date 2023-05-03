package practicessulehoca.day03;

import java.util.Scanner;

public class aAracsgirtaApplication {
    public static void main(String[] args) {

        start();

  }//main

    public static void start() {
        Scanner input = new Scanner(System.in);
        boolean isfail;
        boolean isFail;
        do {
            isFail = false;
            System.out.println("Lutfen tarife donemini seciniz" +
                    "\n1==>Haziran 2023\n2==>Aralik 2023");

            int term = input.nextInt();//donemi aliyoruz.
            if (term == 1 || term == 2) {

                Arac arac = new Arac();
                System.out.println("Lutfen arac tipini giriniz.");
                arac.type = input.next().toLowerCase();

                arac.prim = arac.countPrim(term);//doneme gore prim hesaplama
                int select;//tamam mi,devam mi?
                String termName = term == 1 ? "Haziran 2023" : "Aralik 2023";//ternary kullandik.
                if (arac.prim > 0) {
                    System.out.println("Hesaplama basariyle tamamlandi");
                    System.out.println("Arac tipi: " + arac.type);
                    System.out.println("Tarife Donemi: " + termName);
                    System.out.println("Aracinizin Sgorta Prim Tutari: " + arac.prim);
                    System.out.println("Yeni islem icin ==>1" +
                            "\n Cikmak icin ==>0'ye basiniz.");
                    select = input.nextInt();//tamam mi,devam mi?
                    if (select == 1) {
                        isFail = true;//1 girerse basa donecek,0 girerse applicationdan cikacak.
                    } else {
                        isFail = false;
                    }
                } else {
                    System.out.println("Hesaplama basarisiz.");
                    System.out.println("Yeni islem icin ==>1" +
                            "\n Cikmak icin ==>0'ye basiniz.");
                    select = input.nextInt();
                    if (select == 1) {
                        isFail = true;
                    } else {
                        isFail = false;
                    }
                }


            } else {
                System.out.println("Hatali giris");
                isFail = true;
            }
        } while (isFail);
    }//start()
}//class

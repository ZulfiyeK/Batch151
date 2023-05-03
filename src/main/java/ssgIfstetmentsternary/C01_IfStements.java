package ssgIfstetmentsternary;
import java.util.Scanner;
public class C01_IfStements {
    public static void main(String[] args) {

        int sayi1=12;
        int sayi2=16;

        //< > >= <= == !=

        if (sayi1>20)
            System.out.println("buyuk olan sayi : " + sayi1);


        System.out.println("kucuk olan sayi ****: " + sayi2);


        if (sayi2>0) {
            System.out.println("buyuk olan sayi : " + sayi2);
            System.out.println("kucuk olan sayi : " + sayi1);
        }



//************************************************
        //Soru 1) Kullanicidan bir tamsayi isteyin
        //ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1 tam sayi giriniz");
        int sayi= scan.nextInt();
        //1. ve uzun yol
        if (sayi%2==0) System.out.println("sayi cifttir");
        System.out.println("bu kod her zaman calisacak");
        if (sayi%2!=0)
            System.out.println("sayi tektir");


        //2. yol
        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }else System.out.println("sayi tektir");

//******************************************************

    /*
        Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // 	Ornek:  	gun=Pazar output = “Hafta sonu”
        //		gun=Sali output = “Hafta ici”
        //	*** String icin equals method’unu kullanin
        */
        Scanner scan1=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi= scan1.next().toLowerCase();

        //2. ve kısa yol
        boolean haftasonu=gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi");
        boolean haftaici=gunIsmi.equals("pazartesi")||
                gunIsmi.equals("sali")||
                gunIsmi.equals("carsamba")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("cuma");
        if (haftasonu){
            System.out.println("haftasonu");
        }
        if (haftaici) {
            System.out.println("haftaici");
        }
        if (!(haftasonu||haftaici))
            System.out.println("yanliş deger girdiniz lutfen gecerli bir deger giriniz");


/*       1. ve uzun yol
        if (gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi"))
            System.out.println("Hafta Sonu");


 */
        if (gunIsmi.equals("pazartesi")||
                gunIsmi.equals("sali")||
                gunIsmi.equals("carsamba")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("cuma"))
            System.out.println("Hafta içi");

        if (!(gunIsmi.equals("pazar")||
                gunIsmi.equals("cumartesi")||
                gunIsmi.equals("pazartesi")||
                gunIsmi.equals("sali")||
                gunIsmi.equals("carsamba")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("cuma"))) System.out.println("gecersiz deger girdiniz lutfen bir gun ismi giriniz");



//*************************************
// verilen sayi 100'den buyukse sayi'nin karesini  alip yazdiran// 100'den kucukse " sayi 100'den buyuk olmali" yazdiran
     // bir ternary olusturalim

     int sayi0=100;

        System.out.println(sayi0 > 100 ? sayi0 * sayi0 : "sayi 100'den buyuk olmali");


//***************************************************
        System.out.println("lutfen bir tam sayi giriniz");
        int sayiX= scan.nextInt();
        String str=sayiX%2==0? "sayi cifttir":"sayi tektir";
        System.out.println(str);






    }
}

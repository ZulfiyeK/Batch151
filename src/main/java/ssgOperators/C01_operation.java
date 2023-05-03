package ssgOperators;

import java.util.Scanner;

public class C01_operation {
    public static void main(String[] args) {


 //kullanicidan iki sayi isteyin ve bu sayilara aritmetic operation yapiniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1. sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("sayi 1 : "+sayi1);//5
        System.out.println("sayi 2 : "+sayi2);//2
        System.out.println("toplama : "+(sayi1+sayi2));//7
        System.out.println("cikartma : "+(sayi1-sayi2));//3//-3
        System.out.println("carpma : "+(sayi1*sayi2));//10
        System.out.println("bolme : "+(sayi1/sayi2));//2//0
        System.out.println("modulus : "+(sayi1%sayi2));//1//2
        System.out.println(sayi1);//5//2
        System.out.println(sayi2);//2//5

//**********************************************************

        int sayi3=3;
        int sayi4=7;
        System.out.println(sayi3 += 4); //sayi3=sayi1+4;//7
        System.out.println(sayi3);//7
        System.out.println(sayi3 -= sayi4);//sayi3=sayi3-sayi4;//0
        System.out.println("sayi3 : "+sayi3);//0
        System.out.println("sayi3 : "+sayi4);//7
        System.out.println(sayi3 = sayi4);//7
        System.out.println("sayi3 : "+sayi3);//7
        System.out.println(sayi4 *= sayi3);//sayi4=sayi4*sayi3;//49
        System.out.println("sayi4 : "+sayi4);//49
        System.out.println(sayi4 %= sayi3);//sayi4=sayi2%sayi3 kalan 0 oldugu icin sayi2 0 oldu
        System.out.println(sayi4);//0
        sayi4/=sayi3;//0
        System.out.println(sayi4);
        //System.out.println(sayi3 /= sayi4);//islemlerde olan hatalari dondurur

//**********************************************
        int sayi5=30;
        int sayi6=sayi5+4;
        System.out.println(sayi6);//34
        System.out.println(sayi5);//30
        sayi2+=5;

//***********************************************
        //assagidaki isleme bakiniz ve sonuclari dondurunuz

        boolean sonuc1=5>4&&7<9&&6+3==9&&5+2!=8;
        System.out.println(sonuc1);

        boolean sonuc2=5>4&&7>9&&6+3==9&&5+2!=8;
        System.out.println(sonuc2);

        boolean sonuc3=5>4&7>9&6+3==9&5+2!=8;
        System.out.println(sonuc3);

//***********************************************
        int sayi7=40;
        int sayi8=60;
        int sayi9=30;

        System.out.println(sayi7>30&&sayi7<70);

        System.out.println(sayi8>=60&&sayi9!=70);

        System.out.println(sayi9<100||sayi8>80);

        System.out.println(sayi9!=sayi8&&sayi8>sayi7);

        System.out.println(sayi8<30||sayi8>50&&sayi8==70);

















    }
}

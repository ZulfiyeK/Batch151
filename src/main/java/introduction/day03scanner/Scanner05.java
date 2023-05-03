package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz.
        //1. Alanini hesaplayiniz.(kisa kenar* uzun kenar)
        //2.Cevresini hesaplayiniz.(2*kisa kenar+2*uzun kenar)

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen Dikdortgenin kisa kenar uzunlugunu giriniz");
        double kisaKenar = input.nextDouble();

        System.out.println("lutfen Dikdortgenin uzun kenar uzunlugunu giriniz");
        double uzunKenar =  input.nextDouble();

        System.out.println(kisaKenar * uzunKenar);
        System.out.println(2*kisaKenar + 2*uzunKenar);

        System.out.println("Alan= " + kisaKenar * uzunKenar);
        System.out.println("Cevre= " + (2*kisaKenar + 2*uzunKenar));


        double alan = kisaKenar * uzunKenar;
        double cevre = (2*kisaKenar + 2*uzunKenar);


        System.out.println("Alan= " + alan);
        System.out.println("Cevre= " + cevre);



    }
}

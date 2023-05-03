package practices.day07;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {

// Kullanıcıdan sisteme bir rakam girmesini isteyiniz
// kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz.");
        int rakam = scan.nextInt();
        int toplam= 1;
        int faktoriyel = 1;

        while (toplam<=rakam){
            faktoriyel= faktoriyel*toplam;
            toplam++;
           }
        System.out.println(rakam+"!= "+ faktoriyel);
























    }


}

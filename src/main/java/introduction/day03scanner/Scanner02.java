package introduction.day03scanner;

import java.util.Scanner;

public class Scanner02 {
    //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz.
    public static void main(String[] args) {

        //1.Adim: Scanner Class'dan obje olustur.
        Scanner input = new Scanner(System.in);

        System.out.println("ilk isminizi giriniz");
        String firsthName = input.next();
        System.out.println("soy isminizi giriniz");
        String lastName = input.next();
        System.out.println(firsthName +" "+ lastName);

    }

}

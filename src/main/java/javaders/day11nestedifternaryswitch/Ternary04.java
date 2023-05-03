package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {

    /*
            Kullanicidan aldiginiz sayi cift ise yarisini yazdiriniz,
            tek sayi ise "Bu sayi ikiye bolunmez" yazdiriniz.
     */
    /*

        1. Ternary'de true ve false durumlari icin size verilen data typ'lari farkli ise olusturdugunuz container'in data type'ini "Object" yapin
        2. "Object" Java da bir class'dir
        3. "Object" Java daki butun Class larin "Parent"i dir.
        4. "Object " Class'inin parent'i yoktur, Javada parent'i olmayan tek Class "Object Class" dir.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please ente an integer");
        int num = input.nextInt();

        Object result = num%2==0? num/2: "Bu sayi ikiye bolunmez";// num/2 int dir, ama " bu sayi..." Stringdir.
                                                                    // Bu yuzden iki farkli datayi tek Class ta ancak Object icinde toplayabilir.

        System.out.println(result);//25==Bu sayi ikiye bolunmez, verdi / 20==10 verdi




    }
}

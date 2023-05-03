package javaders.day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {
   // nestedloop ic ice for seklinde yazilir. dilardaki for dongusu bir kez dondugunde icerdeki for uc kez doner.
   // sart degilse kullanmayiz. Nested loop sorusu cozmek icin iyi bilmek gerekir. gercek hayatta kullanamamk icin gayret sarfederiz.

 /*
 Nested For Loop
 EX: 1.Example:Type code to get the output like

                                Week: 1
                                  Day: 1
                                  Day: 2
                                  Day: 3
                                  .....
                                Week: 2
                                  Day: 1
                                  Day: 2
                                  Day: 3
                                  ....
                                Week: 3
                                  Day: 1
                                  Day: 2
                                  Day: 3
                                  ....
*/

for(int i = 1;i<3;i++){
    System.out.println("Week:"+i);

    for(int k =1; k<8;k++){
        System.out.println("Day:"+k);
    }
}

//Nested While Loop
//Nested while-loop
        int i=1;
        while(i<3){
            System.out.println("Week: " + i);
            int k=1;
            while(k<4){
                System.out.println("   Day: " + k);
                k++;
            }
            i++;
        }


/*
2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
asagidaki sekli olusturmek icin bie java prog.yaziniz.satir ve sutun sayisini kullanicidan aliniz
                        ****
                        ****
                        ****
        Note: Get the number of the rows/satir and the columns/sutun from user
                white_tick
        eyes
        pray::skin-tone-2
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz.");
        int satir = input.nextInt();
        System.out.println("Lutfen sutun sayisini giriniz");
        int sutun = input.nextInt();
        for(int r = 1;r<=satir; r++){
            for(int c = 1;c<=sutun; c++){
                System.out.print("* ");// yildizlar arasinda bosluk birakmak icin *dan sonra bir bosluk koyulur.
            }
            System.out.println();
        }


/*

Type code to get the output like
    1
    12
    123
    1234
    12345// burada her satir, satir sayisi kadar yazilacak. 2ci satir 2 sutun, 3cu satir 3 sutun vs vs

 */


        System.out.println("Lutfen satir sayisini giriniz");
        int str = input.nextInt();

        for(int m=1; m<=str; m++){
            for(int n=1; n<=m; n++){
                System.out.print(n);
            }
            System.out.println();
        }
















    }
}

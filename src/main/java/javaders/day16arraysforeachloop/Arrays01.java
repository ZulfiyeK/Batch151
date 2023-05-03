package javaders.day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //Kullanicinin coklu data'yi bir array'e yerlestirebilmesi icin gereken kodu yaziniz.
/*
1) Kullanicidan data almak icin Scanner object olustur
2) Coklu datayi yerlestirmek icin bir array olusturmaliyim.
3)Arrray olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyim.
 */

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz eleman sayisini giriniz");
        int numOfElemants= input.nextInt();
        System.out.println("To stop adding press 'q'");// loop un icine koysak tekrar tekrar sorar. bir kez sorsun diye disari aldik

        String stdNames[]= new String[numOfElemants];
        for(int i = 0;i<stdNames.length;i++){
            System.out.println("enter the "+ (i+1)+". student name");
            String name = input.next();

            if(name.equalsIgnoreCase("q")){
                break;
            }else {
                stdNames[i] = name;
            }
            }
        System.out.println(Arrays.toString(stdNames));//5 icin-[yasemin, ali, kevser, susi, meysi]
                                                        // q icin- [ali, null, null, null, null] ilk ismi girdikten sonra q ya basinca
                                                        //  ilk ismi yazdirip digerlerini null olarak yazdirdi.





    }
}

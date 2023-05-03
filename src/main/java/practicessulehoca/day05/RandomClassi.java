package practicessulehoca.day05;

import java.util.Random;

public class RandomClassi {
    public static void main(String[] args) {
        Random rnd = new Random();
        int sayi;
        sayi = rnd.nextInt();//icine sayi koydugumuzda belli sinirda calistiriyor.
        System.out.println(sayi);// -2 milyar ile +2 milyar arasindaki sayilardan herhangi birini dondurur.

        //int icine herhangi bir sayi yazarsak yazdigimiz sayiya kadar herhangi bir sayi dondurur. 0 dahil, verdigimiz sayiya kadar.


        int sayi1 = rnd.nextInt(5);// 0 dan 5'e kadar olan degerlerden birini dondurur. 0 dahil, 5 haric. 1,2,3,4,
        int sayi2 = rnd.nextInt(5)+2;//+2 demek her bir sayiya 2 ekle demek// 0 dan baslasin istemiyorsak parantez disina arttirmasini istedigimiz rakami yaziyoruz.
        //int sayi2 = rnd.nextInt(n)+m;==> 0+m, 1+m,2+m,3+m,4+m,5+m, olarak calisir. 2,3,4,5,6


        System.out.println(sayi1);//4
        System.out.println(sayi2);//3- 3-2=1 demek ki 1'i yazdirdi.

        int sayi3 = 3*rnd.nextInt(5);// rakamlari yazdirirken 3 ekleyerek yazdirir.1,4,7,10,13
        System.out.println("sayi3 = " + sayi3);// normalde 2,3,4,5,6
        // int sayi3 = k * rnd.nextInt(5);==> sayilar arasindaki mesafeyi gosteririr.


        int max= 10;
        int min= 5;
        //5,6,7,8,9,10 bunlardan birini uretsin istiyorum.
        int sayi4 = rnd.nextInt(max);//0,1,2,3,4,5,6,7,8,9 ama ben 10'da  olsun istiyorum o yuzden max+1 yaparim. ama bu seferde  5,6,7,8,9,10,11,12,13,14,15 olur.
        //ama ben 5,6,7,8,9,10, olsun istiyorum. bunun icin sayi7 daki formulu yazarim.

        int sayi5 = rnd.nextInt(max+1);//0,1,2,3,4,5,6,7,8,9,10 [0,max]
        System.out.println("sayi4 = " + sayi4);
        System.out.println("sayi5 = " + sayi5);

        int sayi6 = rnd.nextInt(max+1)+min;//0,1,2,3,4,5,6,7,8,9,10- +min demek ==> 5,6,7,8,9,10,11,12,13,14,15 bu sayiilardan birini yazdirir.
        System.out.println("sayi6 = " + sayi6);
        int sayi7 = rnd.nextInt(max+1-min)+min;////5,6,7,8,9,10
        System.out.println("sayi7 = " + sayi7);
        //ne kadar kaydiracagini minimum degerden aldim, yani 5 adim saga kaydir dersem o zaman 5,6,7,8,9,10,11,12,13,14,15 iken 5,6,7,8,9,10 olur.
        //bir aralikta herhangi bir sayi uret diyorsa( max-min)+1

    }
}

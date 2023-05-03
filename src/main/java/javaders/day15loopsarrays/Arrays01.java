package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

 /*

 Array, ayni data tipinde, coklu data depolamak icin javanin olusturdugu bir yapidir. Yani String icine string, int icine int koyulabilir.
 Arrya'ler "primitive data type'leri veya "reference'lar ile calisir.
 Non-primitive ler kompleks yapidadir, bu yuzden kullanilmaz. Arraylar cok hizlidir "Super Fast" dir ve cok memoryde az yer kaplarlar.
  */

    String stdNames[]= new String[5];// bu kod array olusturma kodudur. verdigimiz sayiya gore java memory de yer acar.

        System.out.println(Arrays.toString(stdNames));//[null]<==null'lar Stringin default degeridir.

        stdNames[0]="Ajda";
        stdNames[3]="Cuneyt";
        stdNames[2]="Kemal";
        stdNames[1]="Ayhan";
        stdNames[4]="Kemal";
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Kemal, Cuneyt, Kemal] // indekse gore calisir.

//Array'daki spresifik bir elemani nasil alabiliriz.
        System.out.println(stdNames[3]);//Cuneyt


//EX: stdNames Array'indeki her ismin sinuna yildiz koyarak console'a yazdiriniz.
//Stringlerde length() stringin adedini hesaplamak icin kullanilir, bu onun gorevidir. Arraylarda biz zaten sayiyi veriyoruz.

       for(int i = 0;i<stdNames.length; i++){  // length Stringlerde (method)parantezli, Arraylerde (variable)parantezsiz kullanilir.
            System.out.println(stdNames[i]+"*");//System.out.print(stdNames[i]+"*"+","); boyle de olur.
        }
    //2.yol: for-each loop==> Enhanced(Zenginlestirilmis) Loop - Mumkunse hep for-each loop kullanilir.
        for(String w :stdNames){
            System.out.println(w+"*");
        }


//EX: Bir int Array olusturunuz, 5 eleman ekleyiniz, elemanlarin toplamini bulup konsola yazdiriniz.

        int ages[]= new int[5];
        System.out.println(Arrays.toString(ages));//[0, 0, 0, 0, 0]


        ages[0]=12;
        ages[1]=24;
        ages[2]=13;
        ages[3]=25;
        ages[4]=30;
        System.out.println(Arrays.toString(ages));//[12, 24, 13, 25, 30]

        int sum= 0;//bunlar yeni bir data, bu yuzden yeni bir konteynir olusturdum.

        for(int w:ages){
            sum=sum+w;
        }
        System.out.println(sum);//104


//EX: Bir char array olusturunuz, 3 eleman ekleyiniz, elemanlarin carpimini bulup console'a  yazdiriniz.
        char ch[]=new char[3];

        ch[0]='J';
        ch[1]='P';
        ch[2]='A';

        int sum1= 1;// Baslangic degeri carpma da 1 dir.
        for(char k:ch){
            sum1=sum1*k;
        }
        System.out.println(sum1);//384800




    }
}

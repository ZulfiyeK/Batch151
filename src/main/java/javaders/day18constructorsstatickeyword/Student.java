package javaders.day18constructorsstatickeyword;

public class Student {


    /*
      Static'lerde degisim herkes tarafindan otomatik olarak gorulur.
      mesela  ogrenci , okuldaki ogrenci sayisi, mudur mudur yard. veli..
      okuldaki ogrenci sayisi herkesi ilgilendirir ama hepsini tek tek bilgilendirmek zordur.
      ama ogrenci sayisi static olursa hepsi otomatik gormus olur.

      ama bazi seyleri herksin bilmesine gerek yoktur, ogrencinin gelirinin artmasi veya azalmasini ogretmenin bilmesine gerk yok,
       o yuzden tattic olmaz, non-static olur.

     */


    public static int numOfRegisteredStd = 0; // static variable
    public int num = 0;//non-static variable

    public Student() {
        numOfRegisteredStd++;
        num++;

    }

    public static void main(String[] args) {
        System.out.println(numOfRegisteredStd);//0// ilk basta sifirken obje olusturduktan sonra asama asama artiyor. ve en son 3 oluyir.

        Student s1 = new Student();
        System.out.println(numOfRegisteredStd);//1

        Student s2 = new Student();
        System.out.println(numOfRegisteredStd);//2

        Student s3 = new Student();
        System.out.println(numOfRegisteredStd);//3

        System.out.println(s1.num);//1

    }
}
/*

    1. "Static" "class member"lar (variable + method + controctur + code blocks) tum objeler tarafindan paylasilir.
    2. "Static" "class member"lardaki degisiklikler tum object'ler tarafindan otomatik olarak gorulur.
    3. "Static" "class member"lar gokteki ayin dunyaya bagli oldugu gibi, class'a baglidirlar.
        Bu yuzden "Static variable" lara "class variable" da denir.
    4. "Static" "class member"larin nasil calistigini anlamak icin cizim yapip static olanlari class'a,
        olmayanlari object'e bagalayarak dusunmek bu konuyu kolaylastirir.
    5.  "Static" "class member"lari cagirmak icin object olusturmak gerekmez ve tavsiye edilmez.
    6. "non- Static" "class member"lari cagirmak icin object olusturmak sarttir.


 */
package practices.day02;

public class Q01_Variables {

    public static void main(String[] args) {

        //bir variable baslat
        int age = 15;
        int number = 43;
        String isim = "Ali";

        System.out.println("isim = " + isim);
        System.out.println(age);
        System.out.println("number = " + number);

        //Variable degerini kopyala
        int myAge = age;
        System.out.println("myAge = " + myAge);
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);

        // Ayni satirsa coklu variable deklere etmek artik kullanilan bir sey degildir.
        int year = 2022, month = 3, day = 15;
        System.out.println("month = " + month);
        System.out.println("day = " + day);
        System.out.println("year = " + year);
        //bir variablenin degerini guncelle
        year=2023;
        System.out.println("year = " + year);

        isim="veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);
        onunIsmi="Sally";
        System.out.println("onunIsmi = " + onunIsmi);

//bir variable deklere et:x
        double x;
        //bir variable baslat:y
        double y =55.6;

        //bir baska variable baslat:z
        double z =10;

        // x degiskenini y degiskeni ile baslat
        x =y;

        //veriable'i guncelle
        x =15.3;

        //degiskenleri yazdir

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);





    }


    }

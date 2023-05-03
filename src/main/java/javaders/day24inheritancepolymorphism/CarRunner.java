package javaders.day24inheritancepolymorphism;

public class CarRunner {
    public static void main(String[] args) {



//Butun Constructor'larin ilk satirinda gorunmez bir kod vardir ==> super();
//Bu kod Parent'i temsil eder ve parent'e yonlendirir. inheritance de contractor lar yukaridan asagi calisir, dededen toruna dgru
/*
Java diyor ki once parent'i sonra child'i olustur. Burada once Car sonra Toyota'yi olusturduk.
Java once Car'i calistirir. Yani once onu yazdirir, sonra asagidaki constructorlari calistirir.
Biz Java'ya Toyota(); constructor'ini calistir, icinde parametre olmayani calistir dedik.
Bu constructor Toyota uretecek, ama once parent'i olan Car'in uretilmesi gerekir.
Her constructor'in ilk satirinda gorunmez kodu vardir. O da super() seklindedir.
Super parent demektir. O yuzden once parent'e gidilir.
Car'in da parent'i varsa oradaki constructor da super parantez nedeniyle kendi parent'ina gider.
En tepeden Object Class'tan calismaya basladi asagilara kadar geldi.
Bizi yukariya tasiyan kod su super keyword'udur. Bu sizi parent'daki constructor'a tasir.
Toyota  child class'tir, chil = sub
Spur () ==> her constructor'in ilk satirinda gorunmez olarak bulunur ve bizi parent'deki constructor'a tasir.



 */

        Toyota t1= new Toyota();      // Toyota contructur'i kullan demek, Toyota'ya gidip oradan bilgi almali,
        t1.model= "Prius";            //ama once Car class'inin icinde car contructor'ini olusturuyor,
        System.out.println(t1.model);   // sonra toyota constructorunu olusturuyor

        // toyota() constructor eger boyle ise toyotadaki bos constructoru calistirir.
        //Toyota(Strin s) constructor eger boyle ise toyotadaki String li constructoru calistirir.


        Honda h1 = new Honda();
        String s = "Ali";

        Volvo v1 = new Volvo();
        v1.move();




    }
}

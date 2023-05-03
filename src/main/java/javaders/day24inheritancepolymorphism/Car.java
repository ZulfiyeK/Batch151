package javaders.day24inheritancepolymorphism;
/*
        1) Inheritance'da object olustururken constructor'lar yukaridan(Parent)
           asagiya(Child) dogru calisir.
        2) Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
        3) super() her constructor'in ilk satirinda gorunmez olarak bulunur.
           Isterseniz gorunur sekilde de yazabilirsiniz.
        4) super() sizi parent class'daki constructor'a tasir.
        5) this() sizi  ayni class icindeki contructor'lar  arasinda gezmemizi saglar.
        6) this() icinde bulundugunuz class'daki wariable'leri cagirmaya yarar.
        7) super() sizi parent class'daki variable'leri cagirir.
        8) parent'tan chil'a giderken " HAS-A " ( sahip olma) iliskisi vardir.
        9) child'dan parent'a giderken " IS-A " ( - dir ) iliskisi vardir.
        10) Eger data type'leri arasinda " IS A " ve " HAS A " iliskisi var ise bu data type'lerine " COVARIANT " denir.
*/

    /*
   3. Polymorphism ==> Coklu sekil
      Yani bir method 'un farkli sekillerde karsimiza cikmasi demektir.
      Polymorphism= overloading + overriding
      chil'e gore ozellestiriyoruz methodu, bu yuzden Polymorphism gerekli.bu ozellestirmeye overriding denir.
   2. Overriding parent classtaki methodu chil classin ihtiyaclarina gore ozellestirerek kullanmak demektir
   3. Overridin de methodun body'si degistirilir. Overloadind'de parametre degistirilir.
   4. Overridin de methos signarur'a dokunulmaz, dokunursaniz java kizar.
   5. move() bu kismin adina ==> signature denir.


    */






public class Car {

 //parent, chil'lerin ortak ozelliklerini tasir.ortak methodlar oldugu gibi ortak vaeriable'lerde olabilir.

    public void move(){
         System.out.println("Cars move...");
    }
    public void getBreak(){
        System.out.println("Cars break...");
    }
    public void engine(){
        System.out.println("Cars have engine...");
    }

    public String model= "Car";
    public int price =0;

    public Car(){// bu contructor'dir. contructor kek yapan annedir.
        System.out.println("Car constructor 1");
    }
    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }




}

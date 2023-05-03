package javaders.day23inheritance;

public class Animal {


//kod yazarken buyuk yapilar olusturmak iyi degildir. Atomik yapilar mumkun oldugu kadar kucuk parcalardir,
// biz de kod yazarken mumkun olan en kucuk sekilde olusturmamiz gerekir, buna "atomik yapi" denir.
// methodlarin fazla olmasi problem degil, guzel biseydir.

    /*
     1. eat() methodu gibi bir cok class'in kullanmasi gereken methoslari her class'a ayri ayri yazarsak
          1. tekrar yapmis oluruz.Tekrar, ideal cod'da olmamamlidir.
          2. ayni method'u tekrar tekrar yazmak zaman kaybiidir,
          3. tekrar tekrar yazilan method'un tamiri cok zaman alir.
          4. tekrar tekrar yazilan method'un gelistirilmesi cok zaman alir
          5. method'u tekrar tekrar yazmak atomik yapiya terstir.
     2. private Class member'lar child class lar tarafindan kullanilamazlar.
        public class member'lar child class memberlar tarafindan kullanilabilir.
        default class member'lar ayni package'de cdild classlar tarafindan kullanilabilir.
        protected class memberlar farkli package'de de olsalar child class'lar tarafinda nkullanilabilirler.

     3. java da bir class'in sadece 1 tane parent'i olabilir.
        coklu paret'a "multiple Inheritance" denir, tekli parent'a "Single Inheritance" denir.
        java Single Inheritance kullanir.  "multiple Inheritance" desteklemez.

     4. apartman seklindeki inheritance yapisina "multilevel inheritance" denir.
        java  "multilevel inheritance destekler



  bu sekildeki yapilara kalitimsal, mirasli hiyerarsik (inheritance) denir
  bir calss'in baska bir class'daki methodu kullanabilmesi icin o calss'in cocugu olmasi lazim.


     */

    public void eat(){
    System.out.println("Animals eat ....");
    }
    public void drink(){
    System.out.println("Animals drink ....");
    }









}

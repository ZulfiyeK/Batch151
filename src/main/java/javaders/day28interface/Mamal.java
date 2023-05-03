package javaders.day28interface;

/*
1)  Class --> Class'a parent olur  : extends ile
    interface -- > interface'e parent olur : extends ile
    interface --> Class'a parent olur : implements ile
    interface-->class'a child'a olamaz : olamaz
    ikisi de Ayni ise "extends", farkli ise "implements" ile child parent iliskisi kurulabilir.
    Class'i interface'in parent'i yapmayiz.
 */
/*
Abstract Class ile Interface arasindaki farklar
METHOD OLARAK FARKLAR
1)Abstract Class'lar hem "abstract" hem de "concrete" method'lar icerebilir fakat interface'ler sadece "abstract" method icerir.
  Ama inderface'lerde istersek "default" ve "static" keyword'lerini kullanarak "concrete" method uretebiliriz.
2)Abstract Class'lar multuple inheritance'i desteklemez ama interface'ler destekler.
VARIABLE OLARAK FARKLAR
3)Abstract Class'lar icinde her turlu variable olusturulabilir, interface'ler icindeki variable'lara public, static ve final olmak zorundadir.
4)"interface" Class'in child'i olamaz ama "abstract class" class'in child'i olabilir.
5)abstract class'lar da constructer vardir ama object uretemez, interface'lerde constructer yoktur bu yuzden object uretemez

 OOP'nin 4 basligi vardir. bunlari cok iyi ozumsemek lazim. cok onemli bir konu

 */

















public interface Mamal extends Animal {

String feedBaby = "Milk";
int age = 6;// iki tane int age yaptik. hata vermedi cunku cagirirken interface ismi ile cagiriyoruz.
            // bu yuzden karismasi mumkun degil.












}

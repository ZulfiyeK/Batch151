package zlfy.mehmethocaday26Polymorphism;

/*
1) Javada Object Class tum java classlarinin ortak parentidir
2) Javada Object Class haric tum classlarin parent i vardir.
3) Javada Parent tan child a olan iliskilere HAS A Relation Ship denir
   Javada child dan parent a olan iliskilere IS A Relation Ship denir
4) Javada her classin bir tane default constructoru vardir.
   Bu default constructor classin icinde gorunmez cunku
   default constructor Object Classin icindedir
5) Child class'tan bir object olusturdugumuzda Constructorlar en
   ustteki parent class'dan baslatilarak alta dogru calistirilir.
6) Child Class'daki constructordan parent classdaki constructor'a
   gidebilmek icin super() kullanilir
7) Parent classda birden fazla constructor varsa istenilen constructor super()
   ifadesinin icine yazilan parametreler yardimi ile secilebilir
8) Ayni class icinde constructorlari secmek icin this() kullanilir
   Ayni classta birden fazla constructor varsa istenilen constructor this()
   parantezinin icine yazilan parametreler yardimi ile secilebilir
9) super() ifadesini yazmak istege baglidir. Siz yazmasanizda java sanki super() varmis gibi davranir.
   Ama kodun daha okunur kilmak icin yazmaniz tavsiye edilir.
10) super() ve this () ifadeleri contrusctor icinde her zaman ilk satirda olmalidir.
11) bir constructor icinde super() ve this() ifadeleri sadece bir kez kullanilabilir.
    Cunku ikiside ilk satirda olmali(10. madde)
12) Inheritance da variable'lari cagirmak icin this veya super kullanilir.
    this==> kendi class'indan
    super==> parent class'indan variable yada method cagirmayi saglar
 */
public class Vehicle {
    public Vehicle(){
        this(5);//ayni class icindeki contrustor'a git demek
        System.out.println("Vehicle 1");
    }
    public Vehicle (int price){// soutla birlikte contructor deniyor
        System.out.println("Vehicle int parametreli");
    }
}

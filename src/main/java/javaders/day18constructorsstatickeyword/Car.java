package javaders.day18constructorsstatickeyword;


    /*
    1. Constructor Nasil Olusturulur
      Accsess Modifier + Class ismi + () + {}

    2. Method ile Constroctur arasindaki farklar nelerdir.
        a. "Method"larda return type olur, Cuntrocturlarda olmaz.
        b. "Method"lar yaptiklari islere gore isimlendirilirler."Controcturlar" ise her zaman Class ismi ile isimlendirilirler.
        c. "Method"lar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir.
        d. "Method" isimleri kucuk hafle baslar, Constructor isimleri Class ismi ile ayni oldugu icin buyuk harfle baslar.

    3. Parametreli Contructor'lar olusturarak ayni Class'tan farkli ozelliklere sahip objeler olusturabiliriz. Bu kalibimizin dinamik olmasini sagliyor.
 */
public class Car {
    String make = "Honda";
    String model= "Accord";
    int year = 2021;
    int price = 18000;


    /*
    Default Constructor
    Default Constructor'lar "parametre" kullanamzlar
    Default Constructor'larin body'si bostur.
    Java kiskanctir. Siz Default Constructor ' elle yazdiginizda Java Object Class iscindeki Default Constructor'i kullandirtmaz.

     */
        public Car(){
         //
    }


        //Custom Constroctur
        public Car(String make, String model, int year, int price) {
            this.make = make;       // Generate==> Contructor==> shift ile hepsini secerek enter diyoruz.
            this.model = model;     //This demek bu Class demek, This make: Bu Class taki make demek
            this.year = year;
            this.price = price;
        }

        //Custom Constroctur

        public Car(String make) {
            this.make = make;
        }

        //Custom Constroctur
        public Car(String make, int price) {
            this.make = make;
            this.price = price;  // Generate==> Contructor==> ctrl ile ikisini secerek enter diyoruz.
        }
    }










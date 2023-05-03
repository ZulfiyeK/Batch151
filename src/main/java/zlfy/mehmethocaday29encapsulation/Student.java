package zlfy.mehmethocaday29encapsulation;

public class Student {
// Encapsulation'un kelime anlami = kapsulleme demektir. Bu kapsulun icinde variable ve methodlar vardir,
// bunlari classlar ile capsule ederiz. Encapsulation Data Hiding(veri saklama)'dir.
//Access modifier'i private yaparak datayi diger class'lardan gorunmez yapmis oluruz, boylece datayi saklamis oluruz.
// bir kaliptan bir obje olusturup, o objeden de bir cok farkli obje olusturmamiza yarar.

    private String stdId = "AC2023102T";
    public int age = 19;

    private double notOrt = 3.53;
    private boolean succesful= false;

//Encapsulation yaptigimiz datayi istersek diger class'lardan okuyabiliriz.
//get method olusturarak Encapsualation edilmis datanin degerini okuyabiliriz.
//get methodlarin return typ'i okunmak istenen variable'nin return typ'i ile ayni olmak zorunda.
//get methodlar puplic olur. boolean variable icin olusturulduysa eger ismi "is" ile baslar
//"isSuccesful" gibi


    public String getStdId(){
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }

/*
1. Encapsulation yaptigimiz datayi istersek diger classlardan degistirebiliriz.
    - set methodlari her zaman puplik olur.
    -set methodlarin return type'i her zaman void olur.
    -set methodlar parametre kullanir ve hepsinde farklıdır,
    -parametrenin data type'i veriable olmak zorundadır.
    -set method ile var olan object uzerinde degisiklikler yaparak
    o object'i sanki yeni bir object'mis gibi kullanabliriz.
    get methodlarin diger adi"getter" dir.
    set methodlarin diger adi "setter" dir.
 */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {// void olmasinin sebebi, bana bise dondurmesini istemiyor.
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {// gizlenen datayi baska bir class'dan ulasip degistirmek istiyorum.
        this.succesful = succesful;
    }



}

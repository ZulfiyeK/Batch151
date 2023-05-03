package javaders.day27interface;

/*      INTERFACE METHODLAR
    1. interface icine concrete method konulamaz.
    2. interface'lerdeki methodlarin abstract oldugunu java bilir, bu yuzden interface icindeki
       abstract methodlarda "abctract" keyword kullanmaya gerek yoktur.
    3. interface icindeki absctact methodlarin tamami puplic'tir.
       bu yuzden interface'lerin icinde abstract method olustururken  access modifier yazmaya gerek yoktur.
    4. bir "interface" ' bir class'in parent'i yapmak istedigimizde "extends" keyword yerine "implements"
       keyword kullaniriz.
    5.  "Concrete Child Class"' lar "parent interface" daki "abstract method"lari override etmek zorundadirlar.
    6."interface" bir application da "Concrete Child Class"larin yapmak zorunda olduklari fonsiyonlari barindirirlar
       Bu yuzden "interface" lere "to-do list" de denir.
    7. interface parent icinde,ayni isimli  birden fazla abstract methodlar olusturabilirsiniz. abstract methodlarin body'si
       olmadigi icin child classlar ayni isimli methodlardan herhangi birini ovirride ederek kullanabilir.
    8. Birden fazla "parent interface" icinde ayni ismli abstract methodlar olusturdugunuzda bu
       method'larin "return type"lari ayni olmak zorundadir.
    9. Normalde "interface"in icine "concrete method" konulamaz ama bazi ozel durunlarda "concrete method" koymamiz gerekirse
            a. "default"  System.out.println("Uses gas less");
                default void eco(){ System.out.println("Uses gas less");}

            b. "static"  keyword unu asagidaki gibi kullanarak "interface" icine "concrete method"
                koyabiliriz. static void stop () { System.out.println("Stop securely...");}
   10. "default" veya "static" keyword'unu olusturdugunuz concrete methodla'in "concrete child class" lar tarafindan
        kullanilma zorunlulugu yoktur.
   11. "default" keyword'unu kullanarak olusturgunuz "concrete method"lara "object" olusturarak
        ulasilabilir.
       "static" keyword'unu kullanarak olusturgunuz "concrete method"lara ulasmak icin "object"
        olusturmaya gerke yoktur, "interface" ismi yeterlidir.

   12.  "interface" lerden "object" olusturulamaz. "interface" lerin "constuructor" i yoktur.








     */
public interface Engine {
    void start();
    void payment();
default void eco(){// burdaki default access modifier degil, bu yeni bir keyword, interfaizlerde yeni concrete method olusturmayi saglar.
    System.out.println("Uses gas less");//
}
static void stop(){
    System.out.println("Stop securely");
}// default olusturdugumuz methodlara obje olusturarak ulasabiliriz.
// interface'lerde obje olusturulamaz.cunku body'leri yoktur, bu yuzden yarim methoddur,
// yarim methodlardan tam obje olusturulamaz.'




}

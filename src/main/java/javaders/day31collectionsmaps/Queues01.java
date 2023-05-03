package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {
//Queue ==> Ilk giren urun ilk cikmalidir.  First In First Out .Bankalardaki numaralandirma sistemi bu sekildedir.

        Queue<String>wareHouse = new LinkedList<>();// Linkedlist kullandigimiz icin elemanlari bizim verdigimiz siraya gore dizdi, Queue de o yuzden buna gore dizdi.
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese]

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

//peek ilk elemani veriri
//element ilk elemani veriri...cunku first kullaninca hep ilk elemana odaklaniriz.

        wareHouse.peek();
        System.out.println(wareHouse.peek());//Meat
        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese]--peek() ilk elemani copy-paste yapar. Bos Queue'lar icin null verir

        System.out.println(wareHouse.element());//Meat
        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese]-- element() ilk elemani copy-paste yapar. Bos Queue'lar icin hata verir

        System.out.println(wareHouse.poll());//Meat
        System.out.println(wareHouse);//[Bread, Egg, Cheese]

        wareHouse.clear();
        System.out.println(wareHouse.poll());//null
        System.out.println(wareHouse.remove());//Exception--hata demek, bos oldugu icin silecek bise yoktur, o yuzden hata verir.




    }
}

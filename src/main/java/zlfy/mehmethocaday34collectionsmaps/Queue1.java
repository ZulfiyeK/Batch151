package zlfy.mehmethocaday34collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();// ilk girenin ilk cikacagi durumlarda Queue kullanilir. depo,ambarlarda, stok takibinde kullanilir.
                                                       // Queue= kuyruk (bankamatik kuyrugu gibi) demektir.
       // wareHouse.peek();// ilk elemani copy paste yapar.
       // wareHouse.element();// copy paste yapar ama null icermez.
       // wareHouse.remove() ;// ilk elemani siler.
       // wareHouse.poll();//cut paste yapar.

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Bread");
        wareHouse.add("Chese");
        System.out.println(wareHouse);//[Milk, Meat, Egg, Bread, Chese]- insertion order'a gore siraladi.
                                    // Constructrini LinkedListten kullandigimz icin kendine gore siraladi
        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Egg, Bread, Chese]

        System.out.println(wareHouse.peek());//Meat-- Listed'de bise yoksa, bos yapilarda null dondurur.
        System.out.println(wareHouse);//[Meat, Egg, Bread, Chese]

        System.out.println(wareHouse.element());//Meat-- Listed'de bise yoksa, bos yapilarda hata dondurur.
        System.out.println(wareHouse);//[Meat, Egg, Bread, Chese]












    }
}

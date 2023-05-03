package javaders.day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();// oncelige gore siralama demek.bankalarda oncelik siralamasi vardir.

        line.add("Milk");
        line.add("Meat");
        line.add("Bread");
        line.add("Egg");
        line.add("Cheese");
        System.out.println(line);//[Bread, Cheese, Meat, Milk, Egg]

        Deque<String> d = new LinkedList<>();// iki uclu seneryolar icin kullanilir.
        // Deque'daki add(), get(), peek(), poll() remove() methodlari first-last seklinde iki uclu olarak bulunur
        //deque==> Double ended Queue ==> iki uclu queue

        d.add("Milk");
        d.add("Meat");
        d.add("Bread");
        d.add("Egg");
        d.add("Cheese");
        System.out.println(d);//[Milk, Meat, Bread, Egg, Cheese]
        System.out.println(d.poll());
        System.out.println(d);
        System.out.println(d.remove());
        System.out.println(d);
        System.out.println(d.peek());
        System.out.println(d);
        System.out.println(d.element());
        System.out.println(d);


    }
}

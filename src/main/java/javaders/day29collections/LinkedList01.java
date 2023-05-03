package javaders.day29collections;

import java.util.LinkedList;

public class LinkedList01 {

/*
1. LinkedListler indeks kullanmazlar, bu yuzden eleman( node) ekleme ve silme islemlerinde tekrar indeksleme yapilmaz.
2. LinkListlerde node ekleme ve node silme islemleri yaparken sadece pointer'lari degistirir.
3. 1)LinkedList'ler node silme ve ekleme de cok basarili olduklari icin, silme ve ekleme islemlerini coklukla yapacaginiz zaman
     LinkedList kullaniniz.
4. ArrayList'ler index'leri adres gibi kullanir bu yuzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
NOTE:Ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa(muze ziyaretcileri gibi)LinkedList,
     "search" islemleri yapacaksa(Amerika eyaletleri gibi)ArrayList kullaniriz


Ayni turden bir cok seyin bir araya getirilip saklanmasi demektir, ayni tipteki datalari depolayan yapilardir.
Arrayler de coklu data icindir ama onlar ilklerdir ve esnek degildir. Ama List collectir.
ArrayList'ler eleman silmede ve eklemede tekrar indeksleme yapmak zorunda olduklarindan eleman ekleme ve silmede basarisizdirlar.
LinkedList eleman ekleme ve silmeyi cok kolay yapar.LinkedList'ler iki bolumdur, biri data kismi,, digeri de sonraki datayi gosteren pointer'dir
en basta ilk datayi gosteren "head" pointer, en sonda da "tail" pointer vardir. data ve pointer bututnune "node" denir.
LinkedListler indeks kullanmazlar bu yuzden silme islemi yaparken "node" olarak silerler.pointer'i kirar ve eklenecek olan node ya baglanir.
Kutuphane, muze gibi yerlerde sabah girenin aksam cikmis olmasi lazim, stok takibi yaparken. ArrayList'ler indeks kullandigi icin eleman bulmada cok iyidir.
Ama LinkedList'ler aramada cok kotu, head'e gelir ve senden sonraki eleman mi benim aradigim der,
everse bulur, degilse sonrakine yollar, ona sorar, degilse sonrakine...bu yuzden LinkedList node bulmada iyi degildir.

*/

    public static void main(String[] args) {

        LinkedList<String> s= new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");// LinkedList indeks ile calismaz, indeks girdigimizde LinkedList onu node'e donusturur."remove" ile de indeksle silmeyi yapar.
        s.addFirst("Kemal");// en basa ekler
        s.addLast("Ajdar");//en sona ekler.
        System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        s.remove(2);//
        System.out.println(s);//[Kemal, Esra, Esen, Ajda, Muge, Cuneyt, Esra, Ajdar]

        s.remove("Ajdar");
        System.out.println(s);//[Kemal, Esra, Esen, Ajda, Muge, Cuneyt, Esra]

        s.remove();// ilk node'u siler
        System.out.println(s);//[[Esra, Esen, Ajda, Muge, Cuneyt, Esra]

        s.removeFirstOccurrence("Esra");
        System.out.println(s);//[Esen, Ajda, Muge, Cuneyt, Esra]

        s.removeLastOccurrence("Esra");
        System.out.println(s);//[Esen, Ajda, Muge, Cuneyt]

        String r1= s.peek();// ilk node silmeden verir.
        System.out.println(r1);//Esen
        System.out.println(s);//[Esen, Ajda, Muge, Cuneyt]

        String r2 = s.poll();// ilk node size verir ve listten siler
        System.out.println(r2);//Esen
        System.out.println(s);//[Ajda, Muge, Cuneyt]


/*
Retrieves, but does not remove, the head (first element) of this list.
Returns: the head of this list
Throws: NoSuchElementException – if this list is empty */
        String r3 =s.element();
        System.out.println(r3);//Ajda
        System.out.println(s);//[Ajda, Muge, Cuneyt]


/*
Retrieves, but does not remove, the head (first element) of this list.
Returns:the head of this list, or null if this list is empty */
s.peek();


//Not: peek() ile elemant() ikiside ilk elemani silmeden size veriri.
// Ama peek() List bos oldugunda size "null" veriri element() ise "hata" verir.

s.pop();
/* Note: poll() ile pop() ikisi de ilk elemani siler ve size verir.
   Ama poll() list bos oldugunda size "null" verir pop() ise "hata" verir.
*/












    }


}

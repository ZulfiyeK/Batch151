package zlfy.soruBankasi.Iteratorss.soru1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {
/*
//A SIKKI  - X Y Z- dogru
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()) {
            Object el = it.next();
            System.out.print(el + " ");//X Y Z
        }
*/
/*
 //B SIKKI- []- dogru
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()) {
            Object el = it.next();
            it.remove();
        }
        System.out.println(list);//[]
*/
/*
//C SIKKI - [X!, Y!, Z!]-dogru
     List<String> list = new ArrayList<>();
    list.add("X");
     list.add("Y");
     list.add("Z");
     ListIterator<String> it = list.listIterator();
         while(it.hasNext()) {
     Object el = it.next();
     it.set(el + "!");
     }
     System.out.println(list);//[X!, Y!, Z!]
*/


//D SIKKI -[X, Y, Z]- yanlis
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");
        for(String w : list) {
            w = w + "!";
        }
        System.out.println(list);//[X, Y, Z]

























    }
}

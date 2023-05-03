package zlfy.soruBankasi.Iteratorss.soru2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String args[]) {
/*
// A SIKKI - AB CD EF- dogru

        List<String> list = new ArrayList<>();
        list.add("AB");
        list.add("CD");
        list.add("EF");
        ListIterator<String> it = list.listIterator();
        if (it.previousIndex() == -1) {
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        } else {
            System.out.print("Good Morning!");
        }
 */

 //B SIKKI - Good Morning!- dogru
        List<String> list = new ArrayList<>();
        list.add("AB");
        list.add("CD");
        list.add("EF");
        ListIterator<String> it = list.listIterator();
        if(it.previousIndex()!=-1) {
            while(it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        }else {
            System.out.print("Good Morning!");

        }




















    }
}
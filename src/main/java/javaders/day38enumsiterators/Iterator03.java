package javaders.day38enumsiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {
    public static void main(String[] args) {


        //Verilen bir listeyi tersten yazdiran kodu yazdiriniz.
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);//[1, 2, 3, 4, 5]

        ListIterator itr = list.listIterator();
        while (itr.hasNext()){//senden sonra eleman var mi, true dondurur,en sona geldiginde false verir ve soutta yazdiri.
            itr.next();//en sona kadar ilerletir.
        }
        while (itr.hasPrevious()){//senden once eleman var mi, true dondurur ve false verene kadar ilerletir. false verince soutta yazdirir.
            System.out.print(itr.previous()+ ",");//5,4,3,2,1,

        }













    }
}

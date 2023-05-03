package javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

 /*

 1. bir Integer List'tki birbirine en yakin iki elemani bulunuz.
 [12,23,10,19]==>12 and 10

  */

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

    //  Collections.sort() Methodu "Naturel Order" siraya buyukten kucuge dogru siraya dizer
        Collections.sort(nums);// kucukten buyuge dizer
        System.out.println(nums);

        int minDiff = nums.get(1)-nums.get(0);// indeks numaralarina gore cikarma yapip en gucuk degeri bulur.

        for(int i =1; i<nums.size(); i++){
            minDiff = Math.min(minDiff,nums.get(i)-nums.get(i-1));

        }
        System.out.println(minDiff);//2
        for(int i =1; i<nums.size(); i++){
            if(nums.get(i)-nums.get(i-1)==minDiff){
                System.out.println(nums.get(i-1) + " and " + nums.get(i));//10 and 12
                //biribiri ile ayni farki veren coklu degerlerde de hepsini yazdiri.

            }
        }


    }
}

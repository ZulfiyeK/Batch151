package practices.day07;

import java.util.Arrays;

public class C04_Array {
    public static void main(String[] args) {

        // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6


        int arr[]={1,2,-3,4,-5,-6};
        int brr[]=new int[arr.length];// uzunluklari ilk arr'deki kadar olsun diye esitleme yaptik

        int idx=0;// ilk indeksten itibaren esayn ettim
        for(int each:arr){// arr'deki her bir elemani foreach ile aldik.
            brr[idx]= each*-1;// her elemanin negatif degerini sirasiyla brr'ye esayn ettik.
            idx++;// index'i birer arttiralim

        }

        System.out.println(Arrays.toString(brr));
























    }
}

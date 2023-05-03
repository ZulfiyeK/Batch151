package javaders.day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

// bir arrayin elemanlarida (array icinde ki arraylere ) array olursa bu tarz array'lere " Multidimensional Array" denir.

/*
arr[][] = [ [5,2] ,[11,23],[38,41] ] ==> arrayler de indek ile calisir.
             0 1     0 1     0 1     ==> 1. satirdakilerin indeksi
              0       1       2      ==> 2. satirdakilerin indeksi.
            [5,2] arrayine ulasmak icin once 0 ci indekse gitmeliyim.
            [5,2] nin 2 sine ulasmak istiyorsam 1 ci indekse gitmeliyim.

            [11,23] arrayine ulasmak icin once 1 ci indekse gitmeliyim.
            [11,23] nin 11 ine ulasmak istiyorsam 0 ci indekse gitmeliyim.

            [38,41] arrayine ulasmak icin once 2 ci indekse gitmeliyim.
            [38,41] nin 38 ine ulasmak istiyorsam 0 ci indekse gitmeliyim.
 */

//1. Multidimensional Array nasil olusturulur ve nasil eleman eklenir.

        String names[][] = new String[3][2];
        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";
        System.out.println(Arrays.deepToString(names));//[[A, k], [p, M], [C, Z]]

        System.out.println(Arrays.toString(names));//[[Ljava.lang.String;@58ceff1, [Ljava.lang.String;@7c30a502, [Ljava.lang.String;@49e4cb85]***referaslari

        //Multidimensional Array'leri konsola yazdirmak icin toSpring methodunu degil, deepToString methodunu kullaniniz.
        //toStringde java sadece ilk duvari asabilir. ilk koseli parantez icini alir. bir ic kisma gecemez.


//2. Multidimensional Array icinden spesifik bir eleman nasil yazdirilir.
        System.out.println(names[1][1]);//M


//2. Multidimensional Array icinden bir array nasil yazdirilir.

        System.out.println(Arrays.toString(names[0]));//[A, K]
        System.out.println(Arrays.toString(names[1]));//[P, M]
        System.out.println(Arrays.toString(names[2]));//[C, Z]

//3.kisa yoldan Multidimensional Array nasil olusturulur.
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        // koseli parantez yaptigimizda ic arraylerin esit degerlerde olmasi gerekir. bu sekilde gerek yok.

//4. Yukaridaki students array'inde toplam kac tane isim oldugunuz bulunuz.

        int sum = 0; // yeni bir deger soruyorsa yeni bir kalsor olusturur ve icine de 0 yazariz.

        for (String[] w : students) {

            sum = sum + w.length;
        }
        System.out.println(sum);//8

//5. Yukaridaki student array'inde icinde "m" olan isimleri konsola yazdiriniz.


        for (String[] w : students) {           // w icine "Ali Kemal" geldi. buradan ikici fora gitti ve k nin icine girdi.
                                                //oradan if'e gitti ve contains'de kontrol etti icinde m var mi bakti. true verdi ve soutta k nin icine koydu.
            for (String k : w) {               // tumunu bu sekilde kontrol ediyor ve en son Kemal Cemal yazdiriyor.
                if (k.contains("m")) {
                    System.out.println(k);//Kemal Cemal
                }
            }

        }


// 6. Bir integer Multidimensional Array olusturunuz, tum elemanlarin carpimini hesaplayiniz.
        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};
        int result = 1;
        for (int[] a : nums) {
            for (int k : a){
                result = result * k;
             }
        }
            System.out.println(result);//1680

//7. iki boyutlu bir array'i tek boyutlu bir arry'e ceviriniz.
        int numbers[][] = {{5, 4}, {2, 3, 2}, {7}};//==>{5,4,2,3,2} ye cevirmek istiyoruz.

        //1.step iki boyutlu arrayde kac eleman oldugunu bulan kodu yazmaliyiz.
        int toplamElemanSayisi=0;
        for(int[]n:numbers){
            toplamElemanSayisi=toplamElemanSayisi+n.length;

        }


        //2.step tek boyutlu array'i iki boyutlu arrayin eleman sayisini kullanarak olusturmaliyiz.

        int newArr[]= new int[toplamElemanSayisi];

        //2.step iki boyutlu array daki elemanlari tek boyutlu array'a tranfr etmeliyim

        int idx = 0;
        for(int[]n: numbers){
            for(int k:n){
                newArr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2, 7]


//8. bir integer MultiDimensional Array deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = {{15, 4}, {12, 43, 21}, {7}};//==>4+43=47 olmali

        int small = ages[0][0];
        int big = ages[0][0];

        for(int[] t: ages){// sirayla t nin icine {15,4}, {12,43,21},{7} yi yollayacak
            for(int k :t){
                small =Math.min(small,k);
                big =Math.max(big,k);  // sayilar esit oldugunda herhangi birini alir, kucuk oldugunda kucuk olani
            }
        }
        System.out.println(small+big);//47

































    }
}
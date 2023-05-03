package javaders.day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));//436
        System.out.println(getTheSumOfSquareOfOdds2(nums));//436
        System.out.println(getTheSumOfSquareOfOdds3(nums));//436

        System.out.println(ciftElemanlarinTekrarsizKareleri1(nums));//147456
        System.out.println(ciftElemanlarinTekrarsizKareleri2(nums));//147456

        System.out.println(ciftElemanlarinMaksIleTEkElemanlarinMinDegerToplami1(nums));//15- ciflerin buyugu 8, teklerin en kucugu 7 toplami 15

        System.out.println(ciftElemanlarinYedidenKucukMaksIleTEkElemanlarinMinDegerToplami(nums));//6+9=15

    }

 //Example 1: Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    //1.yol
    public static int getTheSumOfSquareOfOdds1(List<Integer>nums){
        return nums.
                stream().//burda 9 deger var - 12,9,131,14,9,10,4,12,15
                filter(t-> t%2!=0).// burda ciftler eleniyor ve 4 tane deger kaliyor.- 9,131,3,15
                map(t-> t*t).//map ile bu 4 sayinin iki katini aliyoruzz.- yukardskilerin karesi alinir.
                reduce(0,(t,u)->t+u);//azaltmak,indirgemek demek.  deger sayisini azaltmak.
                // Coklu datayi tekli dataya cevirmek istedigimizde bu method kullanilir
    }

    //2.yol
    public static int getTheSumOfSquareOfOdds2(List<Integer>nums){
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).
                reduce(0,Math::addExact);//Class ismi::Methos ismi==> " Method Referans " demek.
    }

    //3.yol
    public static int getTheSumOfSquareOfOdds3(List<Integer>nums){
        return nums.
                stream().
                filter(Utils::isOdd).//method referans yaptik.
                map(Utils::getSquare).//utils classi actik ve carpma methodu olusturduk, oradan cagirdik.
                reduce(Math::addExact).
                get();//getMethodu Optional<integer>'i integer'a cevirir.

            }

//Example 2 : Verilen bir List' cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz .
//1. yol
    public static int ciftElemanlarinTekrarsizKareleri1(List<Integer>numss){
            return numss.
                    stream().
                    filter(t-> t%2==0).
                    map(t-> t*t).
                    distinct().//karelerinin tekrarsiz olmasini istedigi icin reduce den once yaziyoruz.
                    reduce(1,(t,u)->t*u);//carpma islemi etkisiz eleman 1, karesini alacagim icin iki harf olusturuyorum t ve u, sonra onlari carpiyorum.
        //t degerini 1 den alir, u stream'den alir.
        }

//2. yol
    public static int ciftElemanlarinTekrarsizKareleri2(List<Integer>numss){
        return numss.
                stream().
                filter(Utils::isOddT).
                map(Utils::getSquare).
                distinct().//karelerinin tekrarsiz olmasini istedigi icin reduce den once yaziyoruz.
                reduce(Math::multiplyExact).
                get();//carpma islemi etkisiz eleman 1, karesini alacagim icin iki harf olusturuyorum t ve u, sonra onlari carpiyorum.
        //t degerini 1 den alir, u stream'den alir.
    }



//Example 3 : Verilen bir List' cift sayi olan elemanlarin maksimum degeri ile tek sayi olan elemanlarin minimum degerinin toplamini hesaplayan method olusturunuz .

    public static int ciftElemanlarinMaksIleTEkElemanlarinMinDegerToplami1 (List<Integer>nums){
        int max =  nums.stream().filter(t->t%2==0).reduce((t,u)->t>u ? t:u).get();
        int min = nums.stream().filter(t->t%2!=0).reduce((t,u)-> t<u ? t:u).get();
        return max+min;
    }

  //  public static int ciftElemanlarinMaksIleTEkElemanlarinMinDegerToplami2 (List<Integer>nums){
       // int max =  nums.stream().filter(Utils::isOddT).reduce(Map::forEach);
       // int min = nums.stream().filter(Utils::isOdd).reduce((t,u)-> t<u ? t:u).get();
       // return max+min;
        //    }



//EX 4: //Example 4: Verilen bir list'teki cift sayi olan elemanlarin 7 den kucuk maximum degeri ile
// tek sayi olan elemanlarin 8 den buyuk minimum degerinin toplamini hesaplayan method'u olusturunuz
public static int ciftElemanlarinYedidenKucukMaksIleTEkElemanlarinMinDegerToplami (List<Integer>nums){
    int max =  nums.stream().filter(t->t%2==0 && t<7).reduce((t,u)->t>u ? t:u).get();
    int min = nums.stream().filter(t->t%2!=0 && t>8).reduce((t,u)-> t<u ? t:u).get();
    return max+min;
}









}

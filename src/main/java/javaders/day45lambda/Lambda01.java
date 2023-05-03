package javaders.day45lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

        public class Lambda01 {
            public static void main(String[] args) {

                List<Integer> nums = new ArrayList<>();
                nums.add(12);
                nums.add(9);
                nums.add(131);
                nums.add(14);
                nums.add(9);
                nums.add(10);
                nums.add(4);
                nums.add(12);
                nums.add(15);

                hepsiCiftMi(nums);//false
                herhangiBiriTekMi(nums);//anyOdd = true
                ilkUcElemaniAtlaIndirimYap(nums);//15.0, 18.0, 18.0, 21.0, 22.5, 196.5,
                System.out.println();
                ciftOlanlariYazdir(nums);//12 14 10 4 12
                System.out.println();
                tektOlanlarinKareleriniYazdir(nums);//81 17161 81 225
                System.out.println();
                tekOlanlarinKupleriniYazdir(nums);//729, 2248091, 3375,
                System.out.println();
                benzersizCiftlerinKareleriToplami(nums);//456
                System.out.println();
                benzersizCiftlerinKareleriCarpimi(nums);//45158400
                System.out.println();
                maxDegeriYazdir(nums);//131
                System.out.println();
                minDegeriYazdir(nums);//4


            }//main

            //1)  Bir listedeki elemanların hepsinin çift sayı olup olmadığını kontrol eden method'u oluşturunuz.

            public static void hepsiCiftMi(List<Integer>nums){
               boolean ciftMi= nums.stream().allMatch(t->t%2==0);
                System.out.println(ciftMi);

            }



            //2)  Bir listedeki elemanların herhangi birinin tek sayı olup olmadığını kontrol eden method'u oluşturunuz
            public static void herhangiBiriTekMi (List<Integer> nums){
                boolean anyOdd= nums.stream().anyMatch(t->t %2 != 0);
                System.out.println("anyOdd = " + anyOdd);

            }



            //3)  Bir listedeki en kucuk ilk 3 eleman haricindekilere %50 artis yapan method'u oluşturunuz.
            public static void ilkUcElemaniAtlaIndirimYap(List<Integer> nums){
                nums.stream().sorted().skip(3).map(t->t*1.5).forEach(t-> System.out.print(t+ ", "));
            }



            //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
           public static void  ciftOlanlariYazdir(List<Integer>nums){
             nums.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+ " "));


           }


            //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
            public static void  tektOlanlarinKareleriniYazdir(List<Integer>nums) {
                nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
            }


            //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
            public static void tekOlanlarinKupleriniYazdir(List<Integer>nums){
                nums.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+", "));
            }


            //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
            public static void benzersizCiftlerinKareleriToplami(List<Integer>nums){
           int toplam =  nums.stream().distinct().filter(t-> t%2==0).map(t->t*t).reduce(Math::addExact).get();//reduse coklu datadan tek bir dataya ulasmak demektir.
                System.out.print(toplam);
            }


            //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
            public static void benzersizCiftlerinKareleriCarpimi(List<Integer>nums){
              int carpim = nums.stream().distinct().filter(t-> t%2==0).map(t->t*t).reduce(Math::multiplyExact).get();//reduse coklu datadan tek bir dataya ulasmak demektir.
                System.out.print(carpim);
            }


            //9)Liste ogelerinden max degerini veren bir method olusturunuz
                       public static void maxDegeriYazdir(List<Integer>nums){
                nums.stream().distinct().sorted(Comparator.reverseOrder()).limit(1).forEach(t-> System.out.print(t));
            }
                //2. yol==> nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t: u);
                //3. yol==> int maxValue = nums.stream().distinct().reduce(Math::max).get();  System.out.println(maxValue);




            //10)Liste ogelerinden minumum degerini veren method olusturunuz
            public static void minDegeriYazdir(List<Integer>nums){
                int minValue = nums.stream().distinct().reduce(Math::min).get();
                System.out.println(minValue);

                // 2.yol==> nums.stream().distinct().sorted().limit(1).forEach(t-> System.out.print(t));

            }


        }



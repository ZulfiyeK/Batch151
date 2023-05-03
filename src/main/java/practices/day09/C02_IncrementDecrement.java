package practices.day09;

public class C02_IncrementDecrement {
    public static void main(String[] args) {

        int a= 15;
        int b = a++;// a++'yi b'ye esayn ettik, a++'ya gelemeden yazdiriyor. bu yuzden 15
        System.out.println(b);// 15--yukaridan asagi ve soldan saga calistirdigi icin b yi 15 dondurur.
        System.out.println(a);//16



        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        sayi2 = sayi1++;
        System.out.println(sayi2);//10
        System.out.println(sayi1);//11

        sayi3 = ++sayi1;
        System.out.println(sayi3);//12
        System.out.println(sayi1);//12

        System.out.println(sayi3++);//12// soldan saga calistigi icin en son 12 vardi, arttirmadan direk yazdirdi.
        System.out.println(sayi3);//13

        System.out.println(--sayi2);//9-- en son degeri 10 du, o yuzden 9 yapti.

        sayi2++;
        System.out.println(sayi2);//10

        System.out.println(sayi2--);//10

        System.out.println(sayi2);//9

        System.out.println(sayi3++);//13
        System.out.println(sayi3);//14


    }

}

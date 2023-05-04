package practices.day12;

public class C03_Russuleti {


    /*
   ================== RUSSULETI ======================
           Birbirleriyle çarpılacak sayılar yan yana yazılır.
           ilk sayı ikiye bölünür ve sonuç hemen altına yazılır.
           sonuç küsuratlı(kesirli) çıktıysa kesir kısmıyla ilgilenilmez
           sadece tam sayı kısmı yazılır. diğer sayı ise ikiyle çarpılır
           ve sonuç hemen altına yazılır. bu işlem yeni sayılar için tekrarlanır,
           ta ki ilk sayı ikiye bölünerek 1(bir) değerine ulaşana kadar.
           birinci sütundaki çift sayıların ikinci sütundaki karşılıkları silinir.
           ikinci sütunda silinmeyen sayılar toplandığında elde edilen sonuç
           istenilen sayıdır.
           örnek:
           456 x 219 = ? ==> 99864

           456........219 ====> 456 / 2 .........219 * 2
           228........438 ====> 228 / 2 .........438 * 2
           114........876 ====> 114 / 2 .........876 * 2
           57 ........1752 ====> 57 / 2 .........1752 * 2
           28 ........3504 ====> 28 / 2 .........3504 * 2
           14 ........7008 ====> 14 / 2 .........7008 * 2
           7  ........14016 ====> 7 / 2 .........14016 * 2
           3  ........28032 ====> 3 / 2 .........28032 * 2
           1  ........56064 ====> 1 .............56064

   kullanicidan iki sayi isteriz ve eski usulde carpmasini isteriz.

   int a = 456;
   int b = 219;
   int c = 2;

   a%c <= 1 olana kadar b*2 yap
   */
    public static void main(String[] args) {
        int ilkSayi= 456;
        int ikinciSayi= 219;


        System.out.println(carpim(ilkSayi, ikinciSayi));
    }
    public static int carpim(int ilkSayi, int ikinciSayi) {
        boolean negatif = false;
        if(ilkSayi<0){
            ilkSayi= -ilkSayi;
            negatif =! negatif;
        }
        if(ikinciSayi<0){
            ikinciSayi= -ikinciSayi;
            negatif =! negatif;
        }

        int toplam = 0;
        do{
            if(ilkSayi %2 !=0){//ilkSayi Tek sayi ise
                toplam = toplam+ikinciSayi;//ikinci sayiyi toplam variable'ina toplayarak ata
            }
            ilkSayi = ilkSayi/2;
            ikinciSayi = ikinciSayi * 2;

        }while(ilkSayi>=1);//ilkSayi 1 oluncaya kadar calis

        if(negatif)
            toplam =- toplam;
        return toplam;
    }
}
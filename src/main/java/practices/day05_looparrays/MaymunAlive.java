package practices.day05_looparrays;

public class MaymunAlive {
    public static void main(String[] args) {


    /*
        INTERWIEW SORUSU

        Adada yalnız bir maymun var Her gün 4 muz yemesi gerekiyor o adada sadece 165 muz var
        Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

  */


    int numOfBananas = 165;
    int survivaldays= 1;
    boolean yasiyorMu= true;

    do{
        numOfBananas-=4;//toplam muz sayisindan her gun 4 muz eksilir.
        System.out.println("Kalan muz sayisi "+ numOfBananas);
        survivaldays++;
        if(numOfBananas<4){
            yasiyorMu=false;
            System.out.println("Bugun "+ survivaldays +" .gun yereli muz kalmadi ve maymun oldu..");

        }else{
            System.out.println("Bugun "+ survivaldays +" .gun maymun hala yasiyor.");
        }
    }while (yasiyorMu);































    }

}

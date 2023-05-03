package practices.day01;

public class C03_Ascii {
    public static void main(String[] args) {

        // CEM isminin icerisinde bulunan harfleri kullanmadan " CEM" yazdırınız

        /*
        C==>67, B==>66+1, yada
        E==>69, D==>68+1        B+3
        M==>77, L==>76+1        B+11

         */

        char ilkKarakter = 'B'+1;
        char ikinciKarakter = 'B'+3; // ya da 'D'+1
        char ucuncuKarakter = 'B'+11; // ya da 'L'+1

        System.out.println(""+ilkKarakter+ikinciKarakter+ucuncuKarakter);



    }
}

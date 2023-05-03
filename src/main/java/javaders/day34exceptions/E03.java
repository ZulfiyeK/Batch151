package javaders.day34exceptions;

public class E03 {
    public static void main(String[] args) {
        System.out.println(getNumOfChars("Java"));//4
        System.out.println(getNumOfChars("Money"));
        System.out.println(getNumOfChars(""));
        System.out.println(getNumOfChars(null));//NullPointerException-- String class'da null ile uyumlu olmayan methodlar kullanildiginda atilir.


    }
    //Bir strindeki eleman sayisini veren Method olusturunuz.
    public static int getNumOfChars(String s){
    //return s.length();

        int result = 0;
        try {
            result = s.length();
        }catch (NullPointerException e){
            System.out.println("Some String methods do not work with null");// herkesin anlayacagi bir mesaj
            System.out.println(e.getMessage());// null-  bu method javanin kendi teknik mesajidir. varsa onu yazdirir.
                                                //null verdi demek ki mesaji yok.
        }
        return result;
    }
}

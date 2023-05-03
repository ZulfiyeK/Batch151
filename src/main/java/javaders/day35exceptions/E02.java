package javaders.day35exceptions;

public class E02 {
    public static void main(String[] args) {
        System.out.println(getCharFormString("Java",2));//v
        System.out.println(getCharFormString("Java",8));//StringIndexOutOfBoundsException- olmayan indekslerde atilir.

    }

    //Example 1 : Bir String'deki character'i index kullanarak alan bir methd olusturunuz
    public static char getCharFormString(String str,int idx) {
        try {

            return str.charAt(idx);

        }catch (StringIndexOutOfBoundsException e){
            idx = Math.abs(idx);// 8 in mutlak degerini alir.
            idx = idx%str.length();//8%4(length)=kalan 0 olur, dolayisiyla indeksin yeni degeri 0 oldu
            return str.charAt(idx);//J-- idx'de 0.indeksi al deriz.
        }


    }
}

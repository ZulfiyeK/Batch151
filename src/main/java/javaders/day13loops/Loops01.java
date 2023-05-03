package javaders.day13loops;

public class Loops01 {
    public static void main(String[] args) {

//EX: 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz.
        for (int i =21;i<181;i++){
        if(i%4==0&&i%6==0){
        System.out.print(i+" ");//24 36 48 60 72 84 96 108 120 132 144 156 168 180
        }
        }

        System.out.println();
//EX: Size verilen kucuk harfle yazilmis String'in indexi cift sayi olan character'lerini buyuk harfe donusturunuz
        String s= "miami";
        for(int i =0 ;i<s.length();i++) {
        String ch = s.substring(i, i + 1);
        if (i % 2 == 0) {
        System.out.print(ch.toUpperCase());
        } else {
        System.out.print(ch);//MiAmİ
        }
        }


       System.out.println();
//EX: Verilen bir string'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz.
       String s1= "Hello Java";

       for(int i =0;i<s1.length();i++){
       char ch=s1.charAt(i);
       if(ch=='a') {
       break;
       }else{
       System.out.print(ch); //Hello J
       }
       }
       System.out.println();
//EX: Verilen bir string'de ilk 'a' harfinden sonraki tum character'leri tersten console'a yazdiriniz.
       String s3 ="Tokatci";

       for(int i = s3.length()-1;i>=0; i--){
       char chr = s3.charAt(i);
       if(chr=='a') {
       break;
       }else{
       System.out.print(chr); //ict
       }
       }
    }
}

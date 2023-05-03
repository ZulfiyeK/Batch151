package javaders.day35exceptions;

public class E01 {
    public static void main(String[] args) {
        System.out.println(convertStringToInt("12ab")+2);//NumberFormatException : sayiya cevirmemi istedigin Strin sayi formatinda degil
        System.out.println(convertStringToInt("1254")+2);// 1256 veriri.

    }

   // Bir string'i integer'a ceviren bir method olusturunuz
   //Bir String'i Integer'a ceviren method olusturunuz.
   public static int convertStringToInt(String str){

       try{
           return Integer.valueOf(str);
       }catch(NumberFormatException e){//NumberFormatException valueOf() method'u non-digit character iceren bir String ile kullanildiginda atilir.
           str = str.replaceAll("[^0-9]", "");
           return Integer.valueOf(str);
       }
   }
















}

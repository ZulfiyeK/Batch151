package javaders.day21datetime;

public class Varargs01 {
    public static void main(String[] args) {

        System.out.println(add(5,2,4,3));//14
        getInitials("Ali Can" , "Kemal Han" , "Tuncay Cinar" , "Ibrahim Catal");

    }
    /*
        ***** 1 /*****************
        Toplama islemi yapan bir method olustur.
        Asagidaki gibi farkli methodlar olusturarak is yapamayis. Cunku kullanici farkli sayidaki sayilari toplamak isteyebilir.
        her ihtimal icin method olusturmak mumkun degildir.


             public int toplama(int a, int b){
                   return a+b;
             }
             public  int toplama(int a, int b, int c) {
                   return a + b + c;
             }
    */

  //  Java, farkli sayidaki parametrlerin hepsini kabul eden bir yapi olusturdu. Bu yapiya "Varargs" denir.
  //  Varargs'lar arkada array yapisini kullanir.

  //  public static int add(int... a){        // (int... a) bu yapi icine bir eleman da olur, 1000 de olur hic de olur.
  //  Varargs dipsiz bir kuyu gibidir o yuzden hic son gelmez bu sebeple ikinci bir varargs koyamayiz. ama ilk sirata bir deger koyup sonra vararg yapilabilir.

     public static int add(int... a){

      int sum = 0;
      for(int w:a){
         sum=sum+w;
      }
         return sum;
      }

        //************** 2 ****************
        //   verilen isimlerin ilk haflerini konsola yazdiran methodu olusturunuz.
        // Ali Can ==> AC          Kemal Han==>

      public static void getInitials(String... s){
      String Initials = "";
         for(String h: s){
         Initials = Initials+ h.charAt(0)+ h.split(" ")[1].charAt(0) ;
         }
         System.out.println(Initials);
         Initials ="";
         }


}

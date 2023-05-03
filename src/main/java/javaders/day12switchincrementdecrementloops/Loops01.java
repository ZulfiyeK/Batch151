package javaders.day12switchincrementdecrementloops;

public class Loops01 {
    public static void main(String[] args) {
        /*
            Code yazarken ; tekrarli code yazmamaya dikkat ediniz.
                            yazdiginiz code'un gerektiginde tamir edilebilmesinin kolay olmasina,
                            yazdiginiz code'un gerktiginde gelistirilebilmesinin kolay olmasina,
                            yazdiginiz cede'un farkli senrayolar icin de calisabilmesine dikkat ediniz
         */

      //ekrana 5 kez "Hi" yazdiriniz.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // yukaridaki gibi tekrar gerektiren isleri yapmak icin loop yapilarini kullaniriz
        //4 tane loop yapisi vardir: 1.for-loop, 2. while-loop, 3.do-while-loop, 4. for-each-loop
        //ONEMLI, burdan cok soru gelir.


        //****** for-loop***********\\

        // for(Starting Value; Loop Condition; Increment/Decrement);

        for( int i=1 ; i<6 ; i++ ){
            System.out.println("Hi");
        }


   //EX: 4 den 24'e kadar tum tam sayilari ayni satirda aralarina bosluk birakarak console'a yazdiriniz.

     for(int i=4 ; i<25; i++){
      System.out.print(i+" "); // arada bosluk olsun dedigi icin " " yaptik ve yanyana yazdir dedigi icin sout'dan "ln" yi kaldirdik.
                                    // 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
        }


        System.out.println();
   //EX: 33 den 11'e kadar tum cift tam sayilari ayni satirda aralarina bosluk birakarak console'a yazdiriniz.

    for(int i= 33; i>10; i--) {
    if (i % 2 == 0) {
    System.out.print(i + " "); //32 30 28 26 24 22 20 18 16 14 12

        }

    }

        System.out.println();
    //EX: 20 den 74 e kadar tum tek tam sayilari ayni satirda aralarina bosluk birakarak console'a yazdiriniz


        for(int i= 20; i<75; i++){
        if(i%2!=0) {
        System.out.print(i + " "); //21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73

            }
        }
        System.out.println();
    // Massachusetts kelimesindeki tum sesli harfleri  consola yazdiriniz.
        String s = "Massachusetts";
        for(int i = 0;i<s.length();i++){
         char c = s.charAt(i);
         if(c=='a'||c=='u'||c=='e'||c=='A'||c=='U'||c=='E'){
             System.out.print(c+"");
         }
        }



    }
}

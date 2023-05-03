package javaders.day13loops;

public class Loops02 {
    public static void main(String[] args) {

//EX: Verilen bir String'de kucuk harfleri console'a yazmayiniz
    //"Pwd12?Ab" ==> P12?A
    String s = "Pwd12?Ab";
    for(int i=0;i<s.length();i++){
    char ch = s.charAt(i);
    if(ch>='a'&& ch<='z') {
    continue;   // loop yaparken bazi elemanlari isleme sokmamak icin "continue" kullanilir. kucuk harfleri yazma islemine sokma demek.
    }else {
    System.out.print(ch);//P12?A
    }
    }
    //"break" ile "continue" arasindaki fark nedir?
    //"break" switch'in disina cikmak icin ve loop'u kirmak icin kullanilir.
    //"continue" ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir.

     System.out.println();// onceki sorunun cevabi ile sonraki sorunu cevabi yan yana yazilmasin diye bu sekilde bir sout ekliyoruz.
// EX: //Bir String'i tersceviren  kodu yaziniz
     //1.Way
     String s1 = "Java";
     String ters = "";// yeni bir data olusturacagimiz icin her zaman memory de yeni bir konteynir olustururuz.
     for (int i=s1.length()-1;i>=0; i--){
     ters= ters+ s1.substring(i,i+1);
     }
     System.out.println(ters);//avaJ / tersin en son hali bize lazim, loop bittikten sonra ki enson hali istedigimiz icin 'sout' loop'un disina yazdirilir.
        // icine yazdirsaydik, loop tamamlanana kadar ki tum asamalari bize verecekti,
        // biz son halini gorene dek tersin tum degerlerini bize yazdirmasini istemedigimiz icin loop'un disinda birakiyoruz.

     //2.Way
     String s2 = "Java";
     String ters1 = "";// yeni bir data olusturacagimiz icin her zaman memory de yeni bir konteynir olustururuz.
     for (int i=s2.length()-1;i>=0; i--) {
     ters1 = ters1 + s1.charAt(i);// burda farkli tip datalari concatination yaptigimizda javaya stres yapar. o yuzden sunstring yapmak daha uygundur.
     }
     System.out.println(ters1);//avaJ

//EX: bir tam sayinin rakamlarinin toplamini veren kodu yaziniz. int i = 951 / % kullanacagiz.
     int sun= 0;
     for(int i=951;i>0;i=i/10){
     sun= sun+i%10;
     }
     System.out.println(sun);//15

     //henagitfi pozitife cevirmek icin;

     int sun1 = 0;
     int n = -951;
     n = Math.abs(n);
     for(int i=n;i>0;i=i/10){
     sun+= i%10; //sun1= sun1+i%10; iki kez sun yazmamak icin sun+=i%10; yaziyoruz. java tekrari sevmez.
     }
     System.out.println(sun1);//15















    }
}

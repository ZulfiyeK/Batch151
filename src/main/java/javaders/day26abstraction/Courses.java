package javaders.day26abstraction;

/*

1. Bazen parent class'daki method'un body'si hicbir child class
   tarafindan kullanilmaz.
   Bu durumda parent'daki method'a body yazmak hic kullanilmadigi
   icin mantikli degildir. unused code(kullanilmayan kod)
   Biz de o method'a body yazmayiz.
2. Body'si yazilmayan method'a "Abstract Method" denir.
   Abstract Ingilizce'de "vucutsuz" veya "soyut" anlamindadir.
3. Method'un body'sini yazmayinca Java hata verir, biz de "abstract"
   keyword'unu kullanarak Java'ya bu method'un body'si olmayacak deriz.
4."abstract" keyword'unu kullaninca elde ettigimiz abstract method
   normal class'lara konulamaz, o yuzden class'i da "abstract" yapariz.
5. parent daki methos abstract ise butun child class lar o methodu override etmek zorundadir.
   bu yuzden tum child'lar icin mecburi olmasini istedigimiz fonksiyonlari
   abstract yapmak mantikli bir secimdir.
6. body'si olan methodlar abstract class'larin icine yazilabilir.
   bady'si olan metholara concrete Method denir.
   abstract methodlar concrete class'larin icine yazilamaz.
7. abstract keyword ile "method body" bir methodda ayni anda kullanilamaz.
   abstract'larin body'si olamaz. o zaman da tamamlanmamamis method olur. o zaman da yarin kalir.
   bu da hatali obje uretir. o yuzden abctract class larda obje uretilmez.
8. Abstract classların içinde abstract methodlar olur abstract methodlar bodysi olmadıgı için eksik methodlar olarak düşünülebiir
      Yani abstract class içinde eksik bir yapı barındırır siz abstract classdan obje üretirseniz abstract classın eksikliği objeye yansır
      Java bunu istemez çünkü eksik obje eksik iş yapar.
      Yanlış çalışmasına sebep olur
      Java aplicationu korumak için abstract classlardan obje üretilmesini engellemiştir
9. "abstract class"larin constructor'i vardir ama object oluşturamazlar.
10. "final methodlar" abstract yapilamaz.
11. "private methodlar" abstract yapilamaz.
12. abstract class"larin abstract child'i vve concrete class'i olabilir.

 */
/*
 1. "final" keyword'u aciklarmisiniz?
  "final" keyword'u variable'larda kullanildiginda;
       a. ona kesinlikle deger atamasi yapilmalidir.
       b. ilk atanan deger degistirilemez.
  method'larda kullanildiginda ;
      a.o methodun body'si degistirilemez.
      b. o method override edilemez.
  class'larda kullanildiginda;
      a. o class'in child class'i olamaz.
      b. final class'in kendisi child olabilir.
 */



public abstract class Courses {
    public abstract void math();
    public void art(){// bu conrete,somut bir methoddur. bunu child classlar ovirride etmek zorunda degildir.
        System.out.println("Study math");// bu yuzden hata vermez.
    }

    public abstract void science();


    }






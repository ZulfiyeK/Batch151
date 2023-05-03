package zlfy.mehmethocaday25polymorphism;//cok sekilli demek

public class Animal {

/*

1. Parent class'daki methodu child Class icinde ozellestirererk kullanmaya "Overriding" yapmak denir.
2. Overriding de methodun parantezine(Signature) ve methodun ismine dokunulmaz, ayni olmak zorundadir
3. Private methodlar Override edilemezler.
4. Child Classdaki methodun access modifier'i parent'tan daha dar olamaz.
5. Child classda override edilen method'un return type'i ile parent'daki method'un return type'i arasinda
   " IS A " iliskisi varsa return type degistirilebilir.
6. Method'un return type'i primitive ise overrideing yaparken primitive type degistirilemez.
   Cunku return typ ya ayni olur, ya da parent tan secilir.
   ama primitive'ler arasinda parent child iliskisi olmadigi icin parent mevzu bahis olamaz
   o zaman primitive'lere dokunamayiz.
7. Child da override edilen methodun return type'i ile
   parent'daki methodun return type'i arasinda IS A iliskisi yoksa return type degistirilemez.
   Mesela; Integer Wrapper class'i ile Long Wrapper class'i arasinda IS A iliskisi yoktur,
   bu yuzden return type degistirlemez.
8. Method'un return type'i void ise overriding yaparken return type degistiirlemez.
   IS A iliskisi varsa sadece degistirilebilir.
9. Statik methodlar herkes icin ortak oldugu icin degistirilemez.(gokteki ay gibi)
   Cunku methodlar tum child lar icin ortak methodlardir.
10.final methodlar override edilemezler. final methodlarin body si degistirilemez ama Override ederken
      method body i degistiririz bu bir celiskidir. Bu yuzden java final methodlarin override edilmesine musade etmez
               a) Final keyword unu Variable lar ile kullanabiliriz
                    i)final variable ise mutlaka deger atanmalıdır
                    ii) ilk atanan deger degistirilmez

               b) Final keyword unu Method lar ile kullanabiliriz
                    i)method final ise methodun body si degistirilemez
                    ii) methodun body si degistiriemeyince override yapmak mumkun olmaz

               c) Final keyword unu Class lar ile kullanabiliriz
                    => class final ise O classin child i olamaz, kisirlasmis olur.

final variable'a deger atamak zorundayiz, degismez degerler icin kullanilir(pi sayisi gibi)
final method'un method body'si degisitirilemez yani ovirride edilemez,
final class da, class'i kisirlastirmiz oluyoruz, o class'tan child olusturulamaz.

==> polimorphism= (methodlarla alakalidir.)Method Ovirloading ile Method Overriding in toplamindan ibarettir.

 */

    public void eat(){
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals drink");
    }

//overriding yaparak kodu kendimize uyarlayip eski kodu gecersiz kiliyoruz.

public Animal create(){
      return new Animal();
        }


    public int add (int a, int b){
        return a+b;
    }

    public void add( int a, String b, boolean c){

    }

    public Integer multiply (int a, int b){
        return a*b;
    }

}

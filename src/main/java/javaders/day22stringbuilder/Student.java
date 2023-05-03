package javaders.day22stringbuilder;

public class Student {




    public String stdname = "Ali Can";

    // access modifier'i default olan ile public olan Class member'lar, ayni pacjace icinde kullanildiklarinda
    // ayni ozellikleri gosterirler.
    // fakat farkli pacjace gectiklerinde , public olanlara ulasilabilir., default olanlara ulasilmaz.
    int age = 23;


    // access modifier'i "private" olan Class member lar sadece olusturulduklari Class icinden gorulebilirler.
    // olusturulduklari class'in disina ciktiklarinda gorulmez, ulasilmaz olurlar. Class'lar "private" olamaz.
    private String healtCondition = "Cancer";


    //access modifier'i "protected" olan Class memberlar' ayni pacjace icinde iken public gibi davranirlar.
 // farkli pacjace 'a gectigimizde "protected" olanlar sadece child class'lardan gorulebilirler.
    protected int salary = 3000;

// NOT: Class'lar "public" ve "default" olabilir ama "private" ve "protected" olamazlar.
}

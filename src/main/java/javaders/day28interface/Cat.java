package javaders.day28interface;

public class Cat implements Mamal{


    @Override
    public void eat() {

    }

    @Override
    public void drink() {


    }

    public static void main(String[] args) {
        System.out.println(Animal.age);//4
        System.out.println(feedBaby);//Milk
        System.out.println(age);//interface'lerde variable cagirirken, interface ismini yazmazsak,
        // once kendi class'ina bakar, yoksa parent'ina gider, yoksa bir ust parent'a gider,
        // nerede gorurse onu yazdirir.Bu hem "ststic" variable olmanin geregidir, hem de okunurlulugu artirir.
    }





}

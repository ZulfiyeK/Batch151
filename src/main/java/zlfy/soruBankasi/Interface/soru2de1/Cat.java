package zlfy.soruBankasi.Interface.soru2de1;

public class Cat implements Animal,Mamal {
    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(Animal.x);
        cat.eat();
    }

    @Override
    public void eat() {
        System.out.println("Cats like cheese");

    }

}

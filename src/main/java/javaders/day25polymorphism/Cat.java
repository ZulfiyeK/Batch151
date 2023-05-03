package javaders.day25polymorphism;

public class Cat extends Animal{
    @Override
    public void move() {// override'da methos ismi ve parametre degistirilmez.
        System.out.println("Cats move...");
    }


    @Override
    public int add(int a, int b) {// return type degistirilemez.
        return super.add(a, b);
    }

    @Override
    public Cat create() {// Cat yerine Animal da yazilabilir, Animal yerine Cat yazilabilir.
        return new Cat();  //zaten Cat 'de bir Animal'dir.
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return super.multiply(a, b);
    }






















}

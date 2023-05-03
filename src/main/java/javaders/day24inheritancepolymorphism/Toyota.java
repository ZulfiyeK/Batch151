package javaders.day24inheritancepolymorphism;

public class Toyota extends Car {
    public void hybrid() {
        System.out.println("Toyota uses hybrid engine...");
    }

// buraya baktigimizda car class'inin icindeki bilgileri goremeyiz ama onlari toyotada kullanabiliriz.buna default constructor denir.
//java default constructor'i object 'in icine koyar (parent class'ina )ama biz burada goremeyiz.
    public Toyota() {
        this("Prius");
        System.out.println("Toyota constructor 1");
    }
    public Toyota(String s) {/// bu contructor
        super(7);
        System.out.println("Toyota constructor 2");
    }
















}
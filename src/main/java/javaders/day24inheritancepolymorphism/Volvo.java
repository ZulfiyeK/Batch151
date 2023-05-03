package javaders.day24inheritancepolymorphism;

public class Volvo extends Car{
    public void secure(){
        System.out.println("Volvo is the most secure in the world...");
    }

    @Override//bu bir annotation, @Override kurallarini kontrol eder.
    public void move() {
        //super.move(); bunu kullanmamak icin override yaptik.parenttakini kullanmamak icin
        System.out.println("Volvo moves...");//bununla move methodunu overriding yaptik.sag tik generet overriding
    }
}

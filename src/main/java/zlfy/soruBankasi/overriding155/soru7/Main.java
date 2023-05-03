package zlfy.soruBankasi.overriding155.soru7;

public class Main {

    public static void main(String aga[]) {

        System.out.println("A");
        Shape c = new Circle();
        c.draw();//Circle
        c.paint();//Shape painted


        System.out.println("B");
        Shape t = new Shape();
        t.draw();//Shape
        t.paint();//Shape painted


        System.out.println("C");
        Shape t1 = new Shape();
        t1.draw();//Shape
        t1.paint();//Shape painted


    }


}

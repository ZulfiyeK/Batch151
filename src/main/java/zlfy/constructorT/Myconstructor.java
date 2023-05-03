package zlfy.constructorT;

public class Myconstructor {
    int x = 3;
    int y = 5;

    Myconstructor() {
        x=x+1;
        System.out.println("-x" + x);//-x4
    }

    Myconstructor(int i) {
        this.y = i;
        x=x+y;
        System.out.println("-x" + x);
    }

    Myconstructor(int i, int i2) {
        this(3);

        this.x = x-4;
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        Myconstructor mc1 = new Myconstructor(4, 3);

    }
}
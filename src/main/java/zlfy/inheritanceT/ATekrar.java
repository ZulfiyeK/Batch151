package zlfy.inheritanceT;

public class ATekrar extends BTekrar {

   public void m(){
     System.out.println("Well");   // ben ekledim, kapatirsam bad 12 oluyor.
    }                              //kendinde olmayacagi icin parent'a gidiyor.
                                   // Ama sout'u B dedigim icin oradan aliyor ve 12 oluyor.

    public static void main(String[] args) {
        BTekrar b = new BTekrar();
        b.m();
        System.out.println(b.x);//bad 12

        CTekrar c = new BTekrar();
        c.m();
        System.out.println(c.x);// bad 11

        CTekrar d = new CTekrar();
        d.m();
        System.out.println(d.x);// good 11

      BTekrar e = new ATekrar();
        e.m();
        System.out.println(e.x);// Well 12






















    }
}

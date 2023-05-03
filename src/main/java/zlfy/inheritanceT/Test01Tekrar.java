package zlfy.inheritanceT;

public class Test01Tekrar extends DerivedTekrar {

    public Test01Tekrar(String temp){
        super("Hoscakal");
        System.out.println(" Test class "+ temp);

    }

    public static void main(String[] args) {
        Test01Tekrar obj = new Test01Tekrar("Merhaba ");

    }











}

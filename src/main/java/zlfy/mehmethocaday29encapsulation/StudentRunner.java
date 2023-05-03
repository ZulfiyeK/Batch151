package zlfy.mehmethocaday29encapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student m1 = new Student();/// bir obje olusturup onun uzerinden bir cok yeni obje olusturabiliriz.
        m1.getStdId();
        System.out.println(m1.getStdId());//AC2023102T

        m1.getNotOrt();
        System.out.println(m1.getNotOrt());//3.53

        m1.isSuccesful();// bastaki "is" ilebasarili mi ? diye soruyor
        System.out.println(m1.isSuccesful());//false

        System.out.println("***********************************");


        m1.setStdId("AC2023103B");
        System.out.println(m1.getStdId());//AC2023103B

        m1.setNotOrt(3.95);
        System.out.println(m1.getNotOrt());//3.95

        m1.setSuccesful(true);
        System.out.println(m1.isSuccesful());//true

        System.out.println("***********************************");

        m1.setStdId("AC20231040");
        System.out.println(m1.getStdId());//AC2023103B

        m1.setNotOrt(4.10);
        System.out.println(m1.getNotOrt());//3.95

        m1.setSuccesful(true);
        System.out.println(m1.isSuccesful());//true

        System.out.println("***********************************");

        m1.setStdId("AC20231045");
        System.out.println(m1.getStdId());//AC2023103B

        m1.setNotOrt(4.50);
        System.out.println(m1.getNotOrt());//3.95

        m1.setSuccesful(true);
        System.out.println(m1.isSuccesful());//true
















    }
}

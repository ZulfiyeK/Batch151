package zlfy.constructorT;

public class StudentTekrar {

    String name= "Emilly";
    int age = 20;
    StudentTekrar(String name, int age) {
        this.name= name;
        this.age = 22;
    }

    public static void main(String[] args) {

        StudentTekrar st = new StudentTekrar("Oliver", 21);
        System.out.print(st.name);
        System.out.print("," + st.age);
    }

}

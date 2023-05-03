package introduction.day03scanner;

// javanin util kutuphanesinden Scanner Class import edildi.
import java.util.Scanner;
public class Scanner01 {

    public static void main(String[] args) {
        //1.adim: Scanner Class dan bir obje olurtur
        Scanner input = new Scanner(System.in);

        //obje ismini "input" yaptik, cunku bu obje kullanicidan alinan datayi benim kodlarimin icine koyacak.

        //2.adim: kullaniciya ne istediginize dair mesaj veriniz.
        System.out.println("lutfen yasinizi giriniz..");
       //3.adim: Uygun method'u kullanarak kullanicinin verdigi datayi memory'e yerlestiriniz.
        byte age = input.nextByte();
        System.out.println(age);


    }

}

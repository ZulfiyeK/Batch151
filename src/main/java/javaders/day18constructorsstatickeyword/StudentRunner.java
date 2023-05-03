package javaders.day18constructorsstatickeyword;

public class StudentRunner {
    public static void main(String[] args) {

// static olan "numOfRegisteredStd" variables'sini cagirmak icin sadece cclass ismini kullandik.
 // object olusturmadik
        System.out.println(Student.numOfRegisteredStd);

// static olmayan"num" variable'sini cagirmak icin object olusturduk.
        Student s1= new Student();
        System.out.println(s1.num);// num non-static==> buna s1 ile ulasilabilir.

// // static olan "numOfRegisteredStd" variable'ina object uzerinden de ulasabilirsiniz ama bu bir hatadir.

        System.out.println(s1.numOfRegisteredStd);











    }

}

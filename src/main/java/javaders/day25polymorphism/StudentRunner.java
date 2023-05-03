package javaders.day25polymorphism;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1= new Student();// bunu yazarak student classindan bir obje olusturduk. classlar kalip gibidir orada obje olusturulur. bu objede ID , gpa, succesful olacak,

        System.out.println(s1.getStId());//boylece id'ye ulasmis olduk.//AC2023102T

        System.out.println(s1.getGpa());//3.87// student 1'e git gpa yi oku. diyorum.

        System.out.println(s1.isSuccesful());///false

        s1.setGpa(4.0);
        System.out.println(s1.getGpa());//4.0- tum degisiklikler obje uzerinde olur, class'da degismez. kalip her obje olusturmada degismemelidir.
                                                  // get ve set methodu ile tum degisiklikler obje uzerinde yapilir. burada yaptigimiz da budur.



    }
}

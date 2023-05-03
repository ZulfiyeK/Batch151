package javaders.day25polymorphism;

public class Student {

   public String stName = " Mel Gibson";

   public int age = 35;

// OOP'nin ucuncusu "Encapsulation: kapsullemek demektir, data saklamak icindir. Diger adi " Data hiding" denir.
// Encapsulation yaptigimiz datayi istersek diger class'lardan okuyabiliriz.
// Nasil okuruz? "get method" olusturarak Encapsulation edilmis data'nin degerini okuyabiliriz.
// get methodlarda, okumak istedigimiz methodun return typ'e ne ise onu yazmak zorundayim.
// get methodlari hep public olur.
// get methodlarireturn type'i okudugu variablenin return type'i ile ayni 0lur.
// set methodlar hep public olur.
// set methodun return type'i hep void olur.
// set method parametre kullanir, parametrenin data type'i variable ile ayni olur.
// set methos kullanarak var olan object uzerinde degisiklikler  yaparak o objeyi sanki yeni objectmis gibi kullanabiliriz.
// get methodlarin diger adi getter, set methodlarin diger adi setter dir.



    //   Access modifier'ini "private" yaparak saklamis oluruz. Kimlik bilgileri, banka bilgileri gibi seyler korumali olmalidir.
    private String stId ="AC2023102T";
    private double gpa = 3.87;
    private boolean succesful= false;

    public String getStId() {// id'yi okumak icin public yapti, get ile onu getirip "return stid" nin icine koydu. bu sekilde gorebiliyoruz.
        return stId;
    }

    public double getGpa() {//sag tik, generate, getter yapip seciyoruz.
        return gpa;
    }

    public boolean isSuccesful() {//Encapsulation yapilan variable'nin data type'i
        return succesful;         // "boolean" ise get method ismi "is" ile baslar.
    }
   // Encapsulation yaptigimiz datayi istersek diger classlardan degistirebiliriz.
    //nasil degistirebiliriz? "set method olustusrarak Encapsulation edilmis datanin dgerini degistirebiliriz.


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccesful(boolean succesful) {// parametrelerin data type'leri aynidir.
        this.succesful = succesful;
    }
}

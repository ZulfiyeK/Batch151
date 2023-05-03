package javaders.day20arraylistsdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {


        // LocalDate ile icinde bulundugumuz zaman diliminde ki tarihi nasil aliriz.
        LocalDate myCurrentData = LocalDate.now();
        System.out.println(myCurrentData);//2023-03-15 / internet kapali bile olsa bu kod calisir.

        // getMonthValue ile tarihten istedigimiz bileseni nail aliriz.
        int monthValue = myCurrentData.getMonthValue();
        System.out.println(monthValue);//3

        //yili bize veriri
        int yearValue = myCurrentData.getYear();
        System.out.println(yearValue);//2023

        // aynin gununu veriri
        int dayValue= myCurrentData.getDayOfMonth();
        System.out.println(dayValue);//15

        //ayin adini yazdirir
        Month monthName = myCurrentData.getMonth();
        System.out.println(monthName);//MARCH- enum'lar buyuk harfle yazilir.

        //5 gun sonraya gitmek icin
        System.out.println(myCurrentData.plusDays(5));//2023-03-20/ bu gunden 5 gun sonrasini verdi

        // iki ay sonrasina gitmek icin
        System.out.println(myCurrentData.plusMonths(2));//2023-05-15


        System.out.println(myCurrentData.plusYears(4));//2023-05-15

        System.out.println(myCurrentData.minusYears(4).minusMonths(2).minusDays(18));//2018-12-28

        int lengthOfMonth = myCurrentData.lengthOfMonth();
        System.out.println(lengthOfMonth);//31


        // Specific bir tarih objesi nasil olusturulur.
        LocalDate zulDog = LocalDate.of(1986,10,30);
        LocalDate ozlDog = LocalDate.of(1983,6,3);

        // bir tarihin diger bir tarihten sonra olup olmadigi nasil kontrol edilir.
        boolean d1 = zulDog.isAfter(ozlDog);
        System.out.println(d1);//true

        // bir tarihin diger bir tarihten once olup olmadigi nasil kontrol edilir.
        boolean d2 = ozlDog.isBefore(zulDog);
        System.out.println(d2);//true

        // bir tarihin diger bir tarihe esit olup olmadigi nasil kontrol edilir.
        boolean d3 = zulDog.isEqual(ozlDog);
        System.out.println(d3);//false


  //Programlama dillerinde sabit degerler Enum'larin icine depolanir. Enum sabit degerleri depolamak icin kullanilan bir yapidir.
 //Asagidaki "Month" bir Enum'dir.
//Enum Java'da sabit degerleri (Ay isimleri, Gun isimleri, Ulkedeki sehir isimleri,Samanyolu Galaksisindeki gezegen isimleri)
//depolamak icin kullanilir. Applicayion'lar Stand Alone olmalidir, kendi kendine ayakta durabilmelidir.

// kullanicidan aldiginiz tarih gecmise ait ise " Gecersiz tarih girdiniz" mesaji veriniz.
//kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" mesaji veriniz.

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter year, month and day numbers in order.");
        int year = input.nextInt();
        int month =  input.nextInt();
        int day =  input.nextInt();
        LocalDate givenDate = LocalDate.of(year, month, day);

       if(givenDate.isBefore((LocalDate.now()))) {
           System.out.println(givenDate+ " invalid day");//11.2.2023 icin
       }else{
           System.out.println("enter time for the ticket");// 8.4.2023 icin


       }



 //  Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.

        System.out.println(" Please enter year, month and day numbers in order.");
        int year1 = input.nextInt();
        int month1 =  input.nextInt();
        int day1 =  input.nextInt();

        LocalDate givenDate1 = LocalDate.of(year1, month1, day1);

        System.out.println(givenDate1.getDayOfWeek());//THURSDAY 30.10.1986 icin


    }
}

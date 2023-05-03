package javaders.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

    // Anlik zamanin nasil aliriz.

       LocalTime myCurrentTime= LocalTime.now();

       System.out.println(myCurrentTime);//21:04:10.623723700- herkes kendi bilgisayarindaki saati gosterir.en sondaki uzun rakam nanosaniyedir.

    // Anlik zamanda bilesenler nasil aliriz.
        int hour =  myCurrentTime.getHour();
        System.out.println(hour);//21-- sadece saat i yazdirir


        int minute =  myCurrentTime.getMinute();
        System.out.println(minute);//7-- dakikasini yazdi


        int second =  myCurrentTime.getSecond();
        System.out.println(second);//44-- saniyesini yazdirdi

        int nano =  myCurrentTime.getNano();
        System.out.println(nano);//91995000-- nano saniye


        LocalTime next =  myCurrentTime.plusMinutes(23);
        System.out.println(next);//21:34:01.126922900--23 dakika ekledik

        //gelecek ve gecmis zaman gitme
        LocalTime next1 =  myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next1);//21:35:24.460295200--- 23 dk ileri' 11 saniye geri gittik


        //zaman formati nasil degisirirlir.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");// buyuk H kullaninca 24'luk saat sistemi kullanir. kucuk h 12 lik saat sistemini kullanir.
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm a");

        String formatlanmiszaman = dtf1.format(myCurrentTime);
        System.out.println(formatlanmiszaman);//21:20---saati nasil gormek istiyorsak onu yazdiririz.

        String formatlanmiszaman1 = dtf2.format(myCurrentTime);
        System.out.println(formatlanmiszaman1);//09:25 ÖS-- ogleden sonra , bilgisayar dili ingilizce olursa 'am' ve 'pm' yazar

        /*
        1. Zaman formati nasil degistirilir?
        2. "HH" 24'luk saat sistemini, "hh" 12'lik saat sistemini kullanir.
        3. "hh:mm a" ifadesindeki " a" 12 lik saat sisteminde "AM", "PM" yazilmasini saglar
        4. "ss" saniyeyi gosterir.
        5. "mm" "minute" demektir. "MM" "month" demektir.

         */


        // Date formati nasil degistirilir.
        LocalDate myCurrentDate =LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);//2022-08-25

        //tarihi ay gun yil olarak yazma
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MM/dd/yyy");// kucuk m minut' buyuk M month dur.
        String formatlitarih = dtf3.format(myCurrentDate);
        System.out.println(formatlitarih);//08/25/2022

        //Tarihi Gun/ay isminin ilk uc harfi/ Yil seklinde yazalim
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formatlitarih2 = dtf4.format(myCurrentDate);
        System.out.println(formatlitarih2);//25/Ağu/22

        //Tarihi Gun/ay ismini/ Yil seklinde yazalim
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formatlitarih3 = dtf5.format(myCurrentDate);
        System.out.println(formatlitarih3);//25/Ağustos/2022


        // Baska bir zaman dilimindeki Tarih ve Zamani nasil aliriz (lokasyona gore zaman ayarlama)
        //Tokyo'da suan ayin kaci?

        LocalDate DateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(DateInTokyo);//2023-03-17

        LocalDate DateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(DateInTashkent);//2023-03-16

        //Tokyoda saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//03:47:21.896190

        // Perth de saat kac?
        LocalTime timeInPerth = LocalTime.now(ZoneId.of("Australia/Perth"));
        System.out.println(timeInPerth);//02:50:09.371013500






















    }
}

package javaders.day21datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2023-03-16T22:03:59.121422700-- T den sonrasi saat

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M/dd/yyyy - hh:mm a");
        String formatliTarih = dtf1.format(ldt);
        System.out.println(formatliTarih);//3/16/2023 - 10:08 ÖS


    }
}

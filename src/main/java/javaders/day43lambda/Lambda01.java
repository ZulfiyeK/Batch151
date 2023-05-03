package javaders.day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        Course turkishDay = new Course("Turkish Daytime QA", 213,"Spring", 97);
        Course turkishNigth = new Course("Turkish Nigthtime QA", 245,"Winter", 98);
        Course englishDay = new Course("English Daytime Java Dev", 121,"Winter", 91);
        Course englishNight = new Course("English  Nigthtime Java Dev", 137,"Winter", 95);

        List<Course> courseList = new ArrayList<>();
        courseList.add(turkishDay);
        courseList.add(turkishNigth);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(asAvgScoreGreaterThanANumber(courseList,90));//true
        System.out.println(isAnyCourNameContainsQa(courseList, "QA"));//true
        System.out.println(getCourseNameWhoseAvgMax(courseList));//Turkish Nigthtime QA
        System.out.println(getCourseBetterThanLastTwo(courseList));//[Course{courseName='Turkish Daytime QA', numOfStudents=213, season='Spring', averageScore=97.0},
                                                                // Course{courseName='Turkish Nigthtime QA', numOfStudents=245, season='Winter', averageScore=98.0}]
        System.out.println(getcourseWhoseRegisteredStdLessThanANumber(courseList,150));//[Course{courseName='English Daytime Java Dev', numOfStudents=121, season='Winter', averageScore=91.0},
                                                                                                // Course{courseName='English  Nigthtime Java Dev', numOfStudents=137, season='Winter', averageScore=95.0}]


    }


    //EX1: Tum avarage sporlarin 90'dan buyuk olup olmadigini kontrol eden methodu olusturunuz.

    public static boolean asAvgScoreGreaterThanANumber(List<Course> courseList, int avg){

       return courseList.
               stream().//turkishday ile ilgili hersey burada olacak.
               allMatch(t-> t.getAverageScore()>avg);// burada score'lar karsilastirilir. buyukse true, degilse false verir.

    }

    //Ex 2: en az bir kurs isminin QA icerip icermedigini konrol eden method'u olusturunuz.
    public static boolean isAnyCourNameContainsQa(List<Course> courseList, String word){
        return courseList.stream().anyMatch(t-> t.getCourseName().contains(word));
    }


    //Ex3: En yuksek avarage score'a sahip kurs ismini veren kodu yaziniz.
    public static String getCourseNameWhoseAvgMax(List<Course>courseList){
     return courseList.
                stream().//kursun bilgileri olacak
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).//sorted ile tersten siraladi, reversed ile de listeyi tersten siraladik.
                findFirst().// ilki aldi
                get().getCourseName();
    }


    //Ex 4 Avarage score'u en dusuk olan ilk iki course disindaki tum kurslari return eden methosu olusturunuz.

    public static List<Course> getCourseBetterThanLastTwo(List<Course> courseList){
        return courseList.stream().
                sorted(Comparator.comparing(Course::getAverageScore)).//tersten siraladi
                skip(2).// en dusuk iki taneyi atladi
                collect(Collectors.toList());//list icinde yazdirdi.

    }



    //EX 5: Avarage score'u ustten ucuncu olan kursu veren methodu olusturunuz.
    public static Course getHighestThird(List<Course>courseList){
       return courseList.
               stream().
               sorted(Comparator.comparing(Course::getAverageScore).
                       reversed()).//siralama
               skip(2).//ustten ucuncu dedigi icin 2 taneyi atlatip 3.yu seciyoruz
               limit(1).// iki taneyi atlayip 3. yu versin diye
               collect(Collectors.toList()).//listin icine koyuyor
               get(0);//listin icinde istemedigim icin ve tek deger yazdiracagimiz icin get(0) dedik

    }


    //EX 6 : Ogrenci sayisi 150 den az olan kurslari return eden methodu'u olusturunuz.

    public static List<Course> getcourseWhoseRegisteredStdLessThanANumber(List<Course>courseList, int numOfStd){
        return courseList.stream().filter(t-> t.getNumOfStudents()<numOfStd).collect(Collectors.toList());
    }






}

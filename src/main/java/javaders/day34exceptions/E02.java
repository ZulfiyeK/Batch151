package javaders.day34exceptions;

import java.util.Enumeration;

public class E02 {
    public static void main(String[] args) {

        String a[] = {"A", "V", "A", "J"};
        System.out.println(getelement(a, 3));
        System.out.println(getelement(a, 1));
        System.out.println(getelement(a, 4));
        System.out.println(getelement(a, 2));
        System.out.println(getelement(a, 6));// 6 olmadigi icin hata verecek-ArrayIndexOutOfBoundsException-- olmayan indeks ile ilgili hata


    }

    // Bir String array'dan istenilen bir elemani eleman sirasi ile alan method olusturunuz.
    public static String getelement(String a[], int numOfElement) {

        //  return a[numOfElement-1];

//2. yol

        String result = "";

        try {
            result = a[numOfElement - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            if (numOfElement - 1 < 0) {
                result = a[0];
            } else {
                result = a[a.length - 1];

            }
        }
        return result;



}}

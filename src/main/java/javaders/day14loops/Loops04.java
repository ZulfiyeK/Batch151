package javaders.day14loops;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {


  // kullanici user name ve password'u girsin, uc kereden fazla yanlis girerse "Hesabiniz bloke olmustur, Your accaunt was bloked" mesaji alsin.
 // 3 kereye kadar yanlis girerse "tekrar deneyiniz , Please tray again "mesaji alsin. Dogru girerse "Hos geldiniz, Welcame to your accaunt" mesaji alsin.


        Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUserName = "techpro123";
        String validPassWord = "Education12?";

        do{
            if(counter==3){
                System.out.println("Your account was blocked");
                break;
            }
            System.out.println("Please enter your username");
            String userName = input.next();

            System.out.println("Please enter your password");
            String passWord = input.next();

            counter++;

            if(userName.equals(validUserName) && passWord.equals(validPassWord)){
                System.out.println("Welcome to your account");
                break;
            }else{
                System.out.println("Invalid username or password");
                System.out.println((3-counter) + " right left");
            }
        }while(true);

























    }
}

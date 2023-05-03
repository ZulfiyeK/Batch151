package javaders.day37exceptionsennums;

public class IllegalAgeException extends RuntimeException {
    //Runtime'a extend edersek Run time exception olur.
    //Exception'a extend edersek Compile Time olur.

 /*
 1. Eger run Time Exception uretmk istiyorsak RunTimeException Class'a extend etmeliyiz.
  */

    public IllegalAgeException(){// bunu kullanirsak konsola mesaj yazdirmayi dusunmuyoruz demek.bos cunku
        super();
    }
    public IllegalAgeException(String message){
        super(message);
    }

}

package javaders.day37exceptionsennums;

public class IllegalGradeException extends Exception{
    //benim exception classim "Exceptin Class'indaki" butun ozellikleri kullanabilsin diye Exception'a child yapiyorum.


   //Constructor hangi class ise o classin objesi olur, olusturulan objenin Exception olmasini istedigim icin objeyi oradan olustur diyoruz.
 /*
   1.Custom Exception Class olusturmak icin Exception Class'a extend etmelitiz. (biz olusturuyorsak "Custom" olur.)
      Exception Class'a extend olusturdugumuz Custom Exception "Compile Time Exception" olur.

   2.Custom Exception Class olusturmak icin "Constructor" olusturmaliyiz. bu Constructor parent'daki contructoru cagirmalidir.
      bu Constructor mesaj verecek veya vermeyecek sekilde olmalidir.

   3.Custom Exception Class olusturdugumuzda ismin sonunda Exception kelimesini kullanmaliyiz.
     IllegalGradeException'da oldugu gibi.




  */
    public IllegalGradeException(String message){// mesaj vermek istiyorsak bu sekilde yazariz.
        super(message);
    }
    public IllegalGradeException(){// mesaj vermesini istemiyorsak bos olustururuz.
        super();
    }


















}

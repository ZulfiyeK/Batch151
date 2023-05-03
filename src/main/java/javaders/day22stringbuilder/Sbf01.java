package javaders.day22stringbuilder;

public class Sbf01 {
    public static void main(String[] args) {

/*
    1. StringBuffer java'da String ureten bir class'dir.
    2. StringBuffer, StrinBuilder'e cok benzer. yani ikisi de "mutable" String uretir.
    3. StringBuffer milti-thread'dir (Coklu is yapilabilir)ama "StringBuilder" (coklu ise uygun degildir) degildir.
            {whatsaap ta telefonla gorusurken, resim video vs atabiliriz, resim cekebiliriz,
             konusma esnasinda gelen aramayi gorebiliriz, alarma varsa otebilir,
             ayni anda birden fazla is yapilabilir.}

    4. Java, StringBuffer'i StringBuilder'den once uretmistir.
    5. StringBuilder milti-thread olmadigi icin StringBuffer'dan daha hizli calisir.
    6. multi-thread yapilirken yapilan islerin sirasi onem arz eder, yapilan islerin mantikli bir siraya koymak "synchronization"
       olarak adlandirilir. StringBuffer "multi-thread" oldugu icin ayni zamanda  "synchronization" dir.

      *******************************************************

        3 tane String olusturan Class ogrendik.

         1. Eger immutable String kullanacaksak String Class, mutable kullanacak isek iki ihtimal var;
             a. Stringbuilder
                 * multi-thread gerekli degilse kullaniriz.
             b. StringBuffer
                 * multi-thread gerekli ise kullaniriz.
                 * senkronizedir.



 */


        StringBuffer str = new StringBuffer("Java");



























    }
}

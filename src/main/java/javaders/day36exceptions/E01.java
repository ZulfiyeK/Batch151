package javaders.day36exceptions;


import java.io.FileInputStream;

import java.io.IOException;

public class E01 {

        /*
 1. Run butonuna bastiktan sonra consol'da alinan Exception'lara Runtime Exception, run ettikten sonra gelen exception'a run time exception'dur.
    -Arithmetic Exception
    -NullPointerException
    -NumberFormatException
    -ArrayIndexOfBoundsException
    -StringIndexOfBoundsException
   Runtime Exception'lara "Unchecked Exception" da denir.

 2. Code yazarken kirmizi alt cizgi seklinde alinan Exception'lara Compile Time Exception denir.
    compile = kodlarin sifir ve bir'e donmesi, kod yazarken olusan hatalar compile time exception'dur.
      -FileNotFounException(Dosya bulunamadi hatasi): Javaya bir dosya bul dedigimizde,
                                                      Java "dosyanin adresi" ve "dosyanin varligi" konusunda hata olusursa
                                                      ne yapmasi gerektigini soylemenizi ister.

      -IOException : input-output demektir(IO). input : application'a data sokmak demektir. out : disina yolla demek.
                                                        IOException, FileNotFounException'nin parent'idir. Hatalarda child ustte olmaliydi.
                                                        parent altta olmali.



      "Compile time Exception'lara "Checked Exception" da denir.

     3. Java da hatalar 2'ye ayrilir.
      - Exception'lar: cozumu var, handle edilebilir.
      - Error'lar : cozumu yok, asla handle edilemez.
            - StackOverflow Error(memory dolmasi)(Stack memory dolmasi)
            - Our Of memory Error(heap memory dolmasi)
            - Virtual Machine Error(java icindeki sanal makina arizasi)


         */


    public static void main(String[] args) throws IOException {

        //1.Way: Exception'i mathod signature satirina ekledik
        FileInputStream fis = new FileInputStream("src/main/java/javaSuleymanhoca/day36exceptions/TextFile");// bu adresteki file'yi bul

        int i = 0;

        while((i = fis.read())!=-1){//read() karakterlerin ASCII degerini veriri. onu i'nin icine koyacak.
            System.out.print((char)i);
        }

    }



}

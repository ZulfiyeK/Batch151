package javaders.day33maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        //HashMap arkasinda calissan mekanizma nasil calisir?--onemli

        //Java Hashing Tecnic kullanarak herbir "entry" icin "HashCode" uretir ve bu kodu 16'ya boler.
        //bolumden kalan kalan sayi'nin bulundugu index'e gider ve icine sirayla "HashCode", "key" ve "value" u koyar.
       //ayni indekste bulunan farkli datalar bir birine baglidir, tipki LinkedList'lerde ki "node" da bulunan Pointer gibi.
        //ayni indeksta bulunan farkli datalar( key veya value )uzerinden arama yaptigimizda bu hash kodu ile bulur ve o kod uzerinden islem yapar.
        //ancak bu 16 bucket doldugunda yeni bir 16 bucket veriri. bu sefer 32'ye bolmeye baslar.

                HashMap<String, String> capitals = new HashMap<>();// hemen memory de 16 tane Bucket acar.
        capitals.put("USA", "Washington");
        capitals.put("Italy", "Roma");
        capitals.put("Turkey", "Ankara");
        capitals.put("USA", "Istanbul");



    }
}

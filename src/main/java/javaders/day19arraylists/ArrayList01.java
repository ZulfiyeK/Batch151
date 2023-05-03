package javaders.day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    /*

    1. Ayni data tipindeki coklu datalari depolamak icin array kullaniriz.
    2. Array'lerin negatif bir yonu var; icine koyacaginiz eleman sayisini en basta belikrlemek zorundayiz.(esnek degildir)
    3. Array'ler eleman sayisinda esnek degildirler, bu yuzden Java "ArrayList" adli bir yapi olusturdu
        bu yapi eleman sayisinda esnektir.Hic eleman koymazsaniz sifir olarak ayarlar, 1000 eleman koyarssaniz
        sayisini 1000 olarak ayarlar.
    4."ArrayList" yerine sadece "List" de diyebiliriz.
    5. Java ArrayList'leri olusturduktan sonra Array'leri iptal etmedi cunku;
            - Array'ler super hizlidir
            - memory'de cok az yer kaplar
    6. Array'ler "primitive data type"'leri ve "reference"lari depolayabilir. Ama "ArrayList" ler "non-primitive data type"lerini da depolar
       bu yuzden "ArrayList" ler Array'lerden daha cok yer kaplar.


     */


    public static void main(String[] args) {

        //"ArrayList" nasil olusturulur.
        ArrayList<Integer> ages = new ArrayList<>();

        // "ArrayList" nasil yazdirilir.
        System.out.println(ages);//[]

        // "ArrayList" e eleman nasil eklenir.
        //1. yol****************
        ages.add(12);                 // objeyi kullanarak ulastigim yontemler non-statictir.
        ages.add(24);
        ages.add(9);

        System.out.println(ages);//[12, 24, 9] eklenen yeni elemanlari giris sirasina(insertion order) gore dizer

        //2. yol******************
        ages.add(1, 99);// [12,99, 24, 9] indekse gore yerlstriem yapar, indeks 1'e 99 koymak isriyorum.


        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);
        //3. add.All( )
        ages.addAll(price);
        System.out.println(ages);//[12,99, 24, 9, 23,33] addAll() bir list'i diger list'in icine yerlestirir.


        //4. All( index,  )
        ages.addAll(3, price);
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 23, 33] addAll() bir list'i diger list'in icine istedigimiz yere yerlestirir. index'i secmeliyiz.


        //5. "ArrayList" te eleman sayisi nasil bulunur.
        int numOfElement = ages.size();
        System.out.println(numOfElement);// 8 tane- [12, 99, 24, 23, 33, 9, 23, 33]


        //6. "ArrayList" te spicific bir eleman nasil alinir. get() methodu ile indeks nosu girerek istedigimiz elemani yazdirir.
        int el1 = ages.get(3);
        System.out.println(el1);//23- 3.cu indeks'te 23 oldugu icin

        //7. "ArrayList" te spicific bir eleman nasil degistirilir.
        ages.set(6, 111);
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 111, 33] - 23 yerine 111 yazdirdi


        //8. "ArrayList" te spicific bir eleman var mi?
        boolean r1 = ages.contains(99);
        System.out.println(r1);// true cevirir- 199 deseydik false verir.

        //9. "ArrayList" te eleman var mi yok mu, bos mu dolu mu ?
        boolean r2 = ages.isEmpty();
        System.out.println(r2);// false - cunku eleman var.

        //9. "ArrayList" teki tum  elemanlari nasil sileriz ?
        ages.clear();
        System.out.println(ages);//[]

        boolean r3 = ages.isEmpty();
        System.out.println(r3);// true


 ArrayList<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");

        //1.Way:
        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

        //2.Way: Recommended
        if(names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

    }

    }





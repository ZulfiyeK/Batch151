package javaders.day17multidimensionalarraypassbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {


    /*
        Method olusturmak icin asagidaki 5 adimi takip ediniz.
        1)Access Modifier
        2) Return Type
        3) Method ismi
        4)Method Parantezi
        6) Methodun body'si

        NOTE: main methodun icindeki tum methodlar static olmalidir, yoksa hata verir.
              bir methodu static yapmak icin accsess modifier ile return type arasina static yazmak yeterlidir.

        Pass by Value
        1. Java pass by value kulanir.
        2. Yani; java methodlarin orjinal degeri degistirmesine musaade etmez.
        3. Java methodlara deger yollarken orjinal degerin kopyasini olusturur ve o kopayayi method'a yollar.
           Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur.
        4. java esnek bir programlama dilidir. istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz.

        Pass by Reference:
        1. pass by reference da method'a reference yollanir.
        2.reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir.
        Bu yuzden " C# " gibi pass by reference kullanan yazilim dillerinde method
variable nin orijinal  degerini degistirir,


    */
        int shirtPrice= 200;
        System.out.println(discount("student", shirtPrice));//180
        System.out.println(shirtPrice); //200 -Java orjinal degeri korur ve shirtPrice icine kopyalanmis fiyati "200'u" verir.
                                         // bu yuzden methodu kullanirken orjinal degeri goruruz.

         shirtPrice = discount("veteran", shirtPrice);//160
        System.out.println(shirtPrice);//

    }
    //Discont methodu olusturunuz
    public static int discount(String type,int price){
    switch (type){

        case"student":
            price = price-20;
            break;
        case"veteran":
            price = price-40;
            break;
        case"senior":
            price = price-30;
            break;
    }
    return price;
    }


}

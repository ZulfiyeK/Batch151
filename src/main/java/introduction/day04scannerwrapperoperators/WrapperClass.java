package introduction.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {



    //primitive data type: char, boolean, byte, short, int,     long, float, double
    //Wrapper Class : Character, Boolean, Byte, Short, Integer, Long, Float, Double
    // Wrapper Class'lar non-primitive'dir. Memory'de cok yer kapladiklari icin sart degilse
    //kullanmayi tercih etmeyiz. Ancak boyle bir imkanin varligindan haberdar olmaliyiz.

    /*
        tum primitive'ler boylece non-primitive'e donmus olur. ancak bunlar cok yer kapladigi icin cok tercih edilmez.
     */

    int n = 12;
    Integer m = 12;

    byte p = 13;
    Byte r = 13;

//Ornek 1 : Short data type'nin minimum ve maximum degerlerini kod yazarak bulunuz.
       short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);



//Ornek 2: int data type'nin minimum degeri ile byte data type'nin maksimum degerlerinin toplamini bulunuz.

        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);



       // Ornek 3: Primitive int'i Wrapper Integer'a ceviriniz.
        int num= 13;
        Integer wrapperNum = num;
        // primitive
        ////primitive yani method bulunmayan bir kutudaki degeri alarak icinde bazi
        // methodlar bulunan wrapper kutuya atama yaparsak bu isleme aoutoboxing denir.




        // Wrapper byte' i primitive byte'a ceviriniz.
        Byte k = 33;
        byte primitiveK = k;

//Wrapper bir kutu icinde bazi methot'larla birlikte bulunan degeri alarak primitive
// yani method bulunmayan bir kutuya atama yaparsak bu isleme unboxing denir.

        //ornek 4 : Primitive char'i Wrapper Character'e ceviriniz. (Autoboxing)

        char initial= 'T';
        Character initialWrapper = initial;

        //Wrapper Boolean'i primitive boolean'a ceviriniz.(Unboxing)

        Boolean isOld = true;
        boolean isOldprimitive= isOld;












    }




}
package practices.day11;

public class C04_Constructor {
    // marka, model, yil, yakit  seklinde dort tane instance variable olusturalım.
    // Bu variable'lara parametreli constructor kullanarak,
    // farli bir class'dan deger ataması yapınız ve yazdırınız

    String marka;
    String model;
    int yil;
    String yakit;


    //runner class'inda obje olusturduk ve parantezinin icine tum variable'leri girdik.
    //asagidaki contructoru olusturdu ve bizde variable'lere atama yaptik ve runner class'inda
    //obje ismi ile cagirdik ve yazdirdik.
    public C04_Constructor(String marka, String model, int yil, String yakit) {//parametreli contructor olusturduk

        this.marka = marka;
        this.model = model;
        this.yil= yil;
        this.yakit = yakit;



    }



}

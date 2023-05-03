package javaders.day28interface;

public interface Animal {
/*
    public abstract void eat();// public abstract biliyoruz ki bu ikisi zaten var, yazsak da yazmasak da
    // bunu kendisi var olarak kabul ediyor. o yuzden yazmaya gerek yok.

*/
    void eat();
    void drink();

    int age= 4; // 1.interface'deki tum variable'ler otomatik olarak "final" dir.
                //   bu yuzden interface icinde variable olusturduktan sonra
                //   mutlaka deger atamasi yapmak zorundayiz ve "final" oldugu icin atanan deger degistirilemez.
                // 2.ayrica tum variable'lerin Access Modifier'i de "public"tir, yazmaya gerek yoktur.
                // 3.ayrica tum variable'lerin Access Modifier'i de "static"tir, static olmasinin sebebi, interface de obje olusturalamaz,
                //   ulasabilsin diye bunu otomatik olarak static kabul eder.






}

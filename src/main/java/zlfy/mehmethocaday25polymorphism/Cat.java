package zlfy.mehmethocaday25polymorphism;

public class Cat extends Animal{

    public void meow(){
        System.out.println("Cats meow");
    }
    @Override// override Annotation ,override kurallarini java tarafindan kontrol edilmesini saglar
    public void eat(){
        //Child daki ovirride adilmis eat() methoda "Overriding Method" denir.
        //parent daki overrride edilmis eat() methoda "Overriden Method" denir.
        System.out.println("Cats eat");
    }
    @Override
    public void drink(){
        System.out.println("Animals drink");//super.drink(); silip yerine kendimiz yaziyoruz.
    }

    @Override
    public Cat create() { //public Animal create() {--normalde boyle, ama " IS A " iliskisi sayesinde bunu degistirebiliriz.
       return new Cat(); // return super.create();-- normalde boyledir, biz bunu degistiriyoruz.
    }

   // her class, urettigi objenin kalibidir, urettigi her objenin de data type'dir. '


    @Override
    public int add(int a, int b) { // primitive'ler Class olmadigi icin aralarinda child class iliskisi yoktur,
        return super.add(a, b);
    }

    @Override
    public Integer multiply(int a, int b) {
        return super.multiply(a, b);
    }
}

package zlfy.mehmethocaday26Polymorphism;

public class Honda extends Car{
    public Honda (){
        super();
        System.out.println("Honda1");//Honda1
        System.out.println(this.model);//this= bu classtaki model demek-civic
        System.out.println(super.km);//parent'a git oradaki km'yi yazdir.-20000
    }

    public String model= "civic";// bu variable
    public int km = 10000;// variable

//this==> kendi class'indan
//super==> parent class'indan variable yada method cagirmayi sagliyor


}

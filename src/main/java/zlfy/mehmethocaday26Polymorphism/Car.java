package zlfy.mehmethocaday26Polymorphism;

public class Car extends Vehicle {
    public Car(){
        this("make");//parametresi String olan controctur'u sec demek,// yeri degismez, her zaman ilk satirda olmali
        System.out.println("Car 1");
    }

    public Car (String make){
        super();// yeri degismez, her zaman ilk satirda olmali
        System.out.println("Car String parametreli");
    }

    public String model= "car model";// bu variable
    public int km = 20000;

}

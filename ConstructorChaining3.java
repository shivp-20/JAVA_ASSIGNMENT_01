class Vehicle{
    protected String type;
    public Vehicle(String type){
        this.type=type;
        System.out.println("Vehicle constructor called");
        System.out.println("Type : "+type);
    }
}
class FourWheeler extends Vehicle{
    String brand;
    public FourWheeler(String type,String brand){
        super(type);
        this.brand=brand;
        System.out.println("Fourwheeler constructor called");
        System.out.println(" brand : "+ brand);
    }
}
class Car extends FourWheeler{
    String model;
    int price;
    public Car(String type,String brand,String model,int price){
        super(type,brand);
        this.model=model;
        this.price=price;
        System.out.println("Car constructor called");
        System.out.println("model : "+model+" price : "+ price);
    }
}
public class ConstructorChaining3 {
    public static void main(String[] args) {
        Car car = new Car("car", "bmw", "x56", 1500000);
    }
    
}

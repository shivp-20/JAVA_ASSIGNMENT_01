class Car{
    private String brand;
    private String model;
    private int price;

    //constructor
    public Car(String brand){
        this.brand =brand;
        System.out.println("brand: "+ brand);

    }
    public Car(String brand, String model){
       // this(brand);
        this.model = model;
        System.out.println("brand: "+ brand + " model: " + model);
    }
    public Car(String brand, String model,int price){
        this(brand,model);
        this.price = price;
        System.out.println("brand: " + brand+ " model: " + model + "price : "+ price);
    }

     public void details(){
        System.out.println("brand: " + brand+ " model: " + model+ "price : "+ price);
    }
    
}
public class ConstructorChaining1 {
    public static void main(String[] args) {
        Car c1= new Car("Maruti");
        Car c2 = new Car("honda", "civic");
        Car c3 = new Car("BMW", "x5", 10000);

        c3.details();

    }
    
}

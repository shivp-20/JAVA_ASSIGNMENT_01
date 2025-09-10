class Order{
    public int orderId;
    public String customerName;
    public int totalAmount;

    public Order(int orderId){
        this.orderId=orderId;
        System.out.println("first constructor called.");
        System.out.println("OrderId : " + orderId+" Customer name : "+customerName+" Total Amount: "+ totalAmount);
    }
    public Order(int orderId, String customerName){
        this(orderId);
        this.customerName=customerName;
        System.out.println("Second constructor called.");
        System.out.println("OrderId : " + orderId+" Customer name : "+customerName);
    }

    public Order(int orderId, String customerName,int totalAmount){
        this(orderId,customerName);
        this.totalAmount=totalAmount;
        System.out.println("third constructor called.");
        System.out.println("OrderId : " + orderId+" Customer name : "+customerName+"Total Amount : "+totalAmount);
    }
}

public class ConstructorChaining4 {
    public static void main(String[] args) {
        Order order = new Order(1022, "Atharva", 1400000);
    }
    

}

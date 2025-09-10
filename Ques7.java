import java.util.Scanner;

class Area{
    double length;
    double breadth;

    //constructor 
    public Area(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea(){
        return length*breadth;
    }
}
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length :");
        double length = sc.nextDouble();

        System.out.println("Enter breadth :");
        double breadth = sc.nextDouble();


        Area rectangle = new Area(length,breadth);

        System.out.println("Area of rectangle : " + rectangle.returnArea());
    }
    
}

import java.util.Scanner;

class Area {
    private double length, breadth;

    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    public double getArea() {
        return (length * breadth);
    }
}

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area rectangle = new Area();

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        rectangle.setDim(length, breadth);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }

}

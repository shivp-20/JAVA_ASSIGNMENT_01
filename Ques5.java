class Rectangle{
    double a,b;

    public Rectangle(double a , double b ){
       this.a = a;
       this.b = b;
    }
    public double  getArea(){
          return a*b;
    }
}

public class Ques5{
    public static void main(String[] args) {
        Rectangle  r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);

        System.out.println("Area of R1 : " +  r1.getArea());
        System.out.println("Area of R2 : " + r2.getArea());
    }

}
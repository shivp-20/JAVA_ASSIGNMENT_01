class Triangle{
    int a;
    int b ;
    int c ;
    //constructor
    public Triangle(int a, int b, int c){
      this.a=a;
      this.b=b;
      this.c=c;
    }

    //get method
    public int  getPerimeter(){
         return a+b+c;
    }

    public double getArea(){
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);

        System.out.println("Perimeter : "+ triangle.getPerimeter());
        System.out.println("Area of Triangle : " + triangle.getArea());

    }
    
}


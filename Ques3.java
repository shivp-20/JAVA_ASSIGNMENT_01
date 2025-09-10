class Triangle{
    int a;
    int b ;
    int c ;
    //constructor
    public Triangle(){
        a = 3;
        b = 4;
        c = 5;
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

public class Ques3 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println("Perimeter : "+ triangle.getPerimeter());
        System.out.println("Area of Triangle : " + triangle.getArea());

    }
    
}

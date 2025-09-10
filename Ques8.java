import java.util.Scanner;

class Average{
    double a,b,c;

    //method 
    public double returnAverage(double a , double b , double c){
        return ((a+b+c)/3);
    }
}

public class Ques8 {
    public static void main(String[] args) {
        Average average = new Average();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        double a = sc.nextDouble();

        System.out.println("Enter second number : ");
        double b = sc.nextDouble();

        System.out.println("Enter third number : ");
        double c = sc.nextDouble();
        System.out.println("Average of 3's numbers : " + average.returnAverage(a,b,c) );
    }
    
}

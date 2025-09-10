import java.util.Scanner;

class Complex {
    private double real;
    private double imag;

    // Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imag * other.imag;
        double imagPart = this.real * other.imag + this.imag * other.real;
        return new Complex(realPart, imagPart);
    }

    // Method to display the complex number
    public void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + Math.abs(imag) + "i");
    }
}

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first complex number
        System.out.println("Enter first complex number:");
        System.out.print("Real part: ");
        double r1 = sc.nextDouble();
        System.out.print("Imaginary part: ");
        double i1 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);

        // Input second complex number
        System.out.println("\nEnter second complex number:");
        System.out.print("Real part: ");
        double r2 = sc.nextDouble();
        System.out.print("Imaginary part: ");
        double i2 = sc.nextDouble();
        Complex c2 = new Complex(r2, i2);

        // Perform operations
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        // Display results
        System.out.println("\nSum:");
        sum.display();

        System.out.println("Difference:");
        diff.display();

        System.out.println("Product:");
        prod.display();

        sc.close();
    }
}


class Complex{
    private double realPart;
    private double imaginaryPart;

    // Default constructor: initializes to (0, 0)
    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    // Constructor with parameters
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Add method
    public Complex add(Complex otherNumber) {
        double real = this.realPart + otherNumber.realPart;
        double imag = this.imaginaryPart + otherNumber.imaginaryPart;
        return new Complex(real, imag);
    }

    // Subtract method
    public Complex subtract(Complex otherNumber) {
        double real = this.realPart - otherNumber.realPart;
        double imag = this.imaginaryPart - otherNumber.imaginaryPart;
        return new Complex(real, imag);
    }

    // Multiply method
    public Complex multiply(Complex otherNumber) {
        double real = this.realPart * otherNumber.realPart - this.imaginaryPart * otherNumber.imaginaryPart;
        double imag = this.realPart * otherNumber.imaginaryPart + this.imaginaryPart * otherNumber.realPart;
        return new Complex(real, imag);
    }

    // Divide method
    public Complex divide(Complex otherNumber) {
        double denominator = otherNumber.realPart * otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero complex number");
        }
        double real = (this.realPart * otherNumber.realPart + this.imaginaryPart * otherNumber.imaginaryPart) / denominator;
        double imag = (this.imaginaryPart * otherNumber.realPart - this.realPart * otherNumber.imaginaryPart) / denominator;
        return new Complex(real, imag);
    }

    // Setters
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    // Getters
    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    // toString method
    @Override
    public String toString() {
        String sign = (imaginaryPart >= 0) ? "+" : "-";
        return String.format("(%.2f %s %.2fi)", realPart, sign, Math.abs(imaginaryPart));
    }
}
public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(4.5, 2.0);
        Complex c2 = new Complex(1.5, -3.0);

        System.out.println("First Complex Number: " + c1);
        System.out.println("Second Complex Number: " + c2);

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);
        Complex quot = c1.divide(c2);

        System.out.println("\nSum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);

        // Testing setters and getters
        c1.setRealPart(10.0);
        c1.setImaginaryPart(5.0);
        System.out.println("\nUpdated First Complex Number: " + c1);
        System.out.println("Real Part: " + c1.getRealPart());
        System.out.println("Imaginary Part: " + c1.getImaginaryPart());
    }

    
}

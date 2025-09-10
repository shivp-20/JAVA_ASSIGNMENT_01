class Matrix {
    private int rows;
    private int cols;
    private int[][] elements;

    // Constructor to initialize rows, columns, and 2D array
    public Matrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive.");
        }
        this.rows = rows;
        this.cols = cols;
        this.elements = new int[rows][cols];
    }

    // 1. Get number of rows
    public int getRows() {
        return rows;
    }

    // 2. Get number of columns
    public int getCols() {
        return cols;
    }

    // 3. Set element at position (i, j)
    public void setElement(int i, int j, int value) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            throw new IndexOutOfBoundsException("Invalid index for matrix element.");
        }
        elements[i][j] = value;
    }

    // 4. Add two matrices
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

    // 5. Multiply two matrices
    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }

        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.elements[i][j] += this.elements[i][k] * other.elements[k][j];
                }
            }
        }
        return result;
    }

    // Utility method to display matrix
    public void display() {
        for (int[] row : elements) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
public class MatrixDemo{
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);

        m1.setElement(0, 0, 1);
        m1.setElement(0, 1, 2);
        m1.setElement(1, 0, 3);
        m1.setElement(1, 1, 4);

        m2.setElement(0, 0, 5);
        m2.setElement(0, 1, 6);
        m2.setElement(1, 0, 7);
        m2.setElement(1, 1, 8);

        System.out.println("Matrix 1:");
        m1.display();

        System.out.println("Matrix 2:");
        m2.display();

        Matrix sum = m1.add(m2);
        if (sum != null) {
            System.out.println("Sum:");
            sum.display();
        }

        Matrix product = m1.multiply(m2);
        if (product != null) {
            System.out.println("Product:");
            product.display();
        }
    }
}

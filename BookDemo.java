class Author {
    private String firstName;
    private String lastName;

    // Constructor
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // toString method
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
class Book {
    private String title;
    private Author author;
    private double price;

    // Constructor
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // toString method
    @Override
    public String toString() {
        return "Book Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
    }
}
public class BookDemo {
    public static void main(String[] args) {
        Author author = new Author("Russel", "Winder");
        Book book = new Book("Developing Java Software", author, 79.75);

        System.out.println(book.toString());
    }

    
}

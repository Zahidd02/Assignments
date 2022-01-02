package Aggregation_Assignment_2;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;

    public Book(String name, Author a1, double price, int quantity) {
        this.name = name;
        this.author = a1;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayAuthorDetails() {
        System.out.println("Displaying author Details");
        System.out.println("Author name: " + author.getName());
        System.out.println("Author email: " + author.getEmailId());
        System.out.println("Author gender: " + author.getGender());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }  
}

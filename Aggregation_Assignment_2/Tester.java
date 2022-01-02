package Aggregation_Assignment_2;

class Tester {
    public static void main(String[] args) {
        Author author1 = new Author("Zarina", "zarinkhan3065@gmail.com", 'F');
        Book book1 = new Book("Effective Java", author1, 45, 15);
        book1.displayAuthorDetails();
    }
}
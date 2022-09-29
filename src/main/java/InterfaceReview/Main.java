package InterfaceReview;

public class Main {
    public static void main(String[] args) {
        Product book = new Book();
        System.out.println(book.setPrice(9.99));
        book.setPrice(9.99);
    }
}

package AbstractionReview;

public class MainAbstract {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.00,3.00);//cannot do =new Shape here because Shape is an abstract class and cannot be instantiated.
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}

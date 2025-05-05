package labtuan5;
public class Bai03 {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "blue", true);
        Rectangle rectangle = new Rectangle(4, 6, "green", false);
        Square square = new Square(3, "yellow", true);

        System.out.println("Thong tin hinh tron:");
        System.out.println(circle);

        System.out.println("\nThong tin hinh chu nhat:");
        System.out.println(rectangle);

        System.out.println("\nThong tin hinh vuong:");
        System.out.println(square);

        System.out.println("\nKiem tra equals:");
        System.out.println("Rectangle co bang Square khong? " + rectangle.equals(square));
        System.out.println("Rectangle va Square co bang nhau khong? " + rectangle.equals(square));
    }
}

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perhitungan Luas Lingkaran
        System.out.println("Perhitungan Luas Lingkaran");
        System.out.println("=========================");

        // Masukan warna
        System.out.print("Masukan warna lingkaran: ");
        String colorCircle = scanner.nextLine();

        // Masukan radius
        System.out.print("Masukan radius lingkaran: ");
        double radius = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        // Hitung luas lingkaran
        Circle circle = new Circle(colorCircle, radius);
        System.out.println("Luas Lingkaran: " + circle.getArea());

        // Perhitungan Luas Persegi Panjang
        System.out.println("Perhitungan Luas Persegi Panjang");
        System.out.println("=========================");

        // Masukan warna
        System.out.print("Masukan warna persegi panjang: ");
        String colorRectangle = scanner.nextLine();

        // Masukan panjang
        System.out.print("Masukan panjang persegi panjang: ");
        double length = scanner.nextDouble();

        // Masukan lebar
        System.out.print("Masukan lebar persegi panjang: ");
        double width = scanner.nextDouble();

        // Hitung luas persegi panjang
        Rectangle rectangle = new Rectangle(colorRectangle, length, width);
        System.out.println("Luas persegi Panjang: " + rectangle.getArea());

        scanner.close();
    }
}

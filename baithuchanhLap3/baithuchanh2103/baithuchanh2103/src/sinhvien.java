import java.util.Scanner;

public class sinhvien {
    Scanner scanner = new Scanner(System.in);
    String name;
    String nganh;
    int nien_khoa;
    String class_name;

    // Nhap
    void Nhap() {
        System.out.print("Nhap Ho va Ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap Nganh: ");
        nganh = scanner.nextLine();
        System.out.print("Nhap nien khoa: ");
        nien_khoa = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap Lop: ");
        class_name = scanner.nextLine();
    }

    void In() {
        System.out.print("\nLop: " + class_name);
        System.out.print("\nHo va Ten: " + name);
        System.out.print("\nNganh: " + nganh);
        System.out.print("\nNien khoa: " + nien_khoa);
    }
}
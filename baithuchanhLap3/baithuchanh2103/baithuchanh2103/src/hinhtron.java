import java.util.Scanner;

public class hinhtron {
    Scanner scanner = new Scanner(System.in);
    final float PI = 3.14f;
    float ban_kinh;
    float chu_vi;
    float dien_tich;

    public static void main(String[] args) {
    }

    // Ban Kinh
    void NhapBanKinh() {
        System.out.print("Nhap ban kinh r: ");
        ban_kinh = scanner.nextFloat();
    }

    // Chu vi
    void Tinh() {
        chu_vi = 2 * PI * ban_kinh;
        dien_tich = PI * (ban_kinh * ban_kinh);
    }

    void In() {
        System.out.printf("\nChu vi hinh tron la: %s", chu_vi);

        System.out.printf("\nDien tich hinh tron la: %s", dien_tich);
    }
}
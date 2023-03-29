import java.util.Scanner;

public class hinhchunhat {
    Scanner sc = new Scanner(System.in);
    float a, b;
    float chuvi;
    float dientich;

    public static void main(String[] args) {
    }

    void nhap() {
        System.out.print("nhap chieu dai");
        a = sc.nextFloat();
        System.out.print("nhap chieu rong");
        b = sc.nextFloat();
    }

    void tinh() {
        chuvi = (a + b) * 2;
        dientich = a * b;
    }

    void in() {
        System.out.printf("chu vi hinh chu nhat la:%s", chuvi);
        System.out.printf("dien tich hinh chu nhat la:%s", dientich);
    }
}

import java.util.Scanner;

public class hinhtru {
    Scanner sc = new Scanner(System.in);
    final float PI = 3.14f;
    float ban_kinh;
    float dien_tich_xung_quanh;
    float dien_tich_toan_phan;
    float chieu_cao;
    float the_tich;

    public static void main(String[] args) throws Exception {
    }

    void nhap() {
        System.out.print("nhap ban kinh: ");
        ban_kinh = sc.nextFloat();
        System.out.print("nhap chieu cao: ");
        chieu_cao = sc.nextFloat();
    }

    void tinh() {
        dien_tich_xung_quanh = 2 * PI * ban_kinh * chieu_cao;
        the_tich = PI * ban_kinh * ban_kinh * chieu_cao;
        dien_tich_toan_phan = dien_tich_xung_quanh + 2 * PI * ban_kinh * ban_kinh;
    }

    void in() {
        System.out.printf("dien tich xung quanh cua hinh tru la:%s ", dien_tich_xung_quanh);
        System.out.printf("dien tich toan phan cua hinh tru la:%s ", dien_tich_toan_phan);
        System.out.printf("the tich hinh tru la:%s ", the_tich);
    }
}

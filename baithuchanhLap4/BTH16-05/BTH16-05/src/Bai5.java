import java.util.Scanner;

public class Bai5 {
    Scanner sc = new Scanner(System.in);
    int masinhvien;
    String fullname;
    String lop;

    public void nhapthongtin() {
        System.out.print("ma sinh vien: ");
        masinhvien = sc.nextInt();
        System.out.print("fullname: ");
        fullname = sc.nextLine();
        System.out.print("lop: ");
        lop = sc.nextLine();
    }

    public void hienthi() {
        System.out.print("masinhvien : " + masinhvien);
        System.out.print("fullname : " + fullname);
        System.out.print("lop : " + lop);
    }
}

package QLDB;

import java.util.ArrayList;
import java.util.Scanner;

public class tensdt {
    private String ten, sdt, thongTin, ketQua;
    static int n;
    static ArrayList<String> arrNhanVien = new ArrayList<>(2);
    static Scanner scanner = new Scanner(System.in);

    public void nhapThongTin() {

        for (int i = 0; i < 2; i++) {

            System.out.println("Nhap ten : ");
            ten = scanner.nextLine();
            System.out.println("Nhap so dien thoai : ");
            sdt = scanner.nextLine();
            thongTin = ten + "\t" + sdt;
            arrNhanVien.add(thongTin);
        }
    }

    public String timTheoTen(String ten) {
        String[] thongTinNV = thongTin.split("\t");
        if (thongTinNV[0].equals(ten)) {
            ketQua = "Co ten " + ten + "\n so dien thoai " + sdt;
        } else {
            ketQua = "Khong ten " + ten;
        }
        return ketQua;
    }
}

package QLDB;

import java.util.Scanner;
import java.util.ArrayList;

public class tim extends tensdt {
    public static void main(String[] args) {
        tensdt tim = new tensdt();
        tim.nhapThongTin();
        System.out.println("Nhập tên cần tìm: ");
        String tenCanTim = scanner.nextLine();
        String kQ = tim.timTheoTen(tenCanTim);
        System.out.println(kQ);
    }
}

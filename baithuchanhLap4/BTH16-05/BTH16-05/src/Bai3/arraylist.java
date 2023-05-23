package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> stdList = new ArrayList<>();
        student std = new student();
        System.out.println("Nhap vao so luong sinh vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            student stdent = new student();
            System.out.println("Nhap sinh vien thu " + (i + 1) + ":");
            stdent.NhapThongTin();
            if (stdent.fullname.isEmpty())
                break;
            stdList.add(stdent);
        }
        std.HienThiThongTin(stdList);
        std.Dem(stdList);
        std.HienThiDiemCao(stdList);
        std.TimKiem(stdList);
    }
}

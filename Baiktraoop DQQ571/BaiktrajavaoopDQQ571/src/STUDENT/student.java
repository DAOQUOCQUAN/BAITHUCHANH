package STUDENT;

import java.util.Scanner;
import java.util.List;
import java.util.Scanner;

public class student {
    public String fullname;
    public int age;
    public String lop;
    Scanner sc = new Scanner(System.in);

    public void nhapthongtin() {
        System.out.print("fullname = ");
        fullname = sc.nextLine();
        Scanner scn = new Scanner(System.in);
        System.out.print("age =");
        age = scn.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.print("lop = ");
        lop = scanner.nextLine();
    }

    public void hienthithongtin(List<student> stdList) {
        for (int i = 0; i < stdList.size(); i++) {
            System.out.println(stdList.get(i).fullname);
            System.out.println(stdList.get(i).age);
            System.out.println(stdList.get(i).lop);
        }
    }

    public void SuaThongTin(List<student> stdList) {
        System.out.println("Nhap stt muon chinh sua");
        int stt = sc.nextInt();
        student std = new student();
        for (int i = 0; i < stdList.size(); i++) {
            if (i + 1 == stt) {
                std.nhapthongtin();
                stdList.set(i, std);
                std.hienthithongtin(stdList);
            }
        }
    }

    public void XoaThongTin(List<student> stdList) {
        System.out.println("Nhap stt muon chinh xoa");
        int stt = sc.nextInt();
        student std = new student();
        for (int i = 0; i < stdList.size(); i++) {
            if (i + 1 == stt) {
                std.nhapthongtin();
                stdList.remove(i);
                std.hienthithongtin(stdList);
            }
        }
    }

    public void themthongtin(List<student> stdList, int n) {
        System.out.print("thong tin them :");
        for (int i = 0; i < n; i++) {
            student std = new student();
            std.nhapthongtin();
            stdList.add(std);
        }

    }

}

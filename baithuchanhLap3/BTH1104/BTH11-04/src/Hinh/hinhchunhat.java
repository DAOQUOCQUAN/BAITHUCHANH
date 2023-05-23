package Hinh;

import java.util.Scanner;

public class hinhchunhat extends hinhhoc {
    public float chieudai;
    public float chieurong;

    public static void main(String[] args) {
    }

    public void xuatten() {
        ten = "hinh chu nhat";
    }

    public void nhapchieudai() {
        System.out.print("chieu dai =");
        Scanner sc = new Scanner(System.in);
        chieudai = sc.nextFloat();
    }

    public void nhapchieurong() {
        System.out.print("chieu rong =");
        Scanner sc = new Scanner(System.in);
        chieurong = sc.nextFloat();
    }

    public void tinhchuvi() {
        chuvi = (chieudai + chieurong) * 2;
    }

    public void tinhdientich() {
        dientich = chieudai * chieurong;
    }

    public void inchuvi() {
        System.out.printf("chu vi hinh chu nhat =%f", chuvi);
    }

    public void indientich() {
        System.out.printf("dien tich hinh chu nhat =%f", dientich);
    }
}

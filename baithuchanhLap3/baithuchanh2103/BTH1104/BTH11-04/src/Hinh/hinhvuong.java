package Hinh;

import java.util.Scanner;

public class hinhvuong extends hinhchunhat {
    public static void main(String[] args) {
    }

    public void xuatten() {
        ten = "hinh vuong";
    }

    public void nhapcanh() {
        System.out.print("canh hinh vuong =");
        Scanner sc = new Scanner(System.in);
        chieudai = chieurong = sc.nextFloat();
    }

    public void tinhchuvi() {
        chuvi = chieudai * 4;
    }

    public void tinhdientich() {
        dientich = chieudai * chieudai;
    }

    public void inchuvi() {
        System.out.printf("chu vi hinh vuong =%f", chuvi);
    }

    public void indientich() {
        System.out.printf("dien tich hinh vuong =%f", dientich);
    }
}

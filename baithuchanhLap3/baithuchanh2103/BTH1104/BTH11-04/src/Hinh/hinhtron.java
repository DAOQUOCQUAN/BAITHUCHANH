package Hinh;

import java.util.Scanner;

public class hinhtron extends hinhhoc {
    public float bankinh;

    public static void main(String[] args) {
    }

    public hinhtron() {
        ten = "hinh tron";
    }

    public void nhapbankinh() {
        System.out.print("ban kinh =");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }

    public void tinhchuvi() {
        chuvi = 2 * pi * bankinh;
    }

    public void tinhdientich() {
        dientich = pi * bankinh * bankinh;
    }

    public void inchuvi() {
        System.out.printf("chu vi = %f", chuvi);
    }

    public void indientich() {
        System.out.printf("dien tich =%f", dientich);
    }
}

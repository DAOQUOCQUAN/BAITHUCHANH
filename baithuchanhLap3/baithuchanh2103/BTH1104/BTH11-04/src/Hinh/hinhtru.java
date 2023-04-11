package Hinh;

import java.util.Scanner;

public class hinhtru extends hinhtron {
    public float chieucao;

    public static void main(String[] args) {
    }

    public hinhtru() {
        ten = "hinh tru";
    }

    public void nhapchieucao() {
        nhapbankinh();
        System.out.print("chieu cao =");
        Scanner sc = new Scanner(System.in);
        chieucao = sc.nextFloat();
    }

    public void tinhthetich() {
        tinhdientich();
        thetich = dientich * chieucao;
    }

    public void inthetich() {
        System.out.printf("the tich hinh tru = %f", thetich);
    }
}

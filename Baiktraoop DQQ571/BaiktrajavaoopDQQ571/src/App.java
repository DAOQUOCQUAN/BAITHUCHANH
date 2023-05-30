import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import STUDENT.student;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<student> stdlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        student std = new student();
        System.out.print("so hoc sinh can nhap la :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            std.nhapthongtin();
            std.hienthithongtin(stdlist);
        }
        std.hienthithongtin(stdlist);
        std.SuaThongTin(stdlist);
        std.XoaThongTin(stdlist);
        std.themthongtin(stdlist, 1);
        std.hienthithongtin(stdlist);
    }
}

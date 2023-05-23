package HINH;

public class hinhchunhat {
    public static float chieudai;
    public float chieurong;
    public float chuvihcn;
    public float dientichhcn;

    public hinhchunhat(float chieudai, float chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public void tinhchuvi() {
        chuvihcn = (chieudai + chieurong) * 2;
    }

    public void tinhdientich() {
        dientichhcn = chieudai * chieurong;
    }

    public float getCHUVIHCN() {
        return chuvihcn;
    }

    public float getDIENTICHHCN() {
        return dientichhcn;
    }

    public void inchuvi() {
        System.out.printf("\n chu vi hinh chu nhat = %f", chuvihcn);
    }

    public void indientich() {
        System.out.printf("\n dien tich hinh chu nhat = %f", dientichhcn);
    }
}

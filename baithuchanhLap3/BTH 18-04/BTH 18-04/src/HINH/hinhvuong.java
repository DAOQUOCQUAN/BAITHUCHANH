package HINH;

public class hinhvuong extends hinhchunhat {
    public float canh;

    public hinhvuong(float canh) {
        super(chieudai, canh);
        this.canh = canh;
    }

    public float chuvi;
    public float dientich;

    public void tinhchuvi() {
        chuvi = canh * 4;
    }

    public void tinhdientich() {
        dientich = canh * canh;
    }

    public float getCHUVI() {
        return chuvi;
    }

    public float getDIENTICH() {
        return dientich;
    }

    public void inchuvi() {
        System.out.printf("\n chu vi hinh vuong = %f", chuvi);
    }

    public void indientich() {
        System.out.printf("\n dien tich hinh vuong =%f", dientich);
    }

}

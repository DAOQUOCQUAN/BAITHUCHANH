package HINH;

public class hinhtron {
    private final float pi = 3.14f;
    private float bankinh;
    private static float chuvi;
    private static float dientich;

    public hinhtron(float bankinh) {
        this.bankinh = bankinh;
    }

    public void tinhchuvi() {
        chuvi = 2 * pi * bankinh;
    }

    public void tinhdientich() {
        dientich = pi * bankinh * bankinh;
    }

    public static float getCHUVI() {
        return chuvi;
    }

    public static float getDIENTICH() {
        return dientich;
    }

    public void inchuvi() {
        System.out.printf("chu vi hinh tron = %f", chuvi);
    }

    public void indientich() {
        System.out.printf("\n dien tich hinh tron =%f", dientich);
    }
}

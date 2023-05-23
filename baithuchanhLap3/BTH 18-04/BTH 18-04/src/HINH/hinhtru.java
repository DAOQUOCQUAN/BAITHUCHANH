package HINH;

public class hinhtru extends hinhtron {
    public float chieucao;

    public hinhtru(float chieucao) {
        super(chieucao);
        this.chieucao = chieucao;
    }

    public float thetich;

    public float getTHETICH() {
        return thetich;
    }

    public void tinhthetich() {
        thetich = getDIENTICH() * chieucao;
    }

    public void inthetich() {
        System.out.printf("\n the tich hinh tru = %f", thetich);
    }
}

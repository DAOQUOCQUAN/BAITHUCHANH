package HINH;

public class main {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        hinhtron ht = new hinhtron(10);
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
        hinhtru htru = new hinhtru(10);
        htru.tinhthetich();
        htru.inthetich();
        hinhchunhat hcn = new hinhchunhat(5, 3);
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();
        hinhvuong hv = new hinhvuong(6);
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
    }
}

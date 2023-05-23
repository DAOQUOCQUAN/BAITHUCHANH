package main;

import Hinh.hinhtron;
import Hinh.hinhchunhat;
import Hinh.hinhvuong;
import Hinh.hinhtru;

public class main {

    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
        ht.xuatten();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
        hinhtru htru = new hinhtru();
        htru.xuatten();
        htru.nhapchieucao();
        htru.tinhthetich();
        htru.inthetich();
        hinhchunhat hcn = new hinhchunhat();
        hcn.xuatten();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();
        hinhvuong hv = new hinhvuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
    }
}

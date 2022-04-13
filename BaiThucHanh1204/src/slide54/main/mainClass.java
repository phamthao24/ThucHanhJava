package main;
import shape.hinhChuNhat;
import shape.hinhTron;
import shape.hinhTru;
import shape.hinhVuong;

public class mainClass{
    public static void main(String[]args)
    {
        //thu nghiem voi lop hinh tron
        hinhTron ht=new hinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();

        //hinh tru
        hinhTru htru = new hinhTru();
        htru.xuatTen();
        htru.nhapChieuCao();
        htru.tinhTheTich();
        htru.inTheTich();

        //hinh chu nhat
        hinhChuNhat hcn=new hinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();

        //hinh vuong
        hinhVuong hv = new hinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();

       
    }
}
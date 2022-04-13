package slide75;
import slide75.hinhChuNhat;
import slide75.hinhTron;
import slide75.hinhHoc;

public class mainClass {
    public static void main(String[] args) {

        hinhHoc hinhHoc = new hinhHoc();
        hinhTron hinhTron1 = new hinhTron();
        hinhTron hinhTron2 = new hinhTron();
        hinhChuNhat hinhChuNhat = new hinhChuNhat();

        System.out.println("Có tất cả " + hinhHoc.dem + " hình trong ứng dụng trên ");
    }
}

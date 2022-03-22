import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.NhapChieuDaiRong();
        hcn.tinhchuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();
    }
}
    class HinhChuNhat{
        //thuộc tính
        float dai,rong, chuVi, dienTich;
        //phương thức
        void NhapChieuDaiRong()
        {
            System.out.print("nhap chieu dai : ");
            Scanner sc = new Scanner (System.in);
            dai= sc.nextFloat();
            System.out.print("nhap chieu rong: ");
            rong= sc.nextFloat();
        }

        void tinhchuVi()
        {
            chuVi= 2*(dai+rong);
        }

        void tinhDienTich()
        {
            dienTich = dai*rong;
        }

        void inChuVi()
        {
            System.out.println("chu vi hcn: "+chuVi);
        }

        void inDienTich()
        {
            System.out.println("diện tích hcn: "+ dienTich);
        }
    }


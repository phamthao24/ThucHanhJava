import java.util.Scanner;
public class AppSlide16 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        HinhTron ht = new HinhTron();
        ht.NhapBanKinh();
        ht.tinhchuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();
    }
}
    class HinhTron{
        //thuộc tính
        float pi=3.14f, banKinh, chuVi, dienTich;
        //phương thức
        void NhapBanKinh()
        {
            System.out.print("nhập bán kính: ");
            Scanner sc = new Scanner (System.in);
            banKinh= sc.nextFloat();

        }

        void tinhchuVi()
        {
            chuVi= 2* pi * banKinh;
        }

        void tinhDienTich()
        {
            dienTich = pi * banKinh * banKinh;
        }

        void inChuVi()
        {
            System.out.println("chu vi hình tròn: "+chuVi);
        }

        void inDienTich()
        {
            System.out.println("diện tích hình tròn: "+ dienTich);
        }
    }


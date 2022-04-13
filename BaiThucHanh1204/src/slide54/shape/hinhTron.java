package shape;
import java.util.Scanner;

public class hinhTron extends HinhHoc{
    public float banKinh;

    //constructor
    public hinhTron(){
        ten="hinh tron";
    }
    public void nhapBanKinh(){
        System.out.println("ban kinh:");
        Scanner sc=new Scanner(System.in);
        banKinh =sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi=2*pi*banKinh;
    }
    public void tinhDienTich(){
        dienTich = banKinh * banKinh * pi;
    }

    
}
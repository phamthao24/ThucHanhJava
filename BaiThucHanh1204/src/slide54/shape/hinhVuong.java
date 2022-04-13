package shape;
import java.util.Scanner;
public class hinhVuong extends hinhChuNhat{
    //constructor
    public hinhVuong(){
        ten="hinh vuong";

    }
    public void nhapCanh(){
        System.out.println("canh: ");
        Scanner sc=new Scanner(System.in);
        dai = rong =sc.nextFloat();
    }
}

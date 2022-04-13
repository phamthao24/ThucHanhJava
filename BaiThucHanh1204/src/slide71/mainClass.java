package slide71;
import slide71.hinhTron;
import slide71.toaDo;

public class mainClass {
    public static void main (String[]args){
        hinhTron ht = new hinhTron();
        ht.setBanKinh(10);
        float chuVi=ht.tinhChuVi();
        float dienTich= ht.tinhDienTich();
        System.out.println("chu vi hinh trong: "+chuVi+"\ndien tich hinh tron: "+ dienTich);
    }
}

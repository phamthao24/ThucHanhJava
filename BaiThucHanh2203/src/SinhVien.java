
import java.sql.Date;
import java.util.Scanner;
public  class SinhVien{
        //thuộc tính
       String maSV,hoTen,diaChi;
       Boolean gioiTinh;
       Date ngaySinh;
        //phương thức
        void Nhap()
        {
            System.out.println("nhap vao ma SV, ho ten,dia chi , gioi tinh, ngay sinh: ");
            Scanner sc = new Scanner (System.in);
           maSV= sc.nextLine();
            hoTen = sc.nextLine();
            diaChi= sc.nextLine();
            gioiTinh= sc.nextBoolean();
           
        }
        void In()
        {
            System.out.print("ma SV: "+maSV+"\tho ten: "+hoTen+"\tdiachi: "+diaChi+"\tgioi tinh: "+gioiTinh);
        } 
        
    }


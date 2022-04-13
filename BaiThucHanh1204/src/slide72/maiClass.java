package slide72;

import slide72.sinhVien;

public class maiClass {
  public static void main(String[]args){  
    sinhVien sv1=new sinhVien();
    sinhVien sv2=new sinhVien();

    sv1.setTen("");
    sv1.setTuoi(23);

    sv1.setTen("Peter");
    sv1.setTuoi(17);

    System.out.println("ten sinh vien 1: "+sv1.getTen() + "tuoi: "+sv1.getTuoi());
    System.out.println("ten sinh vien 2: "+sv2.getTen() + "tuoi: "+sv2.getTuoi());
}
}
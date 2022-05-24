import java.util.Scanner;
import java.util.ArrayList;

public class app110{
    public static void main(String[] args) {
        ArrayList<Integer> arrL = new ArrayList<>();
        //nhap so lg phtu
        System.out.print("nhap so luong phtu: ");
        Scanner sc= new Scanner(System.in);
        int soLuongPhtu = sc.nextInt();
        // nhap gtri phtu
        int gtri;
        for(int i=0;i<soLuongPhtu;i++)
        {
            System.out.print("phtu thu "+ (i+1) + ":");
            gtri= sc.nextInt();
            arrL.add(gtri);
        }

        //in ra cac phtu
        System.out.println("cac phtu vua nhap: "+ arrL);

        //tim so co gtri lonnhat trong cac phtu vua nhap
        int max= arrL.get(0);
        for(int i=0;i<soLuongPhtu;i++)
        {
            if(max<arrL.get(i))
                max = arrL.get(i);
        }
        System.out.println("phtu lon nhat la: " + max);

        // xoa phtu
        System.out.println("ban muon xoa phtu nao ?");
        gtri = sc.nextInt();
        if(arrL.contains(gtri))
            {
                arrL.remove(gtri);
                System.out.println("xoa thanh cong!");
                System.out.println("cac phtu con lai la: "+ arrL);
            }
        else
            System.out.println(" xoa k thanh cong!");

        //sap xep 
        int sapXep= arrL.get(0);
        for (int i=0;i<soLuongPhtu;i++)
            {   for(int j=i+1;j<soLuongPhtu;j++)
                {
                    if(arrL.get(i)>arrL.get(j+1))
                    {
                      sapXep =arrL.get(j);
                       arrL.get(j) = arrL.get(i+1);
                       arrL.get(i+1)= sapXep;
                    }
                }
            }
    }

    
}
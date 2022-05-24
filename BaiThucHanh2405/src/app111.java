import java.util.LinkedList;
import java.util.Scanner;

public class app111 {
    public static void main(String[] args) {
        LinkedList <Integer> linkedListInt = new LinkedList<>();
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
            linkedListInt.add(gtri);
        }
        sc.close();
        //tinh tbc cac so chan
        int tong = 0;
        int dem=0;
        for(int i=0;i<soLuongPhtu;i++)
        {
            if(linkedListInt.get(i)%2==0)
            {
                tong = tong + linkedListInt.get(i);
                dem++;
            }
        }

        int tbc= (tong/dem);

        System.out.println("tbc cac so chan la: " + tbc);
    }
}

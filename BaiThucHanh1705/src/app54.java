import java.util.HashSet;
import java.util.Scanner;

public class app54
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <Integer> hashSetInt = new HashSet<>();
        System.out.println("nhap vao so luong phtu cho HashSe: ");
        int soLuongPhtu = sc.nextInt();
        int giaTriPhtu;
        for(int i=0 ; i<soLuongPhtu ; i++)
        {
            System.out.print("nhap phtu thu " + (i+1) +": ");
            giaTriPhtu =  sc.nextInt();
            hashSetInt.add(giaTriPhtu);
        }

        /*for(int i=0;i<soLuongPhtu;i++)
        {
            System.out.println(hashSetInt);
        }*/
        System.out.print("cac phtu vua nhap cua HashSet la: ");
        System.out.println(hashSetInt);
        System.out.println(" nhap vao phtu can them :");
        giaTriPhtu = sc.nextInt();
        if( !hashSetInt.contains(giaTriPhtu))
           {    hashSetInt.add(giaTriPhtu);
                System.out.println("da them phtu vao HashSet thanh cong!");
                System.out.println("cac phtu hashSet sau khi them la: "+ hashSetInt);
            }
        else
            System.out.println("phtu " + giaTriPhtu +   " da ton tai");
    }
}
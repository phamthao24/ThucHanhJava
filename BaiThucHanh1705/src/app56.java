import java.util.HashSet;
import java.util.Scanner;

public class app56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        String name ;
        System.out.print("nhap so luong ten muon them:  ");
        int soLuongTen =  Integer.parseInt(sc.nextLine());

        HashSet <String> hashSetString = new HashSet<>();
        for(int i=0; i<soLuongTen; i++)
        {   
            System.out.println("ten thu "+(i+1) + " : ");
            name = sc.nextLine();
            hashSetString.add(name);
        }
        System.out.println("phtu trong HashSet: "+ hashSetString);
        System.out.print("nhap phtu can xoa: ");
        name = sc.nextLine();
        if( hashSetString.contains(name))
            {
                hashSetString.remove(name);
                System.out.println("xoa thanh cong! ");
                System.out.println("cac phtu con lai trong HashSet la: "+ hashSetString);
                
            }
        else
            System.out.println("xoa k thanh cong!");
    }
}

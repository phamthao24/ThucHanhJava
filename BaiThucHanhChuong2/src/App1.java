import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception
     {  Scanner sc = new Scanner(System.in);
        float a ,b;
        System.out.println("nhap vao lan luot 2 so bat ki:");
        a=sc.nextFloat();
        b=sc.nextFloat();
        float tong=a+b ,hieu=a-b,tich=a*b,thuong=a/b,chialaydu=a%b;
        
        System.out.println("tong = " + tong);
        System.out.println("hieu = " + hieu);
        System.out.println("tich = " + tich);
        System.out.println("thuong = " + thuong);
        System.out.println("chia lay du = " + chialaydu);

        if(a>b) System.out.println("a lon hon b");
        if(a<b) System.out.println("a nho hon b");
        if(a==b) System.out.println("a bang hon b");
    }

}

import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n;
        System.out.println("nhap vao so bat ki:");
        n=sc.nextFloat();
        if(n%2==0)
         System.out.println(n + " la so chan");
         else System.out.println(n+ " la so le");
    }
    
}

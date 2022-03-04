import java.util.Scanner;
public class App74 {
    public static void main(String[] args) throws Exception 
    {   Scanner sc = new Scanner(System.in);
        int [] mang=new int[10]; 
        for(int i=0;i<10;i++)
        {   System.out.println("phan tu thu "+i+" = ");
            mang[i]=sc.nextInt();
        }
        int tong=0;
        for(int i=0;i<10;i++)
        {
            if(mang[i]%2==0)
                tong+=mang[i];
        }
        System.out.println("tong cac so chan trong mang la: "+tong);
    }
}

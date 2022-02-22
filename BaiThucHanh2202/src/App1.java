import java.util.Scanner;
public class App1 {

    
    public static void main(String[] args) throws Exception 
    {   
        Scanner sc = new Scanner(System.in);
        int a,b,UCLN;
        System.out.println("Nhap vao 2 so nguyen duong: ");
        do{
            a = sc.nextInt();
            b = sc.nextInt();
          }while(a<0||b<0);
        
        //tim UCLN
        if(a==0||b==0)
          UCLN= (a+b);
        else
          while (a!=b)
            {   if(a>b) a=a-b;
                else b=b-a;               
            }
          UCLN = a;
         System.out.println("UCLN la: "+UCLN);
    }
}

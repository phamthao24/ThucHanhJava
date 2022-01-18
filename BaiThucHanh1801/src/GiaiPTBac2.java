import java.util.Scanner;

public class GiaiPTBac2
{
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a,b,c,delta,x1,x2;
        do{
            System.out.println("nhap he so a(a!=0)\na = ");
            a=sc.nextDouble();}
        while(a==0);   
        System.out.println("nhap he so b = ");
        b=sc.nextDouble();
        System.out.println("nhap he so c = ");
        c=sc.nextDouble();
        
        delta=b*b-4*a*c ;
        if(delta<0)
            {
                System.out.println("Phuong trinh vo nghiem "); 
            }
        else if(delta==0)
            {
                x1=(-b)/(2*a);
                System.out.println("Phuong trinh co nghiem kep x1 = x2 =" + x1);
            }
        else
        {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 +"\tx2 = " + x2);

        }
    }
}

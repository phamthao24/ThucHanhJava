import java.util.Scanner;

//import java.lang.Math;
public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        
    }
}
    class PTBac2
{
        //thuộc tính
        float a,b,c,delta,x1,x2;
        double l,y;
        //phương thức
        void Nhap()
        {
            System.out.print("nhap he so a,b,c : ");
            Scanner sc = new Scanner (System.in);
            do{a= sc.nextFloat();   
            }while (a!=0);       
            b= sc.nextFloat();
            c= sc.nextFloat();
        }

        void giai()
        {
            delta=b*b -(4*a*c);
            if(delta==0)
                {
                    System.out.println("pt co nghiem kep x ="+(-b/(2*a)));
                }
            else if(delta>0)
                {
                    x1=(float)(-b+Math.sqrt(delta))/(2*a);
                    x2=(float)(-b-Math.sqrt(delta))/(2*a);                   
                }
            else System.out.println("pt vo nghiem");
        }

    }
    


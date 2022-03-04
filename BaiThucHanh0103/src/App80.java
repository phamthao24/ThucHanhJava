import java.util.Scanner;
public class App80 
{public static void main(String[] args) 
    {  
        Scanner sc = new Scanner(System.in);
      
        int dong,cot;
        
        //nhap phan tu
       do{ System.out.print("nhap vao so dong: ");
            dong=sc.nextInt();
            System.out.print("nhap vao so cot: ");
            cot=sc.nextInt();
        }while(dong<=0||cot<=0);
        int mang[][]=new int [dong][cot];
        for(int i=0;i<dong;i++)
        {  for(int j=0;j<cot;j++)
            {System.out.print("phan tu thu a["+i+"]["+j+"] =" );
             mang[i][j]=sc.nextInt();
            }
            System.out.println("\n");
        }

        int solonnhat=0;
        for(int i=0;i<dong;i++)
        {  for(int j=0;j<cot;j++)
            { if(mang[i][j]>solonnhat)
               solonnhat=mang[i][j]; }
        }
        System.out.println("gia tri lon nhat trong mang la: "+solonnhat);
    }
    
}

import java.util.Scanner;
public class App90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int sophantu;
        //nhap phan tu
       do{ System.out.print("nhap vao so phan tu: ");
            sophantu=sc.nextInt();
        }while(sophantu<=0);
        int mang[]=new int [sophantu];
        for(int i=0;i<sophantu;i++)
        { System.out.print("phan tu thu a["+i+"] = " );
             mang[i]=sc.nextInt();
        }

        System.out.println("\ncac phtu vua nhap la:");
        for(int i=0;i<sophantu;i++)
        { System.out.println(mang[i] );
         }
    }
 }
    


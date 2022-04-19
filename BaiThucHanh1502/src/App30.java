import java.util.Scanner;
public class App30 {
    public static void main(String[] args) throws Exception {
        Scanner abc = new Scanner(System.in);
        int SoNguyen;
        int tong = 0;
        int SoTachRa;
        System.out.println("Nhap vao so nguyen duong bat ki: ");
        do{ SoNguyen = abc.nextInt();
          }while(SoNguyen<=0);
   /*     for(;SoNguyen!=0;)
          { SoTachRa = SoNguyen % 10;
            tong+= SoTachRa;
            SoNguyen = SoNguyen / 10;
          }
*/
          while (n=0)
          {
            tong+=SoNguyen%10;
            SoNguyen=SoNguyen/10;
          }
        System.out.println("tong cac chu so trong so la "+tong);
    }
}

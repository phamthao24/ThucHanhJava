import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class App2 
{ public static void main(String[] args)
     { Scanner sc = new Scanner (System.in);
        float canh1,canh2,canh3;
        System.out.println("nhap vao 3 canh cua tam giac: ");
    do{ canh1=sc.nextFloat();
        canh2=sc.nextFloat();
        canh3=sc.nextFloat();
    }while(canh3<0||canh2<0||canh1<0);

    //kiem tra xem co phai tam giac k
    if(canh1<canh2+canh3 && canh2<canh1+canh3 && canh3<canh1+canh2)
    {
         //tam giac deu
         if(canh1==canh2&&canh2==canh3)
        System.out.println("tam giac deu");
        //tam giac vuong
         else if(canh1*canh1==canh2*canh2+canh3*canh3||canh2*canh2==canh1*canh1+canh3*canh3||canh3*canh3==canh2*canh2+canh1*canh1)
         System.out.println("tam giac vuong");
         //tam giac can
         else if(canh1==canh2||canh2==canh3||canh1==canh3)
         System.out.println("tam giac can");
         //tam giac vuong can
         else if((canh1*canh1==canh2*canh2+canh3*canh3||canh2*canh2==canh1*canh1+canh3*canh3||canh3*canh3==canh2*canh2+canh1*canh1)&&(canh1==canh2||canh2==canh3||canh1==canh3))
         System.out.println("tam giac vuong can");

    }else System.out.println("Day k phai la tam giac");
    }
    
}

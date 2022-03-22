
import java.util.Scanner;
public  class person{
        //thuộc tính
       String id,name,address;
       Boolean gender;
        //phương thức
        void Nhap()
        {
            System.out.println("enter your id, name,address, gender : ");
            Scanner sc = new Scanner (System.in);
            id= sc.nextLine();
            name = sc.nextLine();
            address= sc.nextLine();
            gender= sc.nextBoolean();
        }
        void In()
        {
            System.out.print("id: "+id+"\tname: "+name+"\taddress: "+address+"\tgender: "+gender);
        } 
        
    }


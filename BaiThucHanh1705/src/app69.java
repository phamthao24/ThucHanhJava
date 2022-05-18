import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;;

public class app69 {
    public static void main(String[] args) {
        int number;
        TreeSet <Integer> treeSetInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int soPhtu;

        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);

        System.out.println("cac phtu trong treeInteger: " + treeSetInteger);
        System.out.println("nhap phtu can them: ");
        number = sc.nextInt();
        
        if(!treeSetInteger.contains(number))
        {
            treeSetInteger.add(number);
            System.out.println("them thanh cong");
            System.out.println(" cac phtu trong TreeSet: "+ treeSetInteger);
        }
        else 
            System.out.println("them k thanh cong do phtu "+ number+" da ton tai");
        


    }
    
}

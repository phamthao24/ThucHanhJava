import java.util.LinkedHashSet;
import java.util.Set;

public class app60 {
    public static void main(String[] args) {
        Set<String> linkedHSet = new LinkedHashSet<String>();
        linkedHSet.add("java");
        linkedHSet.add("c++");
        linkedHSet.add("php");
        linkedHSet.add("c sharp");

        //show
        for(String i: linkedHSet)
        {
            System.out.println(i);
        }

    }
}

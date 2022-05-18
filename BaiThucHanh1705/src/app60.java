import java.util.LinkedHashSet;
import java.util.Set;

public class app60
{
    public static void main(String[] args) {
        Set<String> linkedhSet= new LinkedHashSet<>();
        linkedhSet.add("pham");
        linkedhSet.add("thao");

        for(String i: linkedhSet)
        {
            System.out.println(i);
        }
    }
}



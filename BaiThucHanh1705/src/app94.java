import java.util.Map;
import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;

public class app94 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm= new LinkedHashMap<>();
        hm.put(100, "dai");
        hm.put(102,"hoc");
        for(Map.Entry<Integer,String> m: hm.entrySet())
            System.out.println("before invoking remove method:" +hm);
            hm.remove(102);
            System.out.println("after invoking remove method:" +hm);
    }
}

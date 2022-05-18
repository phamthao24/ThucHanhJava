import java.util.Set;
import java.util.HashMap;
import java.util.*;

public class app86{
    public static void main(String[] args) {
        HashMap<String,String>  hashMap = new HashMap<>();
        hashMap.put("cslt","co so lap trinh");
        hashMap.put("c#", "c sharp");
        Set<Map.Entry<String,String>> sethastmap= hashMap.entrySet();
        System.out.println("cac entry co trong sethashmap la"+ sethastmap);
    }
}
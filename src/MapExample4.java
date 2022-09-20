import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
public class MapExample4 {
    public static void main(String[] args) {
        Map<String, Integer> k = new HashMap();
        k.put("Hari", 570);
        k.put("Sheeba", 594);
        k.put("Lavanya", 569);
        System.out.println(k);
        Set<Map.Entry<String, Integer>> d = k.entrySet();
        Iterator<Map.Entry<String, Integer>> a = d.iterator();
        while(a.hasNext()) {
            Map.Entry<String, Integer> keyValue = a.next();
            System.out.println(keyValue.getKey() + "" + keyValue.getValue());
        }
    }
}
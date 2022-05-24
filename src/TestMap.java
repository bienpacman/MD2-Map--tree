import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("bin" , 20);
        hashMap.put("kin" , 17);
        hashMap.put("Zin" , 18);
        hashMap.put("Sin" , 29);
        hashMap.put("jin" ,11);
        System.out.println("Hiển thị các mục trong Hashmap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hiển thị các mục nhập theo thứ tự tăng dần của khóa \"");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Bin", 20);
        linkedHashMap.put("Sin", 30);
        linkedHashMap.put("Kin", 22);
        linkedHashMap.put("Lin", 10);
        linkedHashMap.put("Zin", 27);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Kin"));
    }
}

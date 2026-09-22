package HashMap.Basics;

import java.util.HashMap;

public class HashMapCollectionFrameWork {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Biswajit",22); map.put("Santosh",20);
        map.put("Aditya",23); map.put("Vikas",19);
        System.out.println(map+" "+map.size());
        System.out.println(map.containsKey("Santosh"));
        System.out.println(map.remove("Santosh"));
        System.out.println(map+" "+map.size());
        System.out.println(map.get("Aditya"));
        map.put("Vikas",18);
        System.out.println(map+" "+map.size());
        System.out.println(map.containsKey("Santosh"));
//        Traversing
        for (String key: map.keySet()) {
            System.out.println(key+" "+map.get(key));
        }
    }
}

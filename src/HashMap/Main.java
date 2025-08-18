package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kunal", 99);
        map.put("Rahul", 86);
        map.put("Kunal", 96); // This will overwrite the previous value for "Kunal"
        map.put("Amit", 92);

        //get()
        System.out.println("From name: Kunal is " + map.get("Kunal"));

        //getOrDefault()
        System.out.println("Get or Default: " + map.getOrDefault("Sujeet", 0));

        //size()
        System.out.println("Size of HashMap: " + map.size());

        //putAll(Map<? extends K,? extends V> m)
        Map<String, Integer> mapData = new HashMap<>();
        mapData.put("Keshav", 20);
        mapData.put("Saurab", 20);
        mapData.put("Kumar", 20);
        mapData.put("Nalon", 100);
        map.putAll(mapData);

        System.out.println("After adding more data, size of HashMap: " + map.size());
        System.out.println();

        //forEach
        map.forEach((k, v) -> {
            map.put(k, v + v); // Doubling the value for each key
        });

        //forEach
        map.forEach((k, v) -> {
            System.out.println("Key: " + k + ", Value: " + v);
        });

        //containsKey()
        System.out.println("Contains Key : " + map.containsKey("Kunal"));

        //containsValue()
        System.out.println("Contains Value : " + map.containsValue(96));

        //keySet()
        Set<String> values = map.keySet();
        System.out.println("Keys in the HashMap: " + values);

        //values()
        System.out.println("Values in the HashMap: " + map.values());
    }
}

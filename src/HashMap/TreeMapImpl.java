package HashMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl {
    public static void main(String[] args) {
        // TreeMap is part of the Java Collections Framework and is used to store key-value pairs in a sorted order.
        // It implements the Map interface and is based on a Red-Black tree structure.

        // Example usage of TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        System.out.println();
        // Adding elements to the TreeMap
        treeMap.put("Kunal", 99);
        treeMap.put("Rahul", 86);
        treeMap.put("Amit", 92);
        treeMap.put("Sujeet", 75);
        treeMap.put("Rahul", 87); // This will overwrite the previous value for "Rahul"

        // Displaying the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Getting a value by key
        System.out.println("Value for 'Kunal': " + treeMap.get("Kunal"));

        // Checking if a key exists
        System.out.println("Contains 'Rahul': " + treeMap.containsKey("Rahul"));

        // Checking if a value exists
        System.out.println("Contains value 92: " + treeMap.containsValue(92));

        // Size of the TreeMap
        System.out.println("Size of TreeMap: " + treeMap.size());

        // Removing an element
        treeMap.remove("Amit");
        System.out.println("After removing 'Amit': " + treeMap);

        // Iterating through the TreeMap
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

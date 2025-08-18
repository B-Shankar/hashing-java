package HashMap;

import java.util.HashSet;

public class HashSetImpl {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Kunal");
        set.add("Rahul");
        set.add("Amit");
        set.add("Kunal"); // Duplicate, will not be added

        // Displaying the HashSet
        System.out.println("HashSet: " + set);

        // Checking if an element exists
        System.out.println("Contains 'Kunal': " + set.contains("Kunal"));
        System.out.println("Contains 'Sujeet': " + set.contains("Sujeet"));

        // Size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Removing an element
        set.remove("Rahul");
        System.out.println("After removing 'Rahul': " + set);

        // Clearing the HashSet
        set.clear();
        System.out.println("After clearing, size of HashSet: " + set.size());
    }
}

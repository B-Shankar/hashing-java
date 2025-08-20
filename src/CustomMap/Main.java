package CustomMap;

public class Main {
    public static void main(String[] args) {
//        mapUsingHash();
        mapsUsingLinkedList();
    }

    //Simple and Basic
    public static void mapUsingHash() {
        MapUsingHash map = new MapUsingHash();

        // Adding key-value pairs
        map.put("Kunal", "99");
        map.put("Rahul", "86");
        map.put("Amit", "92");

        // Retrieving values
        System.out.println("Value for 'Kunal': " + map.get("Kunal"));
        System.out.println("Value for 'Rahul': " + map.get("Rahul"));

        // Removing a key-value pair
        map.remove("Rahul");
        System.out.println("Value for 'Rahul' after removal: " + map.get("Rahul"));

        // Attempting to retrieve a non-existent key
        System.out.println("Value for 'Sujeet': " + map.get("Sujeet"));
    }

    //Maps Using LinkedList
    public static void mapsUsingLinkedList() {
        MapsUsingLinkedList<String, String> map = new MapsUsingLinkedList<>();


        // Adding key-value pairs
        map.put("Kunal", "99");
        map.put("Rahul", "86");
        map.put("Amit", "92");

        // Retrieving values
        System.out.println("1. Value for 'Kunal': " + map.get("Kunal"));
        System.out.println("2. Value for 'Rahul': " + map.get("Rahul"));

        // Removing a key-value pair
        map.remove("Rahul");
        System.out.println("3. Value for 'Rahul' after removal: " + map.get("Rahul"));

        // Attempting to retrieve a non-existent key
        System.out.println("4. Value for 'Sujeet': " + map.get("Sujeet"));
    }
}

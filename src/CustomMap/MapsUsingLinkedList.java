package CustomMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapsUsingLinkedList<K, V> {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float loadFactor = 0.5f;

    //constructor
    public MapsUsingLinkedList() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put (K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value; // Update existing value
                return;
            }
        }

        if((float) size / list.size() > loadFactor) {
            resize(); //re-hashing
        }
        
        entities.add(new Entity(key, value));
        size++;
    }

    private void resize() {
        System.out.println("we are now re-hashing");

        ArrayList<LinkedList<Entity>> oldList = list;
        list = new ArrayList<>();

        int size = 0;

        for (int i = 0; i < oldList.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entries : oldList) {
            for (Entity entity : entries) {
                put(entity.key, entity.value);
            }
        }
    }

    public V get (K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value; // Return the value if key matches
            }
        }
        return null; // Return null if key not found
    }

    public void remove (K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                target = entity; // Find the entity to remove
                break;
            }
        }
        if (target != null) {
            entities.remove(target); // Remove the entity from the list
            size--;
        }
    }

    public boolean containsKey(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (LinkedList<Entity> entities : list) {
            for (Entity entity : entities) {
                sb.append(entity.key);
                sb.append(" = ");
                sb.append(entity.value);
                sb.append(" , ");
            }
        }
        sb.append("}");

        return sb.toString();
    }

    private class Entity {
        private K key;
        private V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

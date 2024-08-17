import java.util.ArrayList;

// implementing a hashmap through generics
public class MyHashMap<K, V> {
    
    ArrayList<K> keys;
    ArrayList<V> values;

    public MyHashMap() {
        keys = new ArrayList<K>();
        values = new ArrayList<V>();
    }

    public ArrayList<K> keySet() {
        return keys;
    }

    // inserts a key and value
    public void put(K key, V value) {

        if (keys.contains(key)) {

            int index = keys.indexOf(key);
            values.set(index, value);
            return;

        }
        
        keys.add(key);
        values.add(value);
    }

    // gets a value based on a key
    public V get(K key) {

        for (int i = 0; i < keys.size(); i++) {

            if (keys.get(i).equals(key)) {

                return values.get(i);

            }
        }

        return null;
    }

}

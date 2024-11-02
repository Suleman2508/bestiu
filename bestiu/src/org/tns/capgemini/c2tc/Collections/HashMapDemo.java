package org.tns.capgemini.c2tc.Collections;
import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 100); 
        map.put(2, 200);  
        map.put(3, 300);  
        map.put(4, 400); 

        System.out.println("Initial Map: " + map);

        int valueForKey1 = map.get(1);
        System.out.println("Value for key '1': " + valueForKey1);

        map.put(2, 250);  
        System.out.println("Map after updating value for key '2': " + map);

        map.remove(3);  
        System.out.println("Map after removing key '3': " + map);

        // 6. Checking if a key exists
        boolean hasKey1 = map.containsKey(1);
        System.out.println("Map contains key '1': " + hasKey1);

        // 7. Checking if a value exists
        boolean hasValue400 = map.containsValue(400);
        System.out.println("Map contains value 400: " + hasValue400);

        // 8. Iterating over keys and values
        System.out.println("Iterating over keys and values:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        int size = map.size();
        System.out.println("Size of the map: " + size);
        
       
        map.clear();
        System.out.println("Map after clearing: " + map);
        
    }
}
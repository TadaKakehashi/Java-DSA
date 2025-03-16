package HashMaps;
import java.util.*;
public class Hash1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //Insertion
        map.put("India",120);
        map.put("Japan",100);
        map.put("Australia",90);
        map.put("China",120);

        System.out.println(map);

        //Update
        map.put("India",200);
        System.out.println(map);

        System.out.println("Using entrySet method: ");
        for(Map.Entry<String,Integer>e: map.entrySet()){
            System.out.println(e.getKey() +":"+ e.getValue());
        }

        System.out.println("Another method using keySet: ");
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+" : " +map.get(key));
        }

        System.out.println();
        map.remove("China");
        System.out.println(map);
    }
}

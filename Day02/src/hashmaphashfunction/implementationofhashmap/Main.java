package hashmaphashfunction.implementationofhashmap;
// Main class for Implementation
import java.util.ArrayList;
public class Main {
    public static void main(String args[]){
        ImplementationOfHashmap.HashMap<String,Integer>map = new ImplementationOfHashmap.HashMap<>();
        map.put("India", 100);
        map.put("China", 50);
        map.put("Bhutan",40);

        ArrayList<String>keys=map.keySet();
        for(String key : keys){
            System.out.println(key);
        }
        System.out.println(map.get("India"));

    }
}

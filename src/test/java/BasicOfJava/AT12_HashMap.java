package BasicOfJava;

import org.junit.Test;

import java.util.HashMap;

public class AT12_HashMap {
    @Test
    public void test16() {
// here we created an object (map) of Hashmap and this hashmap takes String and Integer as Key:Value
        HashMap<String, Integer> map = new HashMap<>();
        // lets add key values to map
        map.put("Ricky", 11);
        map.put("Bianca", 8);
        map.put("Sophy", 12);
        System.out.println("Print map values on console : " + map);
        //Size of hasmap
       int mapSize= map.size();
        System.out.println("hasmap size is : "+mapSize);
        if(map.containsKey("Bianca")){
            int keyVal = map.get("Bianca");
            System.out.println("key value for Bianca is : "+keyVal);

        }
    }
}

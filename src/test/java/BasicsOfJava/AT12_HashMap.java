package BasicsOfJava;

import org.junit.Test;

import java.util.HashMap;

public class AT12_HashMap {

    @Test
    public void test16(){
        // here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ricky",11);
        map.put("Bianca",8);
        map.put("Sophy",13);
        System.out.println("Print data in the map on the console : "+ map);
        int mapSize=map.size();
        System.out.println("hasmap size is : "+mapSize);
        int keyVal = map.get("Ricky");
        System.out.println(" keyVal : "+keyVal);
        if(map.containsKey("Bianca")){
            int keyVal1 = map.get("Bianca");
            System.out.println(" keyVal1 : "+keyVal1);
        }
    }
}

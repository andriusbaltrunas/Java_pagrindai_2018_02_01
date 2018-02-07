package collections.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andriusbaltrunas on 2/6/2018.
 */
public class MapExample {

    public static void main(String[] args){

        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(12, "Andrius");
        namesMap.put(1, "Jonas");
        namesMap.put(3, "Petras");
        namesMap.put(4, "Andrius");
        namesMap.put(12, "Birute");

        for(Integer key : namesMap.keySet()){
            System.out.println("key:" + key + " value " + namesMap.get(key));
        }

    }
}

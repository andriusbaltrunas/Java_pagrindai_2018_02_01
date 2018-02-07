package collections.example;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by andriusbaltrunas on 2/6/2018.
 */
public class SetExample {

    public static void main(String[] args){

        Set<String> names = new TreeSet<>();
        names.add("Petras");
        names.add("Jonas");
        names.add("Andrius");
        names.add("Jonas");

        for(String name : names){
            System.out.println(name);
        }
    }
}

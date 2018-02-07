package collections.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 2/6/2018.
 */
public class ListExample {

    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();
        names.add("Andrius");
        names.add("Antanas");
        names.add("Petras");
        names.add(3, "Blabla");

        for(int i = 0; i < names.size(); i ++){
            System.out.println(names.get(i));
        }

        List<Integer> numbers = new LinkedList<>();
        numbers.add(12);
        numbers.add(2);
        numbers.add(34);
        numbers.add(1);
        numbers.add(6);

        if(!numbers.isEmpty()){
            for(Integer numb : numbers){
                System.out.println(numb);
            }
        }
    }
}

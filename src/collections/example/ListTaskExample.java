package collections.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by andriusbaltrunas on 2/7/2018.
 */
public class ListTaskExample {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        Person person = new Person("Andrius", "Baltrunas", 22,"Kaunas");
        persons.add(person);
        persons.add(new Person("Tadas", "Tramp", 32, "Vilnius"));

        for(Person p : persons){
            System.out.println(p.getName());
        }
    }
}

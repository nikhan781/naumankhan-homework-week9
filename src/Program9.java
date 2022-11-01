/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Program9 {

    public static void main(String[] args) {
        hashMap();

    }

    public static void hashMap() {
        HashMap<String, Integer> people = new HashMap();

        people.put("Hiren", 80);
        people.put("Manisha", 70);
        people.put("Krupa", 90);
        people.put("Kishan", 100);
        people.put("Harshid", 60);
        people.put("Siddhi", 50);
        people.put("Nauman", 40);

        for (Map.Entry<String, Integer> peopleName : people.entrySet()) {
            System.out.println(peopleName);
        }
    }
}

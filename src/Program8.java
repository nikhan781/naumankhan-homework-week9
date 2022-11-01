import java.util.HashSet;

/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)
 */
public class Program8 {

    public static void main(String[] args) {

        hashSet();

    }

    public static void hashSet() {
        HashSet<Integer> object = new HashSet();
        object.add(4);
        object.add(7);
        object.add(8);
        for (int i = 1; i <= 10; i++) {
            if (object.contains(i)) {
                System.out.println("the number " + i + " is in set between 1 and 10");
            } else {
                System.out.println("The number " + i + " is not in set between 1 and 10");
            }
        }
    }
}
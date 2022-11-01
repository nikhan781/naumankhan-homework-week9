import java.util.ArrayList;
import java.util.Iterator;

/*
Write a Java program to iterate through all elements in an array list using
Iterator.
 */
public class Program5 {
    public static void main(String[] args) {
        myList();

    }

    public static void myList() {

        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }

}

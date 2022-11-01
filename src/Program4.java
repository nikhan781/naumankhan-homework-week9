import java.util.ArrayList;

/*
Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */
public class Program4 {

    public static void main(String[] args) {
        Program4 obj = new Program4();
        obj.myColours();

    }

    public void myColours() {
        ArrayList<String> colors = new ArrayList();
        colors.add("Blue");
        colors.add("Violet");
        colors.add("Indigo");
        colors.add("Orange");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");

        for (String rainbow : colors) {
            System.out.println(rainbow);
        }

    }
}

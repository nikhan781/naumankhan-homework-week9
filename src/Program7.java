import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not. Define array list with
underground tube names
 */
public class Program7 {
    public static void main(String[] args) {
        tubeNames();

    }

    public static void tubeNames() {

        ArrayList<String> tubes = new ArrayList();
        tubes.add("Central line");
        tubes.add("Bakerloo line");
        tubes.add("District line");
        tubes.add("Circle line");
        tubes.add("Hammersmith line");
        tubes.add("Jubliee line");
        tubes.add("Piccadilly line");
        tubes.add("Metropolitan line");

        if (tubes.isEmpty()) {
            System.out.println("Arraylist is empty");
        } else {
            System.out.println("Arraylist is not empty");
        }

    }
}

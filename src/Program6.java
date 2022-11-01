import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to retrieve an element (at a specified index) from a given
array list
 */
public class Program6 {

    public static void main(String[] args) {
        Program6 obj = new Program6();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number between 1 to 7 to retrieve alphabet :");
        int x = scanner.nextInt();
        obj.retrieveElement(x);
        scanner.close();
    }

    public void retrieveElement(int a) {

        ArrayList<Character> characters = new ArrayList();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('F');
        characters.add('G');

        Character alpha = characters.get(a - 1); // this will start position of the number starting from 1
        System.out.println("The character on position " + a + " is " + alpha);
    }
}

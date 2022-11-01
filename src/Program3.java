/*Write a Java program to reverse an array of integer values.*/
public class Program3 {

    public static void main(String[] args) {
        reverseArray();
    }

    public static void reverseArray() {

        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Original Array: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        System.out.println("Reverse of Original Array: ");
        for (int i = array.length-1; i>=0; i--)
            System.out.print(array[i] + " ");


    }
}

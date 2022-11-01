package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    static int a, b;
    static char symbol;
    static char choice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        print();
        obj.calculateResult(a, b, symbol);
        System.out.println("Would you like to do more calculation, Please enter " + "\"Y\"" + "or" + "\"N\"");
        choice = scanner.next().charAt(0);

        while (choice == 'Y' || choice == 'y') {
            print();
            obj.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation, Please enter " + "\"Y\"" + "or" + "\"N\"");
            choice = scanner.next().charAt(0);
        }
        System.out.println("End of Calculator: ");
        System.exit(0); // this will terminate the program if "N" is typed

        scanner.close();
    }

    public static void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        a = scanner.nextInt();
        System.out.println("Please enter second number: ");
        b = scanner.nextInt();
        System.out.println("Please enter one of symbol: ");
        symbol = scanner.next().charAt(0);
    }
}
/*
Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        stations();
    }

    public static void stations() {
        char c = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter station name in Zone 1: ");
        String sname = scanner.nextLine().toLowerCase();

        if (sname.equals("Aldgate")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitan");
            list.add("Circle");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }

        } else if (sname.equals("Aldgate East")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Hammersmith & City");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));

            }
        } else if (sname.equals("Angel")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northen");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Baker Street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Circle");
            list.add("Hammersmith & city");
            list.add("Jubilee");
            list.add("Metropolitan");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Bank")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");
            list.add("DLR");
            list.add("Northern");
            list.add("Waterloo & City");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Barbican")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitan");
            list.add("Circle");
            list.add("Hammersmith & city");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Battersea")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Bayswater")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Blackfriars")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");


            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Bond Street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");
            list.add("jubilee");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Borough")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Cannon Street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Chancery lane")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Charing Cross")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Baker loo");
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Covent Garden")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Piccadily");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Edgware Road")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Elephant Castle")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Embankment")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Circle");
            list.add("Northern");
            list.add("District");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Euston")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Victoria");
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Euston Square")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitan");
            list.add("Circle");
            list.add("Hammersmith & City");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Farringdon")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Circle");
            list.add("Hammersmith & City");
            list.add("Metropolitan");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Gloucester Street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Green Park")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Jubilee");
            list.add("Piccadilly");
            list.add("Victoria");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else
            System.out.println("Please enter another station's name");
    }
}

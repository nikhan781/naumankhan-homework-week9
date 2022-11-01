import java.util.Scanner;

/*
Re write the student mark sheet programme using if else and while loop.
 */
public class Program2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = scanner.next();
        System.out.print("Enter Roll Number : ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter Maths Marks : ");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("Invalid input, Please enter marks between 0 to 100");
            System.out.print("Please re-enter Maths marks : ");
            mathsMarks = scanner.nextInt();
        }
        System.out.print("Enter Science Marks : ");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid input, please enter marks between 0 to 100");
            System.out.print("Please re-enter Science marks : ");
            scienceMarks = scanner.nextInt();
        }
        System.out.print("Enter English Marks : ");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid input, please enter marks between 0 to 100");
            System.out.print("Please re-enter Englis marks : ");
            englishMarks = scanner.nextInt();
        }

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100 / 300);
        String result = calculateResult(mathsMarks, englishMarks, scienceMarks);
        String grade = calculateGrade(percentage);
        printTheMarksSheet(name, rollNumber, mathsMarks, englishMarks, scienceMarks, total, percentage, result, grade);
        scanner.close();
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        while (mathsMarks >= 35 || scienceMarks >= 35 || englishMarks >= 35) {
            return "Pass";
        }
        {
            return "Fail";
        }
    }

    public static String calculateGrade(int percentage) {
        String grade = null;
        if (calculateResult(35, 35, 35).equalsIgnoreCase("Fail")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "F";
        }
        return grade;
    }

    public static void printTheMarksSheet(String name, int rollNum, int mathMarks, int scienceMarks,
                                          int englishMarks, double total, double percentage, String result,
                                          String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|_________|");
        System.out.println("| Name:" + name + "                |\n");
        System.out.println("| Roll No:" + rollNum + "                |\n");
        System.out.println("|_________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|_________|");
        System.out.println("| Math:" + mathMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|_________|");
        System.out.println("| Total:" + total + "              |\n");
        System.out.println("|_________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |\n");
        System.out.println("|____________________________|\n");

    }
}
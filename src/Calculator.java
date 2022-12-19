import java.util.Scanner;

public class Calculator {
    static void ask() {
        System.out.print("How many numbers dou you want to enter? : ");
    }

    static void add() {
        Scanner scanner = new Scanner(System.in);
        int counter, i;
        double number, result = 0.0;
        ask();
        counter = scanner.nextInt();

        for (i = 1; i <= counter; i++) {
            System.out.print("Enter the number " + i + ": ");
            number = scanner.nextDouble();
            result += number;
        }
        System.out.println("Answer: " + result);
    }

    static void subtract() {
        Scanner scanner = new Scanner(System.in);
        int counter, i;
        double number, result = 0.0;
        ask();
        counter = scanner.nextInt();

        for (i = 1; i <= counter; i++) {
            System.out.print("Enter the number " + i + " : ");
            number = scanner.nextDouble();
            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }
        System.out.println("Answer: " + result);
    }

    static void multiply() {
        Scanner scanner = new Scanner(System.in);
        int counter, i;
        double number, result = 1.0;
        ask();
        counter = scanner.nextInt();

        for (i = 1; i <= counter; i++) {
            System.out.print("Enter the number " + i + " : ");
            number = scanner.nextDouble();
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Answer: " + result);
    }

    static void divide() {
        Scanner scanner = new Scanner(System.in);
        int counter, i;
        double number, result = 0.0;
        ask();
        counter = scanner.nextInt();

        for (i = 1; i <= counter; i++) {
            System.out.print("Enter the number " + i + " : ");
            number = scanner.nextDouble();
            if (i == 1) {
                result = number;
                continue;
            }
            if (number == 0) {
                System.out.println("Error: Undefined value.");
                return;
            }
            result /= number;
        }
        System.out.println("Answer: "+result);
    }

    static void exp() {
        Scanner scanner = new Scanner(System.in);
        int base, pow, i;
        int result = 1;

        System.out.print("Enter the base number: ");
        base = scanner.nextInt();
        System.out.print("Enter the power number: ");
        pow = scanner.nextInt();

        for (i = 1; i <= pow; i++) {
            result *= base;
        }
        System.out.println(base + " to the power " + pow + " : " + result);
    }

    static void factorial() {
        Scanner scanner = new Scanner(System.in);
        int number, i;
        int result = 1;
        System.out.print("Enter the number: ");
        number = scanner.nextInt();

        for (i = number; i >= 1; i--) {
            result *= i;
        }
        System.out.println("Answer: " + result);
    }

    static void mod() {
        Scanner scanner = new Scanner(System.in);
        int numOne, numTwo, remainder;

        System.out.print("Enter the first number: ");
        numOne = scanner.nextInt();
        System.out.print("Enter the second number: ");
        numTwo = scanner.nextInt();

        remainder = numOne % numTwo;
        System.out.println("Answer: "+remainder);
    }

    static void rectArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length in meter: ");
        int a = scanner.nextInt();
        System.out.print("Enter the width in meter: ");
        int b = scanner.nextInt();

        int area = a * b;
        System.out.println("Answer: " + area);
    }
    static void triArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base in meter: ");
        int a = scanner.nextInt();
        System.out.print("Enter the height in meter: ");
        int b = scanner.nextInt();

        int area = (a * b) / 2;
        System.out.println("Answer: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.print("""
                    1 - Add
                    2 - Subtract
                    3 - Multiply
                    4 - Divide
                    5 - Exponentiation
                    6 - Factorial
                    7 - Modulo (mod)
                    8 - Area
                    0 - Quit
                    Select an operation :""");
            select = scanner.nextInt();
            switch (select) {
                case 1 -> add();
                case 2 -> subtract();
                case 3 -> multiply();
                case 4 -> divide();
                case 5 -> exp();
                case 6 -> factorial();
                case 7 -> mod();
                case 8 -> {
                    System.out.print("""
                            1 for the area of rectangle
                            2 for the area of triangle
                            Select the operation (1,2):\s""");
                    select = scanner.nextInt();
                    if (select == 1) {
                        rectArea();
                    } else if (select == 2) {
                        triArea();
                    } else {
                        System.out.println("Invalid Input!");
                    }
                }
                case 0 -> System.out.print("Good Luck for Math!");
                default -> System.out.print("Invalid Input! Try again.");
            }
        } while (select != 0);

    }
}

//Task - 1


//import java.util.Scanner;
//
//public class second {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter base: ");
//        double base = sc.nextDouble();
//        System.out.print("Enter height: ");
//        double height = sc.nextDouble();
//
//        System.out.println("Area: " + (base * height) / 2);
//    }
//}


//Task - 2


//import java.util.Scanner;
//
//public class second {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter principal: ");
//        double principal = sc.nextDouble();
//        System.out.print("Enter rate: ");
//        double rate = sc.nextDouble();
//        System.out.print("Enter time: ");
//        double time = sc.nextDouble();
//
//        System.out.println("Simple Interest: " + (principal * rate * time) / 100);
//    }
//}


//Task - 3


//public class second {
//    public static void main(String[] args) {
//
//        if (args.length != 3) {
//            System.out.println("Usage: java Calc <num1> <operator> <num2>");
//            return;
//        }
//
//        int num1 = Integer.parseInt(args[0]);
//        char operator = args[1].charAt(0);
//        int num2 = Integer.parseInt(args[2]);
//
//        if (operator == '+')
//            System.out.println("Sum: " + (num1 + num2));
//        else if (operator == '-')
//            System.out.println("Difference: " + (num1 - num2));
//        else if (operator == '*')
//            System.out.println("Product: " + (num1 * num2));
//        else if (operator == '/')
//            System.out.println("Quotient: " + (num1 / num2));
//        else
//            System.out.println("Invalid operator!");
//    }
//}



//Task- 4


//import java.util.Scanner;
//
//public class second {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        if (number > 0) {
//            System.out.println("The number is positive.");
//        } else if (number < 0) {
//            System.out.println("The number is negative.");
//        } else {
//            System.out.println("The number is zero.");
//        }
//
//        scanner.close();
//    }
//}



//Task - 5


import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); // Accepts the first integer

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); // Accepts the second integer

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt(); // Accepts the third integer

        if (num1 >= num2) { // Checks if num1 is greater than or equal to num2
            if (num1 >= num3) { // If num1 is also greater than or equal to num3
                System.out.println("The greatest number is: " + num1);
            } else { // If num3 is greater than num1
                System.out.println("The greatest number is: " + num3);
            }
        } else { // If num2 is greater than num1
            if (num2 >= num3) { // Checks if num2 is greater than or equal to num3
                System.out.println("The greatest number is: " + num2);
            } else { // If num3 is greater than num2
                System.out.println("The greatest number is: " + num3);
            }
        }

        scanner.close(); // Closes the scanner object
    }
}

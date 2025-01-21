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


public class second {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java Calc <num1> <operator> <num2>");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        char operator = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);

        if (operator == '+')
            System.out.println("Sum: " + (num1 + num2));
        else if (operator == '-')
            System.out.println("Difference: " + (num1 - num2));
        else if (operator == '*')
            System.out.println("Product: " + (num1 * num2));
        else if (operator == '/')
            System.out.println("Quotient: " + (num1 / num2));
        else
            System.out.println("Invalid operator!");
    }
}

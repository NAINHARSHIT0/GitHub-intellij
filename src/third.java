
//sum of all integers between 10 and 950 divisible by both 6 and 9

public class third{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 950; i++) {
            if (i % 18 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all integers between 10 and 950 divisible by both 6 and 9 is: " + sum);
    }
}





//import java.util.Scanner;
//
//public class SumOfDigits {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int number = scanner.nextInt();
//        int sum = 0;
//
//        // Extract each digit and add it to the sum
//        while (number != 0) {
//            sum += number % 10; // Get the last digit
//            number /= 10;       // Remove the last digit
//        }
//
//        System.out.println("The sum of the digits is: " + sum);
//        scanner.close();
//    }
//}

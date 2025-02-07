
//sum of all integers between 10 and 950 divisible by both 6 and 9

//public class third{
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 10; i <= 950; i++) {
//            if (i % 18 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println("sum of all integers between 10 and 950 divisible by 6 and 9 is: " + sum);
//    }
//}




// sum of all the digits of number

//import java.util.Scanner;
//
//public class third {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int number = scanner.nextInt();
//        //float f = scanner.nextFloat();
//        int sum = 0;
//
//
//        while (number != 0) {
//            sum = sum + number % 10;
//            number /= 10;
//        }
//
//        System.out.println("sum of digits is: " + sum);
//        scanner.close();
//    }
//}


//public class third {
//    public static void main(String[] args) {
//        int N = 10; // Set N to desired number of terms
//        int a = 0, b = 1;
//
//        for (int i = 1; i <= N; i++) {
//            System.out.print(a + " ");
//            int next = a + b;
//            a = b;
//            b = next;
//        }
//    }
//}


//public class third {
//    public static void main(String[] args) {
//        int count = 0;
//
//        for (int i = 2; i <= 1000; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                count++;
//            }
//        }
//        System.out.println("Total prime numbers between 1 and 1000: " + count);
//    }
//}






//public class third {
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 2, 5, 2, 6};
//        int target = 2;
//        int count = 0;
//
//        for (int num : arr) {
//            if (num == target) {
//                count++;
//            }
//        }
//
//        System.out.println("The number " + target + " appears " + count + " times.");
//    }
//}
//



//public class third {
//    public static void main(String[] args) {
//        int[] arr = {12, 35, 1, 10, 34, 1}; // Example array
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//        for (int num : arr) {
//            if (num > largest) {
//                secondLargest = largest;
//                largest = num;
//            } else if (num > secondLargest && num != largest) {
//                secondLargest = num;
//            }
//        }
//
//        System.out.println("Second largest element: " + secondLargest);
//    }
//}



//public class third {
//    public static void main(String[] args) {
//        int rows = 4; // Number of rows
//
//        for (int i = 1; i <= rows; i++) {
//            if (i % 2 != 0) {
//                for (int j = 1; j <= i * 2 - 1; j++) {
//                    System.out.print("? ");
//                }
//            } else {
//                for (int j = 1; j <= i * 2 - 1; j++) {
//                    System.out.print("# ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

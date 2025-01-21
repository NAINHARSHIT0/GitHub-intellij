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


import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        System.out.println("Simple Interest: " + (principal * rate * time) / 100);
    }
}


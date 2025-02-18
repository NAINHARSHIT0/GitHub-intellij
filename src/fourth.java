// Experiment 1
//class Student {
//    String name;
//    int age;
//
//    // Default constructor
//    Student() {
//        this.name = "Default Name";
//        this.age = 18;
//    }
//
//    // Parameterized constructor
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // Method to display student details
//    void displayDetails() {
//        System.out.println("Name: " + name + ", Age: " + age);
//    }
//
//    public static void main(String[] args) {
//        // Using default constructor
//        Student student1 = new Student();
//        student1.displayDetails();
//
//        // Using parameterized constructor
//        Student student2 = new Student("John Doe", 20);
//        student2.displayDetails();
//    }
//}

//Experiment - 2

//class BankAccount {
//    private double balance = 0;
//
//    // Public method to deposit funds
//    public void deposit(double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println("Deposited: " + amount);
//        } else {
//            System.out.println("Invalid deposit amount.");
//        }
//    }
//
//    // Protected method to withdraw funds
//    protected void withdraw(double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//            System.out.println("Withdrawn: " + amount);
//        } else {
//            System.out.println("Insufficient balance or invalid amount.");
//        }
//    }
//
//    // Default-access method to check balance
//    void checkBalance() {
//        System.out.println("Current balance: " + balance);
//    }
//
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
//        account.deposit(500);
//        account.checkBalance();
//        account.withdraw(200);
//        account.checkBalance();
//        // Withdraw method not accessible outside the class if not in the same package
//    }
//}

//Experiment - 3
//
//class Calculator {
//
//    // Method to add two integers
//    int add(int a, int b) {
//        return a + b;
//    }
//
//    // Method to add two doubles
//    double add(double a, double b) {
//        return a + b;
//    }
//
//    // Method to add three integers
//    int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//
//        System.out.println("Sum of two integers: " + calculator.add(5, 10));
//        System.out.println("Sum of two doubles: " + calculator.add(5.5, 10.5));
//        System.out.println("Sum of three integers: " + calculator.add(1, 2, 3));
//    }
//}

// Experiment 4
//public class fourth{
//    static String universityName = "UPES";
//    public String studentName;
//
//    public fourth(String StudentName){
//        this.studentName = StudentName;
//    }
//    public static void displayuniversityName() {
//        System.out.println("University Name: " + universityName);
//
//    }
//    public void displaystudentName() {
//        System.out.println("Student Name: " + studentName);
//    }
//    public static void main(String[] args) {
//        fourth student1 = new fourth("abc");
//        fourth student2 = new fourth("def");
//
//
//        student1.displaystudentName();
//        student2.displaystudentName();
//
//        fourth.displayuniversityName();
//
//    }
//}



//Experiment - 5

//class Course {
//    String courseName;
//    String courseCode;
//
//    // Constructor with 'this' keyword to differentiate between parameters and class attributes
//    Course(String courseName, String courseCode) {
//        this.courseName = courseName;
//        this.courseCode = courseCode;
//    }
//
//    // Method to display course details
//    void displayCourseDetails() {
//        System.out.println("Course Name: " + courseName + ", Course Code: " + courseCode);
//    }
//
//    public static void main(String[] args) {
//        Course course = new Course("Artificial Intelligence", "CS101");
//        course.displayCourseDetails();
//    }
//}

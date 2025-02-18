//experiment 1

//class Superclass {
//    private int privateValue = 10;
//
//    public int getPrivateValue() {
//        return privateValue;
//    }
//}
//
//class Subclass extends Superclass {
//    void displayPrivateValue() {
//        // Cannot access privateValue directly.
//        System.out.println("Accessing private value through getter: " + getPrivateValue());
//    }
//}
//
//public class fifth {
//    public static void main(String[] args) {
//        Subclass obj = new Subclass();
//        obj.displayPrivateValue();
//    }
//}

//experiment -2
//
//class Player {
//    String name;
//    int age;
//    String position;
//
//    Player(String name, int age, String position) {
//        this.name = name;
//        this.age = age;
//        this.position = position;
//    }
//
//    void play() {
//        System.out.println(name + " is playing.");
//    }
//
//    void train() {
//        System.out.println(name + " is training.");
//    }
//}
//
//class Cricket_Player extends Player {
//    Cricket_Player(String name, int age, String position) {
//        super(name, age, position);
//    }
//}
//
//class Football_Player extends Player {
//    Football_Player(String name, int age, String position) {
//        super(name, age, position);
//    }
//}
//
//class Hockey_Player extends Player {
//    Hockey_Player(String name, int age, String position) {
//        super(name, age, position);
//    }
//}
//
//public class fifth {
//    public static void main(String[] args) {
//        Cricket_Player cricketPlayer = new Cricket_Player("Virat", 32, "Batsman");
//        Football_Player footballPlayer = new Football_Player("Ronaldo", 36, "Forward");
//        Hockey_Player hockeyPlayer = new Hockey_Player("Sandeep", 28, "Defender");
//
//        cricketPlayer.play();
//        footballPlayer.train();
//        hockeyPlayer.play();
//    }
//}

//experiment - 3
//
//class Worker {
//    String name;
//    double salaryRate;
//
//    Worker(String name, double salaryRate) {
//        this.name = name;
//        this.salaryRate = salaryRate;
//    }
//
//    double computePay(int hours) {
//        return 0; // Placeholder for polymorphism
//    }
//}
//
//class DailyWorker extends Worker {
//    DailyWorker(String name, double salaryRate) {
//        super(name, salaryRate);
//    }
//
//    @Override
//    double computePay(int hours) {
//        return salaryRate * (hours / 8);
//    }
//}
//
//class SalariedWorker extends Worker {
//    SalariedWorker(String name, double salaryRate) {
//        super(name, salaryRate);
//    }
//
//    @Override
//    double computePay(int hours) {
//        return salaryRate * 40;
//    }
//}
//
//public class fifth {
//    public static void main(String[] args) {
//        Worker dailyWorker = new DailyWorker("John", 50);
//        Worker salariedWorker = new SalariedWorker("Alice", 100);
//
//        System.out.println("Daily Worker Pay: " + dailyWorker.computePay(32));
//        System.out.println("Salaried Worker Pay: " + salariedWorker.computePay(40));
//    }
//}

//experiment - 4

//abstract class TrunkCall {
//    int duration;
//
//    TrunkCall(int duration) {
//        this.duration = duration;
//    }
//
//    abstract double computeCharge();
//}
//
//class OrdinaryCall extends TrunkCall {
//    OrdinaryCall(int duration) {
//        super(duration);
//    }
//
//    @Override
//    double computeCharge() {
//        return duration * 1.0; // $1 per minute
//    }
//}
//
//class UrgentCall extends TrunkCall {
//    UrgentCall(int duration) {
//        super(duration);
//    }
//
//    @Override
//    double computeCharge() {
//        return duration * 2.0; // $2 per minute
//    }
//}
//
//class LightningCall extends TrunkCall {
//    LightningCall(int duration) {
//        super(duration);
//    }
//
//    @Override
//    double computeCharge() {
//        return duration * 3.0; // $3 per minute
//    }
//}
//
//public class fifth {
//    public static void main(String[] args) {
//        TrunkCall ordinary = new OrdinaryCall(10);
//        TrunkCall urgent = new UrgentCall(5);
//        TrunkCall lightning = new LightningCall(3);
//
//        System.out.println("Ordinary Call Charge: $" + ordinary.computeCharge());
//        System.out.println("Urgent Call Charge: $" + urgent.computeCharge());
//        System.out.println("Lightning Call Charge: $" + lightning.computeCharge());
//    }
//}



//experiment - 5

//class Employee {
//    String name;
//    int empId;
//    double salary;
//
//    Employee() {
//        this.name = "Unknown";
//        this.empId = 0;
//        this.salary = 0.0;
//    }
//
//    Employee(String name, int empId, double salary) {
//        this.name = name;
//        this.empId = empId;
//        this.salary = salary;
//    }
//
//    String getName() {
//        return name;
//    }
//
//    double getSalary() {
//        return salary;
//    }
//
//    void increaseSalary(double percentage) {
//        salary += (salary * percentage / 100);
//    }
//}
//
//class Manager extends Employee {
//    String department;
//
//    Manager(String name, int empId, double salary, String department) {
//        super(name, empId, salary);
//        this.department = department;
//    }
//
//    void displayInfo() {
//        System.out.println("Manager: " + name + ", ID: " + empId + ", Salary: $" + salary + ", Department: " + department);
//    }
//}
//
//public class fifth {
//    public static void main(String[] args) {
//        Employee emp = new Employee("John", 101, 50000);
//        Manager mgr = new Manager("Alice", 102, 80000, "HR");
//
//        emp.increaseSalary(10);
//        mgr.increaseSalary(15);
//
//        System.out.println("Employee Name: " + emp.getName() + ", New Salary: $" + emp.getSalary());
//        mgr.displayInfo();
//    }
//}

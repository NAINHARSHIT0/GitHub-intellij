// Experiment 1

//public class fourth {
//    private String name;
//    private int age;
//
//    public fourth() {            //default constructor
//        this.name = "Default Name";
//        this.age = 00;
//    }
//
//    public fourth(String name, int age) {          //parameterised constructor
//        this.name = name;
//        this.age = age;
//    }
//
//    public void displayDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
//
//    public static void main(String[] args) {
//        fourth student1 = new fourth();
//        System.out.println("Student 1 Details:");
//        student1.displayDetails();
//
//        System.out.println();
//
//        fourth student2 = new fourth("Aryan", 19);
//        System.out.println("Student 2 Details:");
//        student2.displayDetails();
//    }
//}


// Experiment 4
public class fourth{
    static String universityName = "UPES";
    String studentName;

    public fourth(String StudentName){
        this.studentName = StudentName;
    }
    public static void displayuniversityName() {
        System.out.println("University Name: " + universityName);

    }
    public void displaystudentName() {
        System.out.println("Student Name: " + studentName);
    }
    public static void main(String[] args) {
        fourth student1 = new fourth("abc");
        fourth student2 = new fourth("def");


        student1.displaystudentName();
        student2.displaystudentName();

        fourth.displayuniversityName();

    }
}
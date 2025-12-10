import java.util.Scanner;

class Info {
    String name;
    String roll;
    String section;
    String branch;

    Info(String name, String roll, String section, String branch) {
        this.name = name;
        this.roll = roll;
        this.section = section;
        this.branch = branch;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        String roll = sc.nextLine();

        System.out.print("Enter Section: ");
        String section = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        Info student = new Info(name, roll, section, branch);

        student.display();

        sc.close();
    }
}

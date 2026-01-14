package DAY_3;

import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.println("Enter account number:");
        acc_no = Integer.parseInt(sc.nextLine());

        System.out.println("Enter balance:");
        balance = Double.parseDouble(sc.nextLine());
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    void input(Scanner sc) {
        System.out.println("Enter name:");
        name = sc.nextLine();   // ✅ works first time, every time

        System.out.println("Enter Aadhar number:");
        aadhar_no = Long.parseLong(sc.nextLine());

        super.input(sc);
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();
        System.out.println("----------------------");
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        System.out.println("Enter details of Person 1");
        p1.input(sc);

        System.out.println("Enter details of Person 2");
        p2.input(sc);

        System.out.println("Enter details of Person 3");
        p3.input(sc);

        System.out.println("\nDetails of Three Persons:");
        p1.disp();
        p2.disp();
        p3.disp();

        sc.close();
    }
}

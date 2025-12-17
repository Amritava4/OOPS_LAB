package DAY_3;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int r, String n, double c) {
        roll = r;
        name = n;
        cgpa = c;
    }

    void display() {
        System.out.println(roll + " " + name + " " + cgpa);
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] s = new Student[n];
        double minCgpa = Double.MAX_VALUE;
        String lowName = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Enter roll:");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter CGPA:");
            double cg = sc.nextDouble();
            sc.nextLine();

            s[i] = new Student(r, name, cg);

            if (cg < minCgpa) {
                minCgpa = cg;
                lowName = name;
            }
        }

        System.out.println("\nStudent Details:");
        for (Student st : s)
            st.display();

        System.out.println("Student with lowest CGPA: " + lowName);
    }
}

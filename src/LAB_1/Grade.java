import java.util.Scanner;

class GradeCheck {
    int marks;

    GradeCheck(int marks) {
        this.marks = marks;
    }

    void findGrade() {
        if (marks >= 90)
            System.out.println("Grade: O");
        else if (marks >= 80)
            System.out.println("Grade: E");
        else if (marks >= 70)
            System.out.println("Grade: A");
        else if (marks >= 60)
            System.out.println("Grade: B");
        else if (marks >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }
}

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        GradeCheck g = new GradeCheck(marks);
        g.findGrade();

        sc.close();
    }
}


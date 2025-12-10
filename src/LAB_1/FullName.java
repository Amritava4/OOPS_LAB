import java.util.*;

class NameFormat {
    String first;
    String last;

    NameFormat(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void display() {
        System.out.println(last + " " + first);
    }
}

public class FullName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = sc.nextLine();

        System.out.print("Enter last name: ");
        String last = sc.nextLine();

        NameFormat nf = new NameFormat(first, last);
        nf.display();

        sc.close();
    }
}

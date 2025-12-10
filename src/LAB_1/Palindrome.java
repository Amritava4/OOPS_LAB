import java.util.Scanner;

class PalindromeCheck {
    int num;

    PalindromeCheck(int num) {
        this.num = num;
    }

    void check() {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        if (original == reversed)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is NOT a Palindrome");
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        PalindromeCheck p = new PalindromeCheck(num);
        p.check();

        sc.close();
    }
}


package DAY_3;

import java.util.Scanner;

class EvenOddChecker {
    int[] numbers;

    EvenOddChecker(int[] numbers) {
        this.numbers = numbers;
    }

    void countEvenOdd() {
        int even = 0;
        int odd = 0;
        for (int n : numbers) {
            if (n % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
    }
}

public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        EvenOddChecker checker = new EvenOddChecker(arr);
        checker.countEvenOdd();

        sc.close();
    }
}

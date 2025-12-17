package DAY_3;

import java.util.Scanner;

class Rectangle1 {
    int length, breadth;

    Rectangle1() {
        length = 0;
        breadth = 0;
    }

    Rectangle1(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class RectangleDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();

        Rectangle r = new Rectangle(l, b);
        r.area();
    }
}

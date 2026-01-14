package DAY_3;

import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate constructor called");
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

class box extends Plate {
    double height;

    box(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Box constructor called");
    }

    void display() {
        super.display();
        System.out.println("Height: " + height);
    }
}

class WoodBox extends box {
    double thick;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thick = t;
        System.out.println("WoodBox constructor called");
    }

    void display() {
        super.display();
        System.out.println("Thickness: " + thick);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, width, height and thickness:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble();

        WoodBox wb = new WoodBox(l, w, h, t);

        System.out.println("\nDisplaying dimensions:");
        wb.display();

        sc.close();
    }
}

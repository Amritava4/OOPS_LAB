package DAY_3;

import java.util.Scanner;

class Plastic2D {
    double length, width;

    Plastic2D(double l, double w) {
        length = l;
        width = w;
    }

    void cost() {
        double area = length * width;
        double cost = area * 40;
        System.out.println("Cost of plastic sheet = Rs " + cost);
    }
}

class Plastic3D extends Plastic2D {
    double height;

    Plastic3D(double l, double w, double h) {
        super(l, w);
        height = h;
    }

    void cost() {
        double volume = length * width * height;
        double cost = volume * 60;
        System.out.println("Cost of plastic box = Rs " + cost);
    }
}

class PlasticDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and width for sheet:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();


        Plastic2D sheet = new Plastic2D(l, w);
        sheet.cost();
        Plastic3D box = new Plastic3D(l, w, h);
        box.cost();
    }
}

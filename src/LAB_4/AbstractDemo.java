package DAY_4;

abstract class Student {
    int rollNo;
    long regNo;

    void getinput(int r, long reg) {
        rollNo = r;
        regNo = reg;
    }

    abstract void course();
}

class Kiitian extends Student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Kiitian k = new Kiitian();
        k.getinput(2205180, 1234567890L);

        System.out.println("Rollno - " + k.rollNo);
        System.out.println("Registration no - " + k.regNo);
        k.course();
    }
}

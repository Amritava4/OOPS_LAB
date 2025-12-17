package DAY_2;

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    void display() {
        System.out.println("Number of objects created: " + count);
    }
}

class CounterDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c3.display();
    }
}

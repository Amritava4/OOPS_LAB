package DAY_5;

interface Motor{
    int capacity = 29;
    void run();
    void consume();
}
class washingMachine implements Motor{
    public void run(){
        System.out.println("Motor running");
    }
    public void consume(){
        System.out.println("Motor is consuming power");
    }
}
public class prog_5_1 {
    public static void main(String[] args){
        washingMachine a = new washingMachine();
        System.out.println("Capacity of the motor is-" + a.capacity);
    }
}
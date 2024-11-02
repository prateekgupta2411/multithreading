public class Test {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
        World world = new World(); // New state
        Thread t1 = new Thread(world); // RUNNABLE State abhi chala nhi h
        t1.start();
        for (; ;) {
            System.out.println("Hello");
        }
    }
}
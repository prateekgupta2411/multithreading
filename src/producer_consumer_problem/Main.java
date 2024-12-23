package producer_consumer_problem;

public class Main {
    public static void main(String[] args) {
        Company c = new Company();
        Producer p = new Producer(c);
        Consumer c1 = new Consumer(c);
        p.start();
        c1.start();


    }
}

package producer_consumer_problem;

public class Consumer extends Thread {

    Company c;
    Consumer(Company c){
       this.c= c;
    }
    public void run(){
        while (true){
            try {
                this.c.consumeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

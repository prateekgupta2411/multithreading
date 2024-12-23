package producer_consumer_problem;

public class Producer extends Thread{

    Company c;
    Producer(Company c){
        this.c = c;
    }
    public void run(){
        int i =1;
        while (true){
            try {
                this.c.produceItem(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }

    }
}

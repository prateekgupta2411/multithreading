// Creating our thread using runnable interface
public class MyThread implements Runnable  {

    @Override
    public void run() {
        // task for thread
        for(int i=1;i<=10;i++){
            System.out.println("The value of i is : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        // create object of MyThread class
        MyThread t1 = new MyThread();
        Thread t = new Thread(t1);
        // create object of MyAnotherThread
        MyAnotherThread at = new MyAnotherThread();
        t.start();
        at.start();

    }
}

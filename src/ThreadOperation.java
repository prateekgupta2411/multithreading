class UserThread extends Thread{
    public void run(){
        // task for thread
        System.out.println("this is user defined thread");
    }
}

public class ThreadOperation {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program Started");

        int a =10; int b = 20;
        System.out.println(a+b);
        // Current Thread
        System.out.println("Current running Thread is : " + Thread.currentThread().getName());

        // Set Thread
        Thread.currentThread().setName("Prateek");
        System.out.println("Current running Thread is changed : " +Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getId());

        //going to start user define thread

        System.out.println("Program End");
        UserThread t1 = new UserThread();
        t1.start();

    }
}

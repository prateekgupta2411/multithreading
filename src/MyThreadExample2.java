public class MyThreadExample2 extends Thread {

    MyThreadExample2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String a = "";
            for (int j = 0; j < 100000; j++) {
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count : "+ i);
            try {
                Thread.sleep(100);
            }catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        MyThreadExample2 l = new MyThreadExample2("Low Priority Thread");
        MyThreadExample2 m = new MyThreadExample2("Medium Priority Thread");
        MyThreadExample2 h = new MyThreadExample2("High Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}

// start run sleep join  setPriority
class A implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println("Thread A: " + i);
            // try {
            //     Thread.sleep(10);
            // } catch (Exception e) {
            //     // TODO: handle exception
            //     e.printStackTrace();
            // }
        }
    }
}

class B implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println("Thread B: " + i);
            //  try {
            //     Thread.sleep(10);
            // } catch (Exception e) {
            //     // TODO: handle exception
            //     e.printStackTrace();
            // }
        }
    }
}


public class threads1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());

        t1.start();
        t2.start();
    }
}

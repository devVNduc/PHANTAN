// public class HelloWorldThread extends Thread {
//     private int id;

//     public HelloWorldThread(int _id) {
//         id = _id;
//     }

//     @Override
//     public void run() {
//         System.out.print("T-" + id + " ");
//     }

//     public static void main(String[] args) throws InterruptedException {
//         HelloWorldThread t1 = new HelloWorldThread(1);
//         HelloWorldThread t2 = new HelloWorldThread(2);
//         t2.join();
//         t1.start();
//         t2.start();
//          System.out.print(" T-m ");
//         System.out.print(" T-n ");
        
//     }
// }
public class HelloWorldThread extends Thread {
    static int x = 0;
    static int y = 0;

    public static int op1() {
        x = 1;
        return y;
    }
    
    public static int op2() {
        y = 2;
        return 3 * x;
    }
    
    public static void main(String[] args) throws InterruptedException {
        HelloWorldThread t1 = new HelloWorldThread();
        HelloWorldThread t2 = new HelloWorldThread();
        t1.start();
        t2.start();
        HelloWorldThread.op1();
        HelloWorldThread.op2();

    }

}
    
class ThreadDemo implements Runnable {
   Thread t;
   ThreadDemo() {
      t = new Thread(this, "Thread");
      System.out.println("Child thread: " + t);
      t.start();
   }
   public void run() {
      try {
         System.out.println("Child Thread");
         Thread.sleep(50);
      } catch (InterruptedException e) {
         System.out.println("The child thread is interrupted.");
      }
      System.out.println("Exiting the child thread");
   }
}
public class Demo {
   public static void main(String args[]) {
      new ThreadDemo();
      try {
         System.out.println("Main Thread");
         Thread.sleep(100);
      } catch (InterruptedException e) {
         System.out.println("The Main thread is interrupted");
      }
      System.out.println("Exiting the Main thread");
   }
}

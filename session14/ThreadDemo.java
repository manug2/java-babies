public class ThreadDemo {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Welcome to Thread demo.");


    Thread t1 = new Thread(new MyRunnable1());
    Thread t2 = new Thread(new MyRunnable2());

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println("Thread demo is now complete.");
  }

  static class MyRunnable1 implements Runnable {

    public void run() {

      System.out.println("My runnable 1 has started execution..");
      long sum = 0;
      for (int i = 0; i < 1_000_000_000; i++) {
        sum += i;
      }
      System.out.println("My runnable 1 has completed execution, the sum is " + sum);
    }
  }

  static class MyRunnable2 implements Runnable {

    public void run() {

      System.out.println("My runnable 2 has started execution.");
      System.out.println("My runnable 2 has completed execution.");
    }
 
  }

}

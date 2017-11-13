package module8.practice;

public class ThreadInformation {
    static Runnable task = new Runnable() {
        @Override
        public void run() {
            System.out.print("Name of thread: " + Thread.currentThread().getName() + "\t");
            System.out.print("ID of thread: " + Thread.currentThread().getId() + "\t");

            if(Thread.currentThread().getId() == 1)
                System.out.println("This is main thread");
            else
                System.out.println("This is not main thread");

        }
    };

    public static void main(String[] args) {


        Thread thread = new Thread(task);
        thread.start();

        Thread thread1 = new Thread(task);
        thread1.start();

        Thread thread2 = new Thread(task);
        thread2.start();

        task.run();
    }
}

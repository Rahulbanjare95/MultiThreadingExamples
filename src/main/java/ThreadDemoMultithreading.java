public class ThreadDemoMultithreading {
    public static void main(String[] args) {
        Runnable tableOfTwo = new TableOfTwo();
        Runnable tableOfThree = new TableOfThree();

        Thread t1 = new Thread(tableOfTwo);
        Thread t2 = new Thread(tableOfThree);

        t1.start();
        t2.start();
    }
}

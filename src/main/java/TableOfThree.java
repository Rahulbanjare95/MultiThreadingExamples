public class TableOfThree implements Runnable {
    // we make run method to override run in  thread class which is called by start
    public void run(){
        int i;
        for ( i = 1; i <= 5 ; i++)
        System.out.println("3 X "+i+" = "+(3 * i));
        try{ Thread.sleep(1000);} catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

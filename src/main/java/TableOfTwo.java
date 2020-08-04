
public class TableOfTwo implements Runnable{

    public void run(){
        int i;
        for ( i = 1; i <= 5 ; i++)
        System.out.println("2 X "+i+" = "+(2*i));
        try{ Thread.sleep(1000);} catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

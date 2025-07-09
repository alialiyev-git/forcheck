import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception{
        MyRunnable1 runnable1 = new MyRunnable1();
        MyRunnable2 runnable2 = new MyRunnable2();

        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(runnable1);
        es.submit(runnable2);

        es.shutdown();
        es.awaitTermination(1,TimeUnit.MINUTES);



    }
}
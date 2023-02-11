import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Author: MZ
 * @Date: 2023/2/9 23:28
 * @Description:
 */
public class MyThread implements Callable{

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        FutureTask futureTask = new FutureTask(myThread);
        Thread thread = new Thread(futureTask);
        thread.start();

    }

    @Override
    public Object call() throws Exception {

        System.out.println("nmsl");

        return null;
    }



}


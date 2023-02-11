import sun.java2d.pipe.SpanIterator;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: MZ
 * @Date: 2023/2/10 10:31
 * @Description:
 */
public class LockTest {

    static Integer i=100;


    public static void main(String[] args) {
        Windows windows = new Windows();
        Thread thread1 = new Thread(windows);
        Thread thread2 = new Thread(windows);
        Thread thread3 = new Thread(windows);

        thread1.start();
        thread2.start();
        thread3.start();
        String k=i.toString();
        System.out.println(k.getClass());

    }
}



class Windows implements Runnable{
    private ReentrantLock lock=new ReentrantLock();
    private int ticket =100;


    @Override
    public void run() {
        while (true){
           try {

              lock.lock();
               if (ticket > 0) {
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {

                   }
                   System.out.println(Thread.currentThread().getName() + "票号为" + ticket);
                   ticket--;
               }else {
                   break;
               }
           }finally {
               lock.unlock();
           }
        }
    }
}

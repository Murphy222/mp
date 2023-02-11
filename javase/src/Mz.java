/**
 * @Author: MZ
 * @Date: 2023/2/9 22:33
 * @Description:
 */
public class Mz extends Thread {
    public static void main(String[] args) {
        Mz mz = new Mz();
        mz.start();
        System.out.println(Thread.currentThread().getName());


    }



    @Override
    public void run() {

       for (int i=0;i<100;i++){
           System.out.println(i+this.getName());
       }

    }
}

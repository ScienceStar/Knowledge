import thread.CountDownLatchThread;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountDownLatchDemo
 * @Description: TODO
 * @Author lxc
 * @Date 2021/3/16 14:51
 * @Version V1.0
 **/
public class CountDownLatchDemo {

    public static CountDownLatch countDownLatch= new CountDownLatch(4);

    public static void main(String[] args) {
        Thread threadA = new CountDownLatchThread();
        Thread threadB = new CountDownLatchThread();
        Thread threadC = new CountDownLatchThread();
        Thread threadD = new CountDownLatchThread();

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread:"+Thread.currentThread().getName()+" :"+System.currentTimeMillis());
    }
}

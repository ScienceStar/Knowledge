package thread;

import main.CountDownLatchDemo;

/**
 * @ClassName CountDownLatchThread
 * @Description: TODO CountDownLatch线程
 * @Author lxc
 * @Date 2021/3/16 14:48
 * @Version V1.0
 **/
public class CountDownLatchThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" "+System.currentTimeMillis());
            CountDownLatchDemo.countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

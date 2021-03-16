package thread;

import main.CycleBarrierDemo;

import java.util.concurrent.BrokenBarrierException;

/**
 * @ClassName CycleBarrierThread
 * @Description: TODO
 * @Author lxc
 * @Date 2021/3/16 15:00
 * @Version V1.0
 **/
public class CycleBarrierThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName()+" :"+System.currentTimeMillis());

            try {
                CycleBarrierDemo.cyclicBarrier.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

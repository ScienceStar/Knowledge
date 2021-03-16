package main;

import thread.CycleBarrierThread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName CycleBarrierDemo
 * @Description: TODO cycleBarrier 实现多线程计数
 * @Author lxc
 * @Date 2021/3/16 15:02
 * @Version V1.0
 **/
public class CycleBarrierDemo {

    public static CyclicBarrier cyclicBarrier = new CyclicBarrier(5);

    public static void main(String[] args) {
        Thread threadA = new CycleBarrierThread();
        Thread threadB = new CycleBarrierThread();
        Thread threadC = new CycleBarrierThread();
        Thread threadD = new CycleBarrierThread();

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        try {
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread:"+Thread.currentThread().getName()+" :"+System.currentTimeMillis());
    }
}

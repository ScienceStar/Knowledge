import thread.JoinThread;

/**
 * @ClassName JoinDemo
 * @Description: TODO 多线程测试
 * @Author lxc
 * @Date 2021/3/16 14:39
 * @Version V1.0
 **/
public class JoinDemo {

    public static void main(String[] args) {
        Thread threadA = new JoinThread();
        Thread threadB = new JoinThread();
        Thread threadC = new JoinThread();
        Thread threadD = new JoinThread();

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();

        try {
            threadA.join();
            threadB.join();
            threadC.join();
            threadD.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread:"+Thread.currentThread().getName()+" "+System.currentTimeMillis());
    }
}

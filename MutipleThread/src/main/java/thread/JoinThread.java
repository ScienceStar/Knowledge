package thread;

/**
 * @ClassName JoinThread
 * @Description: TODO
 * @Author lxc
 * @Date 2021/3/16 14:35
 * @Version V1.0
 **/
public class JoinThread extends Thread{

    @Override
    public void run(){
        try {
        Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" "+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

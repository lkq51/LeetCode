package test;

/**
 * Created by lkq on 2017/3/24.
 */
public class Counter {
    public volatile static int count = 0;
    public static void inc(){
        try {
            Thread.sleep(1);
        }catch (InterruptedException e){
        }
        count ++;
    }

    public static void main(String[] args) {
        //同时启动1000个线程，去进行i++计算，看看实际结果
        for (int i = 0; i < 1000; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Counter.inc();
                }
            }).start();
        }
        //这里每次运行的值都可能有所不同，可能不为1000
        System.out.println("运行结果:Counter.count = " + Counter.count);
    }
}

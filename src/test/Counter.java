package test;

/**
 * Created by lkq on 2017/3/24.
 */
public class Counter {
    public volatile static int count = 0;
    public static void inc(){
        /*try {
            Thread.sleep(1);
        }catch (InterruptedException e){
        }*/
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
//对于volatile修饰的变量，jvm只是保证从主内存加载到线程工作内存的值是最新的
//假如线程1，线程2在进行read，load操作中，发现主内存中count的值都是5，那么都会加载这个最新的值
//在线程1堆count进行修改之后，会write到主内存中，内存中的count变量就会变成6
//线程2由于已经进行read，load操作，在进行运算之后，也会更新主内存count的变量值为6
//导致两个线程即使用了volatile关键字修饰之后，还是会存在并发的情况
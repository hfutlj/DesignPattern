/**
 * Created by hfutlj  on 2018/5/8.
 * 双重校验锁懒汉模式
 * 线程安全
 * 可以懒加载
 */
public class Singleton4 {

    private static Singleton4 singleton4;

    public static Singleton4 getInstance(){

        //  第一重锁：由于此判断的结果大多数为false，且synchronized加锁耗费性能
        //            故此判断的意义在与不让每一次调用此方法都去加锁
        if(singleton4 == null){
            synchronized (Singleton4.class){
                // 第二重锁：加锁后判断，保证不会实例化多次
                if(singleton4 == null){
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}

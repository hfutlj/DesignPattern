/**
 * Created by hfutlj  on 2018/5/8.
 * 单校验加锁懒汉模式
 * 线程安全
 * 可以懒加载
 */
public class Singleton3 {

    private static Singleton3 singleton3;

    public synchronized static Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}

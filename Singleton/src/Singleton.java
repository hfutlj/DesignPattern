/**
 * Created by hfutlj  on 2018/5/8.
 * 饿汉模式
 * 线程安全
 * 不能懒加载
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}

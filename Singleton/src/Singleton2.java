/**
 * Created by hfutlj  on 2018/5/8.
 * 饿汉模式
 * 线程不安全
 * 可以懒加载
 */
public class Singleton2 {

    private static Singleton2 singleton2;

    public static Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}

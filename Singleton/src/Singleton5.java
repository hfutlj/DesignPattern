/**
 * Created by hfutlj  on 2018/5/8.
 * 静态内部类
 * 线程安全
 * 可以懒加载
 */
public class Singleton5 {
    // 使用静态内部类的方式可以让Singleton5Handler
    // 在本类被加载时初始化，保证线程安全
    // 但其中的singleton5属性在没被显示调用前
    // 不会初始化，由此保证懒加载
    private static class Singleton5Handler {
        public static Singleton5 singleton5 = new Singleton5();
    }

    public static Singleton5 getInstance(){
        return Singleton5Handler.singleton5;
    }


}

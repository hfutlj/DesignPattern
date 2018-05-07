package cn.lj.observer1;

/**
 * Created by hfutlj  on 2018/5/7.
 */
public class ObserverB {

    public void bMethod(String s){
        System.out.println("观察者B触发的方法名为bMethod，参数类型为String，参数为：" + s);
    }
}

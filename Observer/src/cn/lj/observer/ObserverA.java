package cn.lj.observer;

/**
 * Created by hfutlj  on 2018/5/6.
 */
public class ObserverA implements Observer {
    @Override
    public void event() {
        System.out.println("观察者A收到信息");
    }
}

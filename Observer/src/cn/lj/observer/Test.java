package cn.lj.observer;

/**
 * Created by hfutlj  on 2018/5/6.
 * 测试类，输出：
 * 被观察者的modify方法被调用会被观察者监听到
 * 观察者A收到信息
 */
public class Test {
    public static void main(String[] args) {
        Observer observer = new ObserverA();

        Subject subject = new Subject();
        subject.addObserver(observer);

        subject.modify();
    }
}

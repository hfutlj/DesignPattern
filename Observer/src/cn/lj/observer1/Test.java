package cn.lj.observer1;

/**
 * Created by hfutlj  on 2018/5/7.
 * 测试类，输出为：
 * 调用我的update方法会被我的所有观察者发现
 * 观察者A触发的方法名为： aMethod，无参数类型
 * 观察者B触发的方法名为bMethod，参数类型为String，参数为：123123
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = new Subject();

        ObserverA observerA = new ObserverA();
        Event event1 = new Event(observerA, "aMethod", null);
        subject.eventHandler.addEvent(event1);

        ObserverB observerB = new ObserverB();
        Object[] params = {"123123"};
        Event event2 = new Event(observerB, "bMethod", params);
        subject.eventHandler.addEvent(event2);

        subject.update();
    }
}

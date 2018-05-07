package cn.lj.observer1;

/**
 * Created by hfutlj  on 2018/5/7.
 * 被观察者，维护的EventHandler类似于观察者链表
 */
public class Subject {

    public EventHandler eventHandler = new EventHandler();

    public void update(){
        System.out.println("调用我的update方法会被我的所有观察者发现");
        eventHandler.invokeAll();
    }
}

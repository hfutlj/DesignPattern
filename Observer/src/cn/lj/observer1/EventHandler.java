package cn.lj.observer1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hfutlj  on 2018/5/7.
 * 被观察者内维护一个EventHandler等同于普通写法中维护的观察者链表
 * 为了模仿C#的事件委托写成此形式
 */
public class EventHandler {

    private List<Event> list = new LinkedList<Event>();

    public void addEvent(Event event){
        list.add(event);
    }

    public void removeEvent(Event event){
        list.remove(event);
    }

    public void invokeAll(){
        list.forEach(event -> event.invoke());
    }

    public void clean(){
        list.clear();
    }



}

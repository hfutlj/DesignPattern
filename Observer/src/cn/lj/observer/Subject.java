package cn.lj.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hfutlj  on 2018/5/6.
 * 被观察的对象，维护一个观察者引用列表，当modify事件发生时通知观察者
 */
public class Subject {

    List<Observer> list = new LinkedList<>();

    public void addObserver(Observer observer){
        list.add(observer);
    }

    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer: list) {
            observer.event();
        }
    }

    public void modify(){
        System.out.println("被观察者的modify方法被调用会被观察者监听到");
        notifyObserver();
    }
}

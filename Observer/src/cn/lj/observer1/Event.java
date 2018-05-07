package cn.lj.observer1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by hfutlj  on 2018/5/7.
 * event类是将观察者要出发的方法包装成统一的形式的类，方便加入到eventHandler进行统一处理
 */
public class Event {
    // 被触发的类
    private Object object;

    // 被触发的方法
    private String methodName;

    // 被触发的方法参数
    private Object[] args;

    public Event(Object object, String methodName, Object[] args) {
        this.object = object;
        this.methodName = methodName;
        this.args = args;
    }

    /**
     * 触发观察者的方法
     */
    public void invoke() {
        try {
            Method method = object.getClass().getMethod(methodName,getParamType());
            method.invoke(object,args);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.err.print(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 获取参数类型
     * @return
     */
    public Class<?>[] getParamType() {
        if (args == null || args.length == 0) {
            return null;
        }
        Class<?>[] classes = new Class<?>[args.length];
        for(int i=0; i<args.length; i++){
            classes[i] = args[i].getClass();
        }
        return classes;
    }
}

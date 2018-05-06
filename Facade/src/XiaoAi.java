/**
 * Created by hfutlj  on 2018/5/6.
 * 外观类--小爱同学，拥有回家和离家方法，
 * 这两个方法封装了对电视、空调等电器的操作
 * 优点是可以直接使用小爱同学实现一系列操作
 * 缺点是过于死板，有新的操作必须修改此类
 */
public class XiaoAi {
    private Television television;
    private AirConditioner airConditioner;
    private  Light light;

    public XiaoAi() {
        this.television = new Television();
        this.airConditioner = new AirConditioner();
        this.light = new Light();
    }

    public void goHome(){
        light.on();
        airConditioner.on();
        television.on();
    }

    public void leaveHome(){
        television.off();
        airConditioner.off();
        light.off();
    }
}

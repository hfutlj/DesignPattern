/**
 * Created by hfutlj  on 2018/5/5.
 * 模板方法模式，抽象模板，
 * 定义了子类都必须重写的操作
 *       和不许重写的共有操作
 */
public abstract class AbstractTemplate {

    public final void commonMethod(){
        System.out.println("这是大家都有的操作，且不准重写");
        diffMethod();
    }

    /**
     * 这是子类必须重写的操作
     */
    public abstract void diffMethod();
}

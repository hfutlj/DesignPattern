/**
 * Created by hfutlj  on 2018/5/3.
 * 使用策略的类，维护一个strategy的引用，使得
 * 其可以传入任何实现strategy接口的类
 */
public class Context {

    public Strategy strategy;

    /**
     * 通过构造方法传入不同的策略
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        strategy.execute();
    }


}

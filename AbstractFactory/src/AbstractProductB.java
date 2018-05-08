/**
 * Created by hfutlj  on 2018/5/8.
 * 抽象产品B
 */
public abstract class AbstractProductB {

    public String factory;
    abstract void execute();

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}

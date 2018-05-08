/**
 * Created by hfutlj  on 2018/5/8.
 * 抽象产品A
 */
public abstract class AbstractProductA {

    public String factory;
    abstract void show();

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }
}

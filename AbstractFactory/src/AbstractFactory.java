/**
 * Created by hfutlj  on 2018/5/8.
 * 抽象工厂与工厂方法模式的区别为，抽象工厂模式允许工厂中生产多个产品
 */
public abstract class AbstractFactory {

    abstract AbstractProductA createProductA();

    abstract AbstractProductB createProductB();
}

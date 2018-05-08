/**
 * Created by hfutlj  on 2018/5/8.
 * 实际1号工厂
 */
public class Factory1 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        ProductA productA = new ProductA();
        productA.setFactory("1号工厂");
        return productA;
    }

    @Override
    AbstractProductB createProductB() {
        ProductB productB = new ProductB();
        productB.setFactory("1号工厂");
        return productB;
    }
}

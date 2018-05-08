/**
 * Created by hfutlj  on 2018/5/8.
 * 实际2号工厂
 */
public class Factory2 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        ProductA productA = new ProductA();
        productA.setFactory("2号工厂");
        return productA;
    }

    @Override
    AbstractProductB createProductB() {
        ProductB productB = new ProductB();
        productB.setFactory("2号工厂");
        return productB;
    }
}

/**
 * Created by hfutlj  on 2018/5/8.
 * 测试类，输出：
 * 1号工厂生成的A产品
 * 1号工厂生产的B产品
 * 2号工厂生成的A产品
 * 2号工厂生产的B产品
 */
public class Test {

    public static void main(String[] args) {
        // 使用抽象工厂获取实际工厂
        AbstractFactory factory = new Factory1();

        // 生产产品
        factory.createProductA().show();
        factory.createProductB().execute();

        // 切换工厂
        factory = new Factory2();

        // 生产新产品
        factory.createProductA().show();
        factory.createProductB().execute();
    }
}

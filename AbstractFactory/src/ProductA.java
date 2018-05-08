/**
 * Created by hfutlj  on 2018/5/8.
 * 实际A类产品
 */
public  class ProductA extends AbstractProductA {
    @Override
    void show() {
        System.out.println(factory + "生成的A产品");
    }
}

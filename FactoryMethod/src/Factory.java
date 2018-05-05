/**
 * Created by hfutlj  on 2018/5/5.
 * 抽象工厂类
 */
public interface Factory {

    /**
     * 抽象工厂将返回指定工厂的判断操作由工厂内部移到客户端中
     * 添加新的产品只需要添加新的产品工厂实现类，不需要修改本类，
     * 体现了开闭原则
     * @return 具体产品工厂
     */
    Operator createOperation();

}

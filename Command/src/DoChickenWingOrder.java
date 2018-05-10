/**
 * Created by hfutlj  on 2018/5/10.
 * 烤鸡翅命令
 */
public class DoChickenWingOrder extends AbstractOrder{

    // 让具体的厨师去执行命令
    @Override
    public void executeOrder() {
        cook.doChickenWing();
    }
}

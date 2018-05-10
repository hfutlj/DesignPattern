/**
 * Created by hfutlj  on 2018/5/10.
 * 烤鱼命令
 */
public class DoFishOrder extends AbstractOrder{
    // 让具体厨师去烤鱼
    @Override
    public void executeOrder() {
        cook.doFish();
    }
}

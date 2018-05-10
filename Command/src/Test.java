/**
 * Created by hfutlj  on 2018/5/10.
 * 测试类，输出为：
 * 做烤鸡翅
 * 做烤鱼
 * 做烤鱼
 */
public class Test {

    public static void main(String[] args) {
        // 开店先请厨师
        Cook cook = new Cook();

        // 创建两条命令，即提供两种菜供顾客点
        AbstractOrder chicken = new DoChickenWingOrder();
        AbstractOrder fish = new DoFishOrder();
        //这两门菜都由刚请的厨师来做
        chicken.setCook(cook);
        fish.setCook(cook);

        // 招一个服务员传达命令
        Waiter waiter = new Waiter();

        // 开张，客户点菜
        waiter.addOrder(chicken);
        waiter.addOrder(fish);
        waiter.addOrder(fish);

        waiter.executeOrder();
    }
}

/**
 * Created by hfutlj  on 2018/5/3.
 * 测试类，输出为：
 *   策略一的实现
 *   策略二的实现
 */
public class Test {

    public static void main(String[] args) {
        Strategy strategy = new Strategy1();
        Context context = new Context(strategy);
        context.execute();

        strategy = new Strategy2();
        context = new Context(strategy);
        context.execute();
    }
}

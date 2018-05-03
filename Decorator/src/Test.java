/**
 * 测试类，输出结果为：
 *   装饰类 2
 *   装饰类 1
 *   被装饰对象
 */
public class Test {
    public static void main(String[] args) {
        CurrentComponent currentComponent = new CurrentComponent("被装饰对象");
        Decorator1 decorator1 = new Decorator1(currentComponent);
        Decorator2 decorator2 = new Decorator2(decorator1);

        decorator2.show();
    }
}

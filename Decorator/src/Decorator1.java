/**
 * 实际装饰类1
 */
public class Decorator1 extends AbstractDecorator {


    public Decorator1(Component component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.println("装饰类 1");
        super.show();
    }
}

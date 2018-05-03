/**
 * 具体装饰类2
 */
public class Decorator2 extends  AbstractDecorator{

    public Decorator2(Component component){
        super(component);
    }

    @Override
    public void show() {
        System.out.println("装饰类 2");
        super.show();
    }
}

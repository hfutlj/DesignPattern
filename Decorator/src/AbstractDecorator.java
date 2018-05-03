/**
 * 装饰类的基类
 */
public abstract class AbstractDecorator implements Component{

    Component component;

    public AbstractDecorator(Component component){
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }
}

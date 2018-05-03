/**
 * 被装饰的对象
 */
public class CurrentComponent implements Component{
    private String name;

    CurrentComponent(String name){
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(name);
    }
}

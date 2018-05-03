/**
 * Created by hfutlj  on 2018/5/3.
 * 真实的执行类
 */
public class RealSubject implements Subject{
    @Override
    public void execute() {
        System.out.println("真实执行类执行操作");
    }
}

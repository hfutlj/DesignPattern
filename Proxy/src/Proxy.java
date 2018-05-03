/**
 * Created by hfutlj  on 2018/5/3.
 * 代理类，维护一个实际类的引用
 * 代理类也实现了Subject接口，所以在realSubject存在的场合都可以使用代理类来替代，
 * 使客户端完全感觉不到代理的存在
 * execute的真正执行还是由realSubject来执行，但是代理类可以在这前后添加一些功能
 */
public class Proxy implements Subject{

    private RealSubject realSubject;

    @Override
    public void execute() {
        // 真实执行前插入内容，如权限验证等
        System.out.println("代理类在执行前插入内容...");

        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.execute();

        // 执行后插入内容，如记录log等
        System.out.println("代理类在执行后插入内容...");

    }
}

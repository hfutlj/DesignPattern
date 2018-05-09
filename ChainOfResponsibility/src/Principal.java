/**
 * Created by hfutlj  on 2018/5/9.
 * 高级处理者，校长。能批准所有假期
 */
public class Principal extends AbstractManager {
    @Override
    public void handle(int i) {
        System.out.println("我是校长，我批准你" + i + "天假");
    }
}

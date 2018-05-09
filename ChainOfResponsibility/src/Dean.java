/**
 * Created by hfutlj  on 2018/5/9.
 * 中级处理者，教导主任，能批准7天以内的假期
 * 上级为校长
 */
public class Dean extends AbstractManager {
    @Override
    public void handle(int i) {
        if (i <= 7) {
            System.out.println("我是教导主任，我批准你" + i + "天假");
        } else {
            sendNext(i);
        }
    }
}

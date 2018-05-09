/**
 * Created by hfutlj  on 2018/5/9.
 * 初级处理者：班主任，能批准处理3天以内的请假
 * 上级为教导主任
 */
public class Headmaster extends AbstractManager {
    @Override
    public void handle(int i) {
        if(i <= 3){
            System.out.println("我是班主任，我批准你" + i + "天假");
        }else{
            sendNext(i);
        }
    }
}

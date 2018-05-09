/**
 * Created by hfutlj  on 2018/5/9.
 * 测试类，输出为：
 * 我是班主任，我批准你1天假
 * =======================
 * 我是校长，我批准你8天假
 */
public class Test {

    public static void main(String[] args) {
        AbstractManager headmaster = new Headmaster();
        AbstractManager dean = new Dean();
        AbstractManager principal = new Principal();

        // 设置班主任上司为教导主任，教导主任上司为校长
        headmaster.setNextManager(dean);
        dean.setNextManager(principal);

        // 班主任收到1天请假的请求时
        headmaster.handle(1);

        System.out.println("=======================");

        // 班主任收到8天请假时
        headmaster.handle(8);
    }
}

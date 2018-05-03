/**
 * Created by hfutlj  on 2018/5/3.
 * 测试类，输出为：
 *   代理类在执行前插入内容...
 *   真实执行类执行操作
 *   代理类在执行后插入内容...
 */
public class Test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.execute();
    }
}

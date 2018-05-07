/**
 * Created by hfutlj  on 2018/5/7.
 * 测试类，输出：
 * 安装宏碁主板
 * 安装corei7 CPU
 * 安装希捷硬盘
 * Computer{board='安装宏碁主板', HD='安装希捷硬盘', CPU='安装corei7 CPU'}
 */
public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        director.buildProduct();
        System.out.println(director.getProduct());
    }
}

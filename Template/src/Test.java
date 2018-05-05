
/**
 * Created by hfutlj  on 2018/5/5.
 * 测试类，输出：
 * 这是大家都有的操作，且不准重写
 * 我是具体类A，这是我特有的操作
 * =================================
 * 这是大家都有的操作，且不准重写
 * 我是具体类B，这是我特有的操作
 */
public class Test {

    public static void main(String[] args) {
        AbstractTemplate templateA = new ConcreateClassA();
        AbstractTemplate templateB = new ConcreateClassB();

        templateA.commonMethod();
        System.out.println("=================================");
        templateB.commonMethod();
    }
}

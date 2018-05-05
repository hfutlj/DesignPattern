/**
 * Created by hfutlj  on 2018/5/5.
 */
public class Test {

    public static void main(String[] args) {
        Factory factory = new AddFactory();
        Operator operator = factory.createOperation();

        System.out.println(operator.getResult(1, 2));

    }
}

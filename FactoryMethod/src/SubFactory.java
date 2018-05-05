/**
 * Created by hfutlj  on 2018/5/5.
 * 减法工厂
 */
public class SubFactory implements Factory {
    @Override
    public Operator createOperation() {
        return new SubOperator();
    }
}

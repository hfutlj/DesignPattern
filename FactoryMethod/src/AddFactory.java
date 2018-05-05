/**
 * Created by hfutlj  on 2018/5/5.
 */
public class AddFactory implements Factory {
    @Override
    public Operator createOperation() {
        return new AddOperator();
    }
}

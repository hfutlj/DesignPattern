/**
 * Created by hfutlj  on 2018/5/5.
 * 具体产品，加法计算类
 */
public class AddOperator implements Operator {
    @Override
    public double getResult(double a, double b) {
        return a+b;
    }
}

/**
 * 计算器
 */
public class Caculator {

    public double execute(String symbol , double a, double b) throws Exception {
        Operate operate = OperateFactory.getOperate(symbol);
        return operate.getResult(a, b);
    }
}

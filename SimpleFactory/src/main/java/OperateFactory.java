/**
 * 运算类创建工厂
 */
public class OperateFactory {
    public static Operate getOperate(String symbol) throws Exception {
        switch (symbol){
            case "+":
                return new AddOperate();
            case "-":
                return new SubOperate();
            case "*":
                return new MulOperate();
            case "/":
                return new DivOperate();
            default:
                throw new Exception("");

        }

    }
}

// 各运算类
class AddOperate implements Operate{
    public double getResult(double a, double b) {
        return a+b;
    }
}
class SubOperate implements Operate{
    public double getResult(double a, double b) {
        return a-b;
    }
}
class MulOperate implements Operate{
    public double getResult(double a, double b) {
        return a*b;
    }
}
class DivOperate implements Operate{
    public double getResult(double a, double b) throws Exception {
        if(b == 0)
            throw new Exception("除数不能为0");
        return a/b;
    }
}



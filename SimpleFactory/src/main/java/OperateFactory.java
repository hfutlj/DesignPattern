/**
 * 运算类创建工厂
 */
public class OperateFactory {
    /**
     *  简单工厂在创建产品时将判断分支写在工厂内部，要添加新产品必须修改
     *  本工厂类
     * @param symbol 判断条件
     * @return 具体产品
     */
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



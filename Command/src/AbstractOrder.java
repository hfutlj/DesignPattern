/**
 * Created by hfutlj  on 2018/5/10.
 * 抽象命令类，持有命令执行者引用
 * 定义命令执行内容病由子类实现
 */
public abstract class AbstractOrder {

    // 命令的执行者，可供客户改动，如客户指名要某个厨师来做
    public Cook cook;

    // 执行命令
    public abstract void executeOrder();

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }
}

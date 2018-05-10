import java.util.LinkedList;
import java.util.List;

/**
 * Created by hfutlj  on 2018/5/10.
 * 服务员，命令的传递者
 */
public class Waiter {

    // 服务员手里拿着点菜列表
    public List<AbstractOrder> orders = new LinkedList<>();

    // 添加命令，会在点菜单上添加
    // waiter在添加命令时可以做一些特殊操作，如记录日志或者判断命令是否合法等
    public void addOrder(AbstractOrder order){
        orders.add(order);
    }

    // 命令撤销
    public void cancelOrder(AbstractOrder order){
        orders.remove(order);
    }

    // 执行命令，会将菜单上的命令逐个交给所属厨师执行
    public void executeOrder(){
        orders.forEach(order -> {order.executeOrder();});
    }

}

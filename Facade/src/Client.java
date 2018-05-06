/**
 * Created by hfutlj  on 2018/5/6.
 */
public class Client {

    public static void main(String[] args) {
        // 直接操作小爱同学打开电视、灯、空调
        XiaoAi xiaoAi = new XiaoAi();
        xiaoAi.goHome();
        System.out.println("=========================");
        xiaoAi.leaveHome();
    }
}

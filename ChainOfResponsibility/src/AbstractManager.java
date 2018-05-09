/**
 * Created by hfutlj  on 2018/5/9.
 * 抽象管理者，持有上级管理者的引用，
 * 可以选择自己处理，也可以选择交给上级管理者处理
 */
public abstract class AbstractManager {
    public AbstractManager nextManager;

    public abstract void handle(int i);

    public final void sendNext(int i){
        nextManager.handle(i);
    }

    public AbstractManager getNextManager() {
        return nextManager;
    }

    public void setNextManager(AbstractManager nextManager) {
        this.nextManager = nextManager;
    }
}

/**
 * Created by hfutlj  on 2018/5/3.
 * 代理类与真实类的公共接口，使得在所有使用真实类的地方
 * 都可以使用代理类来代替
 */
public interface Subject {

    void execute();
}

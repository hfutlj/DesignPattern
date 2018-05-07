/**
 * Created by hfutlj  on 2018/5/7.
 * 建造者接口，统一产品建造的操作，但没定义这些操作的顺序；
 */
public interface Builder {
    void addCPU();
    void addBoard();
    void addHD();
    Computer getProduct();
}

/**
 * Created by hfutlj  on 2018/5/7.
 * 导演类，负责产品的装配顺序，但是不负责具体产品的建造
 */
public class Director {

    private Builder concreateBuilder = new ConcreateBuilder();

    /**
     * 规定builder的建造顺序
     */
    public void buildProduct(){
        concreateBuilder.addBoard();
        concreateBuilder.addCPU();
        concreateBuilder.addHD();
    }

    public Computer getProduct(){
        return concreateBuilder.getProduct();
    }

}

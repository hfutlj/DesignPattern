/**
 * Created by hfutlj  on 2018/5/7.
 */
public class ConcreateBuilder implements Builder {

    private Computer computer = new Computer();

    @Override
    public void addCPU() {
        System.out.println("安装corei7 CPU");
        computer.setCPU("安装corei7 CPU");
    }

    @Override
    public void addBoard() {
        System.out.println("安装宏碁主板");
        computer.setBoard("安装宏碁主板");
    }

    @Override
    public void addHD() {
        System.out.println("安装希捷硬盘");
        computer.setHD("安装希捷硬盘");
    }

    @Override
    public Computer getProduct() {
        return computer;
    }
}

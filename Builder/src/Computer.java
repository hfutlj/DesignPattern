/**
 * Created by hfutlj  on 2018/5/7.
 * 产品类
 */
public class Computer {

    private String board;
    private String HD;
    private String CPU;

    @Override
    public String toString() {
        return "Computer{" +
                "board='" + board + '\'' +
                ", HD='" + HD + '\'' +
                ", CPU='" + CPU + '\'' +
                '}';
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
}

/**
 * Created by hfutlj  on 2018/5/5.
 */
public class Test {

    public static void main(String[] args) {
        Caculator caculator = new Caculator();
        try {
            System.out.println(caculator.execute("+", 1, 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

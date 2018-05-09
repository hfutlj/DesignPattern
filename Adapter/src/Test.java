/**
 * Created by hfutlj  on 2018/5/9.
 */
public class Test {
    public static void main(String[] args) {
        TypeC typeC = new TypeC();
        USB usb = new Adapter(typeC);
        usb.uSBCharge();
    }
}

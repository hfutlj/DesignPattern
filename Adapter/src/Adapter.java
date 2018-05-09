/**
 * Created by hfutlj  on 2018/5/9.
 */
public class Adapter implements USB {
    private TypeC typeC;

    public Adapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void uSBCharge() {
        typeC.typeCCharge();
    }

    public TypeC getTypeC() {
        return typeC;
    }

    public void setTypeC(TypeC typeC) {
        this.typeC = typeC;
    }
}

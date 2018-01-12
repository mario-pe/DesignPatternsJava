package adapter;

public class AdapterIndyk implements Kaczkaable{

    Indyk indyk;

    public AdapterIndyk(Indyk indyk){
        this.indyk = indyk;
    }

    @Override
    public void kwacze() {
        indyk.gula();
    }

    @Override
    public void lata() {
        indyk.skacze();
    }
}

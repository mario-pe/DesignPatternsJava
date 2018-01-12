package adapter;

public class Kaczka implements Kaczkaable{

    @Override
    public void kwacze() {
        System.out.println("kwa kwa");
    }

    @Override
    public void lata() {
        System.out.println("latam");
    }
}

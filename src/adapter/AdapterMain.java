package adapter;

public class AdapterMain {

    public static void main(String[]args){

        Indyk indyk = new Indyk();
        Kaczka kaczka = new Kaczka();
        AdapterIndyk adapterIndyk = new AdapterIndyk(indyk);

        AdapterMain.testujeKaczke(adapterIndyk);
        AdapterMain.testujeKaczke(kaczka);

    }

    static void testujeKaczke(Kaczkaable kaczka){
        kaczka.kwacze();
        kaczka.lata();
    }

}

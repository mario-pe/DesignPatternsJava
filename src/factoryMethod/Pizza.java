package factoryMethod;

import java.util.ArrayList;

public abstract class Pizza {
    String ciasto;
    String nazwa;
    String sos;
    ArrayList dodatki = new ArrayList();

    public void piecz(){
        System.out.println("pieczenie");
    }

    public void pakuj(){
        System.out.println("pakowanie");
    }

    public String getNazwa(){
        return nazwa;
    }
}

package factoryMethod;

public class WloskaPizzeria extends Pizzeria {

    @Override
    public Pizza utworzPizze(String type) {
        if(type.equals("serowa")){
            return new WloskaSerowaPizza();
        }else if(type.equals("weganska")){
            return new WloskaWeganskaPizza();
        }
        else return null;
    }
}

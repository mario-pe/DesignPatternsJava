package factoryMethod;

public class AmerykanskaPizzeria extends Pizzeria {
    @Override
    public Pizza utworzPizze(String type) {
        if(type.equals("serowa")){
            return new AmerykanskaSerowaPizza();
        }else if(type.equals("weganska")){
            return new AmerykanskaWeganskaPizza();
        }
        else return null;
    }
}

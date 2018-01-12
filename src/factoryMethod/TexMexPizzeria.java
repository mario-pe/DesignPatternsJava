package factoryMethod;

public class TexMexPizzeria extends Pizzeria {

    @Override
    public Pizza utworzPizze(String type) {
        if(type.equals("serowa")){
            return new TexMexSerowaPizza();
        }else if(type.equals("weganska")){
            return new TexMexWeganskaPizza();
        }
        else return null;
    }
}

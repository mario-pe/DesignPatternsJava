package factoryMethod;

public abstract class Pizzeria {

    public Pizza zamowPizze(String type){

        Pizza pizza = utworzPizze(type);

        pizza.piecz();
        pizza.pakuj();

        return pizza;
    }

    public abstract Pizza utworzPizze(String type);
}

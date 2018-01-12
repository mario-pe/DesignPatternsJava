package abstractFactoryMethod;

import factoryMethod.AmerykanskaSerowaPizza;
import factoryMethod.AmerykanskaWeganskaPizza;
import factoryMethod.Pizza;

public class FabrykaPizzy extends AbstrakcyjnaFabrykaPizzy {

    @Override
    public Pizza utworzPizzeSerowa() {
        return new AmerykanskaSerowaPizza();
    }

    @Override
    public Pizza utworzPizzeWeganska() {
        return new AmerykanskaWeganskaPizza();
    }

    @Override
    public Pizza utworzPizzePeperoni() {
        return new AmerykanskaSerowaPizza();
    }
}

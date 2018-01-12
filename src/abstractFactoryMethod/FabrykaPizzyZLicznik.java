package abstractFactoryMethod;

import factoryMethod.Pizza;

public class FabrykaPizzyZLicznik extends AbstrakcyjnaFabrykaPizzy{

    @Override
    public Pizza utworzPizzeSerowa() {
//        return new LicznikPizzy(new AmerykanskaSerowaPizza());
        return null;
    }

    @Override
    public Pizza utworzPizzeWeganska() {
//        return new LicznikPizzy(new AmerykanskaWeganskaPizza());
        return null;
    }

    @Override
    public Pizza utworzPizzePeperoni() {
//        return new LicznikPizzy(new AmerykanskaSerowaPizza());
        return null;
    }
}

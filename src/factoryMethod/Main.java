package factoryMethod;

public class Main {
    public static void main(String[]args){
        Pizzeria wloskaPizzeria = new WloskaPizzeria();
        Pizzeria amerykanskaPizzeria = new AmerykanskaPizzeria();
        Pizzeria mexPizzeria = new TexMexPizzeria();

        Pizza pizza = amerykanskaPizzeria.zamowPizze("serowa");
        System.out.println("pizza amerykanska " + pizza.getNazwa());

        pizza = wloskaPizzeria.zamowPizze("weganska");
        System.out.println("pizza wloska " + pizza.getNazwa());

        pizza = mexPizzeria.zamowPizze("weganska");
        System.out.println("pizza mex " + pizza.getNazwa());
    }
}

package FactoryMethod.Shops;


import FactoryMethod.Coffee.*;
import FactoryMethod.Factory.*;

public class ItalianCoffeeShop extends CoffeeShop{

    private ItalianFactory factory;

    public ItalianCoffeeShop() {
        this.factory = new ItalianFactory();
    }

    @Override
    protected Coffee createCoffee(CoffeeType coffeeType) {
        return factory.createCoffee(coffeeType);
    }
}

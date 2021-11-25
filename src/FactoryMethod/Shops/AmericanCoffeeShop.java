package FactoryMethod.Shops;


import FactoryMethod.Coffee.*;
import FactoryMethod.Factory.*;

public class AmericanCoffeeShop extends CoffeeShop {

    private AmericanFactory factory;

    public AmericanCoffeeShop() {
        this.factory = new AmericanFactory();
    }

    @Override
    protected Coffee createCoffee(CoffeeType coffeeType) {
        return factory.createCoffee(coffeeType);
    }
}

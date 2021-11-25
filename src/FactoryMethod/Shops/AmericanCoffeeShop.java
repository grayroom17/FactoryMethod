package FactoryMethod.Shops;


import FactoryMethod.Coffee.Coffee;
import FactoryMethod.Coffee.CoffeeType;
import FactoryMethod.Factory.AmericanFactory;

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

package FactoryMethod.Shops;


import FactoryMethod.Coffee.*;
import FactoryMethod.Factory.*;


public class IndianCoffeeShop extends CoffeeShop {

    private IndianFactory factory;

    public IndianCoffeeShop() {
        this.factory = new IndianFactory();
    }

    @Override
    protected Coffee createCoffee(CoffeeType coffeeType) {
        return factory.createCoffee(coffeeType);
    }
}

package FactoryMethod.Shops;


import FactoryMethod.Coffee.Coffee;
import FactoryMethod.Coffee.CoffeeType;
import FactoryMethod.Factory.IndianFactory;


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

package FactoryMethod.Shops;


import FactoryMethod.Coffee.Coffee;
import FactoryMethod.Coffee.CoffeeType;
import FactoryMethod.Factory.ItalianFactory;

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

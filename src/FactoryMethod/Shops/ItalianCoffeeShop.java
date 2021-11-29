package FactoryMethod.Shops;


import FactoryMethod.Coffee.*;

public class ItalianCoffeeShop extends CoffeeShop {

    @Override
    protected Coffee createCoffee(CoffeeType coffeeType) {
        Coffee coffee = null;

        switch (coffeeType) {
            case AMERICANO:
                coffee = new ItalianAmericano();
                break;
            case ESPRESSO:
                coffee = new ItalianEspresso();
                break;
            case MOCHA:
                coffee = new ItalianMocha();
                break;
        }

        return coffee;
    }
}

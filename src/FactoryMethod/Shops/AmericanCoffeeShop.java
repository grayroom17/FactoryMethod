package FactoryMethod.Shops;


import FactoryMethod.Coffee.*;

public class AmericanCoffeeShop extends CoffeeShop {

    @Override
    protected Coffee createCoffee(CoffeeType coffeeType) {

        Coffee coffee = null;

        switch (coffeeType) {
            case AMERICANO:
                coffee = new AmericanAmericano();
                break;
            case ESPRESSO:
                coffee = new AmericanEspresso();
                break;
            case MOCHA:
                coffee = new AmericanMocha();
                break;
        }

        return coffee;

    }
}

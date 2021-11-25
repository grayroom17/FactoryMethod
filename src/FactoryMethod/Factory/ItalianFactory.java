package FactoryMethod.Factory;

import FactoryMethod.Coffee.*;

public class ItalianFactory {
    public Coffee createCoffee(CoffeeType coffeeType) {
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
        }

        return coffee;
    }


}

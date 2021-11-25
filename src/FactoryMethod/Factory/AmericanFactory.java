package FactoryMethod.Factory;

import FactoryMethod.Coffee.*;

public class AmericanFactory {

    public Coffee createCoffee(CoffeeType coffeeType){
        Coffee coffee = null;

        switch (coffeeType){
            case AMERICANO:
                coffee = new AmericanAmericano();
                break;
            case ESPRESSO:
                coffee = new AmericanEspresso();
                break;
            case MOCHA:
                coffee = new AmericanMocha();
        }

        return coffee;
    }
}

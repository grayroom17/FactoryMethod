package FactoryMethod.Factory;

import FactoryMethod.Coffee.*;

public class IndianFactory {
    public Coffee createCoffee(CoffeeType coffeeType){
        Coffee coffee = null;

        switch (coffeeType){
            case AMERICANO:
                coffee = new IndianAmericano();
                break;
            case ESPRESSO:
                coffee = new IndianEspresso();
                break;
            case MOCHA:
                coffee = new IndianMocha();
        }

        return coffee;
    }
}

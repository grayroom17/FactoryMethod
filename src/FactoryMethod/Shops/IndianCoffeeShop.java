package FactoryMethod.Shops;


import FactoryMethod.Coffee.*;

public class IndianCoffeeShop extends CoffeeShop {

    @Override
    protected Coffee createCoffee(CoffeeType coffeeType) {
        Coffee coffee = null;

        switch (coffeeType) {
            case AMERICANO:
                coffee = new IndianAmericano();
                break;
            case ESPRESSO:
                coffee = new IndianEspresso();
                break;
            case MOCHA:
                coffee = new IndianMocha();
                break;
        }

        return coffee;
    }
}

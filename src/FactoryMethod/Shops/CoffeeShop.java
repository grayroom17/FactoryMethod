package FactoryMethod.Shops;


import FactoryMethod.Coffee.*;

import java.util.Random;

public abstract class CoffeeShop extends Thread {

    public void orderCoffee(CoffeeType coffeeType) throws InterruptedException {

        Coffee coffee = createCoffee(coffeeType);
        coffee.grindCoffee();
        Thread.sleep(25);
        coffee.makeCoffee();
        Thread.sleep(25);
        coffee.pourIntoCup();
        Thread.sleep(25);
        coffee.serveCoffee();
        Thread.sleep(25);
        System.out.println();

    }

    protected abstract Coffee createCoffee(CoffeeType coffeeType);


    public void run() {
        Thread current = Thread.currentThread();
        try {
            while (!current.isInterrupted()) {
                synchronized (Coffee.class) {
                    orderCoffee(CoffeeType.values()[new Random().nextInt(CoffeeType.values().length)]);
                }
            }
        } catch (InterruptedException e) {
            current.interrupt();
        }

        System.out.println("Рабочий день в " + this.getClass().getSimpleName() + " закончился. Расходимся по домам");
    }
}

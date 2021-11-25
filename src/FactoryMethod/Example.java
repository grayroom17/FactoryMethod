package FactoryMethod;


import FactoryMethod.Coffee.*;
import FactoryMethod.Shops.*;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        AmericanCoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        ItalianCoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        IndianCoffeeShop indianCoffeeShop = new IndianCoffeeShop();

        americanCoffeeShop.start();
        italianCoffeeShop.start();
        indianCoffeeShop.start();
        Thread.sleep(5000);
        americanCoffeeShop.interrupt();
        italianCoffeeShop.interrupt();
        indianCoffeeShop.interrupt();
        americanCoffeeShop.join();
        italianCoffeeShop.join();
        indianCoffeeShop.join();

        System.out.println("Статистика продаж за прошедшие сутки.");
        System.out.println();

        System.out.println("Показатели кофейни в американском стиле:");
        System.out.println(String.format("Американо : %d шт.", AmericanAmericano.getCount()));
        System.out.println(String.format("Эспрессо : %d шт.", AmericanEspresso.getCount()));
        System.out.println(String.format("Мокко : %d шт.", AmericanMocha.getCount()));
        System.out.println(String.format("Всего : %d шт.", AmericanAmericano.getCount() +
                AmericanEspresso.getCount() + AmericanMocha.getCount()));
        System.out.println();

        System.out.println("Показатели кофейни в Итальянском стиле:");
        System.out.println(String.format("Американо : %d шт.", ItalianAmericano.getCount()));
        System.out.println(String.format("Эспрессо : %d шт.", ItalianEspresso.getCount()));
        System.out.println(String.format("Мокко : %d шт.", ItalianMocha.getCount()));
        System.out.println(String.format("Всего : %d шт.", ItalianAmericano.getCount() +
                ItalianEspresso.getCount() + ItalianMocha.getCount()));
        System.out.println();

        System.out.println("Показатели кофейни в Индусском стиле:");
        System.out.println(String.format("Американо : %d шт.", IndianAmericano.getCount()));
        System.out.println(String.format("Эспрессо : %d шт.", IndianEspresso.getCount()));
        System.out.println(String.format("Мокко : %d шт.", IndianMocha.getCount()));
        System.out.println(String.format("Всего : %d шт.", IndianAmericano.getCount() +
                IndianEspresso.getCount() + IndianMocha.getCount()));
        System.out.println();
    }
}

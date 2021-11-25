package FactoryMethod.Coffee;

public class IndianEspresso implements Coffee{
    private static int count = 0;

    public IndianEspresso() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void grindCoffee() {
        System.out.println("Перемалываем зерна для индусского эспрессо.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Варим индусский эспрессо.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Заливаем индусский эспрессо в кружку.");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Подаем индусский эспрессо к столу.");
        System.out.println("Приходие еще в нашу индусскую кофейню.");
    }
}

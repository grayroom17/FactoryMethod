package FactoryMethod.Coffee;

public class IndianMocha implements Coffee{
    private static int count = 0;

    public IndianMocha() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void grindCoffee() {
        System.out.println("Перемалываем зерна для индусского мокко.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Варим индусский мокко.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Заливаем индусский мокко в кружку.");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Подаем индусский мокко к столу.");
        System.out.println("Приходие еще в нашу индусскую кофейню.");
    }
}

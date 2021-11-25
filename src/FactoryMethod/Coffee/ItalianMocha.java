package FactoryMethod.Coffee;

public class ItalianMocha implements Coffee{
    private static int count = 0;

    public ItalianMocha() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void grindCoffee() {
        System.out.println("Перемалываем зерна для итальянского мокко.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Варим итальянское мокко.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Заливаем итальянское мокко в кружку.");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Подаем итальянский мокко к столу.");
        System.out.println("Приходие еще в нашу итальянскую кофейню.");
    }
}

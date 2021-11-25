package FactoryMethod.Coffee;

public class ItalianEspresso implements Coffee{
    private static int count = 0;

    public ItalianEspresso() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void grindCoffee() {
        System.out.println("Перемалываем зерна для итальянского эспрессо.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Варим итальянское эспрессо.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Заливаем итальянское эспреессо в кружку.");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Подаем итальянский эспрессо к столу.");
        System.out.println("Приходие еще в нашу итальянскую кофейню.");
    }
}

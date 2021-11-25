package FactoryMethod.Coffee;

public class AmericanEspresso implements Coffee{
    private static int count = 0;

    public AmericanEspresso() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void grindCoffee() {
        System.out.println("Перемалываем зерна для американского эспрессо.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Варим американское эспрессо.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Заливаем американское эспрессо в кружку.");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Подаем американский эспрессо к столу.");
        System.out.println("Приходие еще в нашу американскую кофейню.");
    }
}

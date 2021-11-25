package FactoryMethod.Coffee;

public class ItalianAmericano implements Coffee{
    private static int count = 0;

    public ItalianAmericano() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void grindCoffee() {
        System.out.println("Перемалываем зерна для итальянского американо.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Варим итальянское американо.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Заливаем итальянское американо в кружку.");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Подаем итальянский американо к столу.");
        System.out.println("Приходие еще в нашу итальянскую кофейню.");
    }
}

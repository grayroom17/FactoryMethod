package FactoryMethod.Coffee;

public class AmericanAmericano implements Coffee {
    private static int count = 0;

    public AmericanAmericano() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void grindCoffee() {
        System.out.println("Перемалываем зерна для американского американо.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Варим американское американо.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Заливаем американское американо в кружку.");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Подаем американский американо к столу.");
        System.out.println("Приходие еще в нашу американскую кофейню.");
    }
}

package FactoryMethod.Coffee;

public class AmericanMocha implements Coffee{
    private static int count = 0;

    public AmericanMocha() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void grindCoffee() {
        System.out.println("Перемалываем зерна для американского мокко.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Варим американское мокко.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Заливаем американское мокко в кружку.");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Подаем американский мокко к столу.");
        System.out.println("Приходие еще в нашу американскую кофейню.");
    }
}

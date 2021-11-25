package FactoryMethod.Coffee;

public class IndianAmericano implements Coffee{
    private static int count = 0;

    public IndianAmericano() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void grindCoffee() {
        System.out.println("Перемалываем зерна для индусского американо.");
    }

    @Override
    public void makeCoffee() {
        System.out.println("Варим индусский американо.");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Заливаем индусский американо в кружку.");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Подаем индусский американо к столу.");
        System.out.println("Приходие еще в нашу индусскую кофейню.");
    }
}

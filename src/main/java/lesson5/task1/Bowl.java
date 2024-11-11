package lesson5.task1;

public class Bowl {
    private int count = 100;

    public void addFood(int value) {
        count += value ;

        System.out.println();
        System.out.println("Добавили " + value + "гр корма");
    }

    public boolean someoneEating(int value) {
        if (count >= value) {
            count -= value;
            return true;
        }

        System.out.println();
        System.out.println("Не хватило еды в миске, пополните запасы методом addFood");
        return false;
    }
}

package lesson5.task1;

public class Main {
    public static void main(String[] args) {
        /*
            Часть первая. Бегаем и плаваем
        */

        Dog dogBobik = new Dog("Bobik");

        dogBobik.run(100);
        dogBobik.run(550);

        System.out.println();

        dogBobik.swim(5);
        dogBobik.swim(1000);

        System.out.println();

        Cat catLuna = new Cat("Luna");

        catLuna.run(150);
        catLuna.run(300);

        System.out.println();

        catLuna.swim(1);

        System.out.println();

        /*
            Часть вторая. Коты и миска
        */

        Bowl bowl = new Bowl();

        Cat[] cats = new Cat[3];

        cats[0] = new Cat("HungryCat1");
        cats[1] = new Cat("HungryCat2");
        cats[2] = new Cat("HungryCat3");

        for (Cat cat : cats) {
            if (bowl.someoneEating(cat.hungryCount)) {
                cat.eat();
            }
            System.out.println(cat.satiety ? cat.name + " - сытый котик" : cat.name + " - остался голодным");
        }

        bowl.addFood(80);
    }
}

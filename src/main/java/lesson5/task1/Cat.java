package lesson5.task1;

public class Cat extends Animal {
    private int maxRunDistance = 200;

    public boolean satiety = false;
    public int hungryCount = 45;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println(this.name + " не может пробежать больше, чем " + maxRunDistance + "м.");
        } else {
            System.out.println(this.name + " пробежал " + distance + "м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("котики не умеют плавать:)");
    }

    public void eat() {
        satiety = true;
    }
}

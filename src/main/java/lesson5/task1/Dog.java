package lesson5.task1;

public class Dog extends Animal {
    private int maxRunDistance = 500;
    private int maxSwimDistance = 10;

    public Dog(String name) {
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
        if (distance > maxSwimDistance) {
            System.out.println(this.name + " не может проплыть больше, чем " + maxSwimDistance + "м.");
        } else {
            System.out.println(this.name + " проплыл " + distance + "м.");
        }
    }
}

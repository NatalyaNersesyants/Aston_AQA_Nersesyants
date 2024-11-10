package lesson5.task1;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }
}

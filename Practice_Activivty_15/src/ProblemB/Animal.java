package ProblemB;

public class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void feedAnimal(int amount) {
        System.out.println(this.name + " the " + getClass().getSimpleName() + " ate " + calculateFoodAmount(amount) + " grams of food.");
    }

    protected double calculateFoodAmount(int amount) {
        return (double) amount / getFoodRatio();
    }

    protected int getFoodRatio() {
        return 1;
    }
}
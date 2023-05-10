package ProblemB;
public class Monkey extends Animal {
    public Monkey(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    protected int getFoodRatio() {
        return 15;
    }
}

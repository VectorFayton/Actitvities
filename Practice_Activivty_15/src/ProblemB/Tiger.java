package ProblemB;

public class Tiger extends Animal {
    public Tiger(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    protected int getFoodRatio() {
        return 5;
    }
}
package ProblemB;

class Bear extends Animal {
    public Bear(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    protected int getFoodRatio() {
        return 10;
    }
}

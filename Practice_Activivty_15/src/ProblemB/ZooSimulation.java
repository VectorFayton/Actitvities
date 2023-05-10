package ProblemB;

public class ZooSimulation {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("Simba", 10, 150),
                new Tiger("Rajah", 8, 200),
                new Bear("Baloo", 5, 300),
                new Monkey("Abu", 2, 10)
        };

        for (Animal animal : animals) {
            animal.feedAnimal(100);
        }
    }
}

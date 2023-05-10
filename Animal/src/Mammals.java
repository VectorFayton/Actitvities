public class Mammals extends Animal{

    public Mammals (String name)
    {
        super(name);
    }

    @Override
    public String toString() {
        String Mammal = "Mammal[" + super.toString()+ "]";
        return Mammal;
    }
}

public class Dog extends Mammals
{
    public Dog(String name) {
        super(name);
    }

    public void greets(Dog another)
    {
        System.out.println("wooooof");
    }
    public void greets()
    {
        System.out.println("woof");
    }
    @Override
    public String toString() {
        String Dog = "Dog[" + super.toString()+ "]";
        return Dog;
    }
}
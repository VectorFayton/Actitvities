public class Cat extends Mammals
{
    public Cat(String name) {
        super(name);
    }

    public void greets()
    {
        System.out.println("meow");
    }
    @Override
    public String toString() {
        String Cat = "Cat[" + super.toString()+ "]";
        return Cat;
    }
}

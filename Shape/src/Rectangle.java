import java.util.Random;

public class Rectangle extends Shape{
    double width = 1.0f;
    double length = 1.0f;

    public Rectangle()
    {}

    public Rectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }


}

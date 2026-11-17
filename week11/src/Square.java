abstract class Shape{
    double height;
    double width;

    Shape(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    public double getArea()
    {
        return 0.0;
    }
    public double getPerimeter()
    {
        return 0.0;
    }
}

class Circle extends Shape {
    double PI = 3.1415926585;

    Circle(double radius)
    {
        super(radius, radius);
    }

    @Override
    public double getArea()
    {
        return PI * this.height * this.height;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * PI  * this.height;
    }
}

public class Square extends Shape {

    Square(double height, double width)
    {
        super(height, width);
    }

    @Override
    public double getArea()
    {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (this.height + this.width);
    }
}
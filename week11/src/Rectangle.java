interface Ishape{
    public double getArea();
    public double getPerimeter();
}

class Rectangle{
    protected double width;
    protected double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return this.width; }
    public double getHeight() { return this.height; }
}

class Squares extends Rectangle implements Ishape{
    public Squares(double width, double height)
    {
        super(width,height);
    }

    @Override
    public double getArea()
    {
        return getWidth() * getHeight();
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (getWidth() + getHeight());
    }
}
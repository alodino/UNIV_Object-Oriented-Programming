/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class ARectangle extends AbstractShape {
    private double width, height;

    public ARectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() { return width * height; }
    @Override
    public double getPerimeter() { return 2 * (width + height); }
}

class ACircle extends AbstractShape {
    private double radius;

    public ACircle(double radius) { this.radius = radius; }
    @Override
    public double getArea() { return Math.PI * radius * radius; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
}
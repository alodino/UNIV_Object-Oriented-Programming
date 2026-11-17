/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class ShapeAreaAndPerimeter {
    public static void main(String[] args) {
        AbstractShape[] shapes = new AbstractShape[2];

        shapes[0] = new ARectangle(100, 50);
        shapes[1] = new ACircle(50);
        // 버전 1 코드
        for (AbstractShape shape : shapes) {
            if (shape instanceof ARectangle) {
                ARectangle ar = (ARectangle) shape;
                System.out.printf("%s area: %.2f\n",
                        ar.getClass(), ar.getArea());
            }
            else if (shape instanceof ACircle) {
                ACircle ac = (ACircle) shape;
                System.out.printf("%s area: %.2f\n",
                        ac.getClass(), ac.getArea());
            }
        }

        // 버전 2 코드
        for (AbstractShape shape : shapes) {
            System.out.printf("%s area: %.2f\n",
                    shape.getClass(), shape.getArea());
        }
    }
}
package deTelranTitovsGermans.cw2.Shapes;

public class Square extends Shape {
    private int size;

    public Square(int size) {
        super("квадрат");
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println("рисуем квадрат");
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }

}

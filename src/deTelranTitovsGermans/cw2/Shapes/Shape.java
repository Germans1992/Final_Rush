package deTelranTitovsGermans.cw2.Shapes;

public abstract class Shape {
    protected String type;


    public Shape(String type) {
        this.type = type;
    }

    public Shape() {
    }

    public abstract void draw();

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Shape: " + type;
    }
}

package ua.hillellit.lms.model.figure;

public class Square implements Areaable {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

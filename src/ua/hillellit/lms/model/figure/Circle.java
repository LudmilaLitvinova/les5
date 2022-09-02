package ua.hillellit.lms.model.figure;

public class Circle implements Areaable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


}

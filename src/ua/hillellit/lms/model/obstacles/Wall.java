package ua.hillellit.lms.model.obstacles;

public class Wall implements Obstacles {
    private String type;
    private int height;

    public Wall(String type, int height) {
        this.type = type;
        this.height = height;
    }

    @Override
    public void overcome() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

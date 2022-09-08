package ua.hillellit.lms.model.obstacles;

import ua.hillellit.lms.model.members.Memberable;

public class Wall implements Obstacles {
    private String type;
    private int height;

    public Wall(String type, int height) {
        this.type = type;
        this.height = height;
    }

    @Override
    public boolean overcome(Memberable member) {
        return member.jump(this);
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

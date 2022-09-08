package ua.hillellit.lms.model.obstacles;

import ua.hillellit.lms.model.members.Memberable;

public class Racetrack implements Obstacles {
    private String type;
    private int length;

    public Racetrack(String type, int length) {
        this.type = type;
        this.length = length;
    }

    @Override
    public boolean overcome(Memberable member) {
        return member.run(this);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

package ua.hillellit.lms.model.members;

import ua.hillellit.lms.model.obstacles.Racetrack;
import ua.hillellit.lms.model.obstacles.Wall;

public class Robot implements Memberable {
    private String name;
    private final int maxHeight = 10;
    private final int maxLength = 1560;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public boolean run(Racetrack obs) {
        if (((Racetrack) obs).getLength() <= maxLength) {
            System.out.println("Учасник " + name + " пройшов перешкоду " + obs.getType() +
                    " на дистанції " + obs.getLength());
            return true;
        } else {
            System.out.println("Учасник " + name + " не пройшов перешкоду " + obs.getType() +
                    " на дистанції. Пройдено " + maxLength);
            return false;
        }
    }

    @Override
    public boolean jump(Wall obs) {
        if (((Wall) obs).getHeight() <= maxHeight) {
            System.out.println("Учасник " + name + " пройшов перешкоду " + obs.getType() +
                    " на дистанції " + obs.getHeight());
            return true;
        } else {
            System.out.println("Учасник " + name + " не пройшов перешкоду " + obs.getType() +
                    " на дистанції. Пройдено " + maxHeight);
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxLength() {
        return maxLength;
    }

}
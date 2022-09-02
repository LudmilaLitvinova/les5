package ua.hillellit.lms.model.members;

import ua.hillellit.lms.model.obstacles.Obstacles;
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
    public boolean run(Obstacles obs) {
        if (obs.getClass() == Racetrack.class) {
            if (((Racetrack) obs).getLength() <= maxLength) {
                System.out.println("Учасник " + name + " пройшов перешкоду " + ((Racetrack) obs).getType() +
                        " на дистанції " + ((Racetrack) obs).getLength());
            } else {
                System.out.println("Учасник " + name + " не пройшов перешкоду " + ((Racetrack) obs).getType() +
                        " на дистанції. Пройдено " + maxLength);
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean jump(Obstacles obs) {
        if (obs.getClass() == Wall.class) {
            if (((Wall) obs).getHeight() <= maxHeight) {
                System.out.println("Учасник " + name + " пройшов перешкоду " + ((Wall) obs).getType() +
                        " на дистанції " + ((Wall) obs).getHeight());
            } else {
                System.out.println("Учасник " + name + " не пройшов перешкоду " + ((Wall) obs).getType() +
                        " на дистанції. Пройдено " + maxHeight);
                return false;
            }
        }
        return true;
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
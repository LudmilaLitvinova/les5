package ua.hillellit.lms.model.members;

import ua.hillellit.lms.model.obstacles.Racetrack;
import ua.hillellit.lms.model.obstacles.Wall;

public interface Memberable {
    boolean run(Racetrack obs);

    boolean jump(Wall obs);
}

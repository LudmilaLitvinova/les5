package ua.hillellit.lms.model.members;

import ua.hillellit.lms.model.obstacles.Obstacles;

public interface Memberable {
    boolean run(Obstacles obs);

    boolean jump(Obstacles obs);
}

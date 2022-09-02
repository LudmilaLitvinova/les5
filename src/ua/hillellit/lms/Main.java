package ua.hillellit.lms;

import ua.hillellit.lms.model.figure.Areaable;
import ua.hillellit.lms.model.figure.Circle;
import ua.hillellit.lms.model.figure.Square;
import ua.hillellit.lms.model.figure.Triangle;
import ua.hillellit.lms.model.members.Cat;
import ua.hillellit.lms.model.members.Human;
import ua.hillellit.lms.model.members.Memberable;
import ua.hillellit.lms.model.members.Robot;
import ua.hillellit.lms.model.obstacles.Obstacles;
import ua.hillellit.lms.model.obstacles.Racetrack;
import ua.hillellit.lms.model.obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Circle cr1 = new Circle(3);
        System.out.print("Площа кола: ");
        System.out.printf("%.2f\n",cr1.calculateArea());

        Square sq1 = new Square(4);
        System.out.print("Площа квадрата: ");
        System.out.printf("%.2f\n",sq1.calculateArea());

        Triangle tr1 = new Triangle(2, 3, 4);
        System.out.print("Площа трикутника: ");
        System.out.printf("%.2f\n",tr1.calculateArea());

        Areaable[] array = {cr1, sq1, tr1};
        System.out.print("Площа усіх фігур: ");
        System.out.printf("%.2f\n",getAllAreas(array));

        Obstacles[] obstacles = {new Wall("Цегляна стіна", 2), new Racetrack("RK45566", 567)};

        Memberable[] members = {new Cat("Мурзик"), new Human("Вася"), new Robot("Вердер")};

        for (Memberable member : members) {
            boolean response;
            for (Obstacles obs : obstacles) {
                if (obs.getClass() == Racetrack.class) {
                    response = member.run(obs);

                } else {
                    response = member.jump(obs);
                }
                if (!response)
                    break;
            }
        }

    }

    public static double getAllAreas(Areaable[] array) {
        double totalAreas = 0.0;
        for (Areaable figure : array) {
            totalAreas += figure.calculateArea();
        }
        return totalAreas;
    }

}
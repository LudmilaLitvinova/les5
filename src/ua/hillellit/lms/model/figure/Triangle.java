package ua.hillellit.lms.model.figure;

public class Triangle implements Areaable {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {

        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideC + sideB > sideA)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("Сторони трикутника задані невірно");
        }
    }
    @Override
    public double calculateArea() {

        double p=((double) sideA+sideB+sideC)/2;
        double s = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));

        return s;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
}

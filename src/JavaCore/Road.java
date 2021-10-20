package JavaCore;

public class Road {
    private double length;

    public Road(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTimeToOvercomePool(CanSwim swimmer) {
        return swimmer.go(this);
    }
}
